package ucm.tfg.agency.common.dto.agency;

import lombok.Data;

@Data
public class FlightHotelDTO {
    private BookingDTO booking;
    private ReservationDTO reservation;
}
