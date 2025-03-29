package ucm.tfg.agency.common.dto.agency;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdFlightInstanceWithSeatsDTO {
    private long idFlightInstance;
    private int seats;
}
