package common.dto.airlinemta;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class FlightDTO {
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
