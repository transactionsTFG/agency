package ucm.tfg.agency.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import ucm.tfg.agency.business.BookingAS;

@Configuration
public class BookingConfiguration {

    @Bean
    public Jaxb2Marshaller bookingMarshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in
        // pom.xml
        marshaller.setContextPath("ucm.tfg.agency.soap");
        return marshaller;
    }

    @Bean
    public BookingAS BookingAS(Jaxb2Marshaller marshaller) {
        BookingAS booking = new BookingAS();
        booking.setDefaultUri("http://localhost:8080/hotelMTA/ws/");
        booking.setMarshaller(marshaller);
        booking.setUnmarshaller(marshaller);
        return booking;
    }

}