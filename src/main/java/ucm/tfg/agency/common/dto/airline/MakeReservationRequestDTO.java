package ucm.tfg.agency.common.dto.airline;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;

@Data
@NoArgsConstructor
public class MakeReservationRequestDTO {
    private String dni;
    private long idUser;
    private List<IdFlightInstanceWithSeatsV2DTO> listIdFlightInstanceSeats;

    public MakeReservationRequestDTO(String dni, long idUser, List<IdFlightInstanceWithSeatsDTO> listFlightInstances) {
        this.dni = dni;
        this.idUser = idUser;
        this.listIdFlightInstanceSeats = listFlightInstances.stream()
            .map(fi -> new IdFlightInstanceWithSeatsV2DTO(fi.getIdFlightInstance(), fi.getSeats()))
            .toList();
    }
    
}
