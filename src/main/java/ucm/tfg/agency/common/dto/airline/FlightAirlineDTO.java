package ucm.tfg.agency.common.dto.airline;

import lombok.Data;

@Data
public class FlightAirlineDTO {
    private long id;
    private String codeFlight;
    private String weekDay;
    private String arrivalTime;
    private String departureTime;
    private long idAircraft;
    private long idOriginFlight;
    private long idDestinationFlight;
    private boolean active;
}
