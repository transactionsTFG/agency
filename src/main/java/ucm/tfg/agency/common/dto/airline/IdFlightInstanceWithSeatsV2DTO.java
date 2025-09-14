package ucm.tfg.agency.common.dto.airline;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdFlightInstanceWithSeatsV2DTO {
    private long idFlightInstance;
    private int numberSeats;
}
