package ucm.tfg.agency.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import ucm.tfg.agency.AgencyApplication;
import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.auth.AuthService;

@Configuration
@EnableWebSecurity
@AllArgsConstructor
public class SecurityConfig {
 
    private final AuthService authService;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, AuthenticationProvider customAuthenticationProvider) throws Exception {
        http
                .authenticationProvider(customAuthenticationProvider)
                .sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.ALWAYS))
                .csrf(
                        csfr -> csfr.csrfTokenRepository(new HttpSessionCsrfTokenRepository())
                )
                .authorizeHttpRequests(auth -> auth
                                .requestMatchers("/index", "/", "/search/hotel", "/search/flight", "/search/hotelAndFlight").permitAll()
                                .requestMatchers("/about").permitAll()
                                .requestMatchers("/offers/**").permitAll()
                                .requestMatchers("css/**", "js/**", "img/**", "fonts/**", "plugins/**", "vendor/**").permitAll()
                                .anyRequest().authenticated()                   //Todas las demas rutas estan protegidas
                )
                .formLogin(login -> login
                                .loginPage("/auth")                             //Login personalizado, pasa primero por el controlador
                                .loginProcessingUrl("/auth")                    //Donde se enviara las crendiales es decir el formulario una peticion POST
                                .usernameParameter("email")
                                .passwordParameter("password")
                                .defaultSuccessUrl("/index", true)
                                .permitAll()
                ).logout(logut -> logut
                                //.logoutUrl("/logout")
                                .logoutRequestMatcher(new AntPathRequestMatcher("/logout", "GET"))
                                .logoutSuccessUrl("/index")
                                .deleteCookies("JSESSIONID")
                                .permitAll()
                );
        return http.build();
    }

    @Bean
    public AuthenticationProvider customAuthenticationProvider() {
        return new AuthProviderCustom(this.authService);
    }
    
}
