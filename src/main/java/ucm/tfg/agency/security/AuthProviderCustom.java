package ucm.tfg.agency.security;


import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.auth.AuthService;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;

@Configuration
@AllArgsConstructor
public class AuthProviderCustom implements AuthenticationProvider { //Se llama /auth, contenedor de logeo manejado por Spring Security
    private final AuthService authService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        final String email = authentication.getName();
        final String password = authentication.getCredentials().toString();
        Result<ReponseUserDTO> response = this.authService.login(new LoginUserDTO(email, password));
        if (!response.isSuccess()) 
            throw new BadCredentialsException(response.getMessage());
        return new UsernamePasswordAuthenticationToken(new AuthUser(response.getData()), password, Set.of(new SimpleGrantedAuthority(response.getData().getType())));
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

   
    
}
