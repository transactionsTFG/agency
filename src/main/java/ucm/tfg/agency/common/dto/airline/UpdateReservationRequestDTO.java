package ucm.tfg.agency.common.dto.airline;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;

@Data
@NoArgsConstructor
public class UpdateReservationRequestDTO {
    private long idTravel;
    private long idReservation;
    private List<IdFlightInstanceWithSeatsV2DTO> flightInstanceSeats;

    public UpdateReservationRequestDTO(long idTravel, long idReservation, List<IdFlightInstanceWithSeatsDTO> listFlightInstances) {
        this.idTravel = idTravel;
        this.idReservation = idReservation;
        this.flightInstanceSeats = listFlightInstances.stream()
            .map(fi -> new IdFlightInstanceWithSeatsV2DTO(fi.getIdFlightInstance(), fi.getSeats()))
            .toList();
    }

}
