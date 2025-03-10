package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.Data;

@Data
public class UpdateAirlineReservationDTO {
    private long idReservation;
    private List<IdFlightInstanceWithSeatsDTO> listIdFlightInstanceSeats;
}
