package ucm.tfg.agency.common.dto.agency;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FlightListDTO {
    private long id;
    private String arrivalTime;
    private String departureTime;
    private String cityDestination;
    private String countryOrigin;
    private String countryDestination;
    private String weekDay;
}
