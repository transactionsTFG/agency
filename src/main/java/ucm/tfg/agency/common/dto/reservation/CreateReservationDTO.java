package ucm.tfg.agency.common.dto.reservation;

import lombok.AllArgsConstructor;
import lombok.Data;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;

@Data
@AllArgsConstructor
public class CreateReservationDTO {
    private CreateAirlineReservationDTO airlineReservation;
    private CreateBookingReservationDTO hotelReservation;
}
