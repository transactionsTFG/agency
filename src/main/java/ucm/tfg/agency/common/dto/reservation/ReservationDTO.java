package ucm.tfg.agency.common.dto.reservation;

import java.util.List;

import lombok.Data;
import ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO;

@Data
public class ReservationDTO {
    private ucm.tfg.agency.common.dto.agency.ReservationDTO reservation;
    private List<IdFlightInstanceWithSeatsDTO> lines;
}
