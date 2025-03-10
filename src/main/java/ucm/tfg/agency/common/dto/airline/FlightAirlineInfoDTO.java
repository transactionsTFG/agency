package ucm.tfg.agency.common.dto.airline;

import lombok.Data;

@Data
public class FlightAirlineInfoDTO {
    private long id;
    private String arrivalTime;
    private String departureTime;
    private String cityDestination;
    private String countryOrigin;
    private String countryDestination;
    private String weekDay;
}
