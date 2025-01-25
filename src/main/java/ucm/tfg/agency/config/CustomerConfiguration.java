package ucm.tfg.agency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import ucm.tfg.agency.business.CustomerAS;

@Configuration
public class CustomerConfiguration {

    @Bean
    public Jaxb2Marshaller customerMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ucm.tfg.agency.soap");
        return marshaller;
    }

    @Bean
    public CustomerAS CustomerAS(Jaxb2Marshaller marshaller) {
        CustomerAS customer = new CustomerAS();
        customer.setDefaultUri("http://localhost:8080/hotelMTA/ws/");
        customer.setMarshaller(marshaller);
        customer.setUnmarshaller(marshaller);
        return customer;
    }

}