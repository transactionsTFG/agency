package ucm.tfg.agency.common.dto.airline;

import java.time.LocalDate;

import lombok.Data;

@Data
public class FlightInstanceAirlineDTO {
    private boolean active;
    private LocalDate arrivalDate;
    private LocalDate departureDate;
    private long id;
    private long idFlight;
    private int passengerCounter;
    private double price;
    private String statusFlight;
}
