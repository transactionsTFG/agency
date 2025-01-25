package ucm.tfg.agency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import ucm.tfg.agency.business.RoomAS;

@Configuration
public class RoomConfiguration {

    @Primary
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ucm.tfg.agency.soap");
        return marshaller;
    }

    @Bean
    public RoomAS roomAS(Jaxb2Marshaller marshaller) {
        RoomAS room = new RoomAS();
        room.setDefaultUri("http://localhost:8080/hotelMTA/ws/");
        room.setMarshaller(marshaller);
        room.setUnmarshaller(marshaller);
        return room;
    }

}