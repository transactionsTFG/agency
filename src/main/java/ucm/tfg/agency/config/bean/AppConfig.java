package ucm.tfg.agency.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import ucm.tfg.agency.common.enums.TypeService;

@Configuration
public class AppConfig {
    
    @Bean
    public BusinessDelegate businessLookup() {
        return new BusinessDelegate(TypeService.MSA);
    }

}
