package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CreateAirlineReservationDTO {
    private String dni;
    private long idCustomer;
    private List<IdFlightInstanceWithSeatsDTO> listIdFlightInstanceSeats;
}
