package common.dto.airlinemta;

import lombok.Builder;
import lombok.Data;

@Data
@Builder    
public class MakeReservationDTO {
    private CustomerDTO customer;
    private ReservationDTO reservation;
    private long idFlight;
    private int numberOfSeats;
}
