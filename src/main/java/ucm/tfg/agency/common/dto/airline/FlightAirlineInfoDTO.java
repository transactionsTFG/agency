package ucm.tfg.agency.common.dto.airline;

import lombok.Data;

@Data
public class FlightAirlineInfoDTO {
    private long id;
    private String arrivalDate;
    private String departureDate;
    private String cityDestination;
    private String countryOrigin;
    private String countryDestination;
    private String weekDay;
    private double price;
}
