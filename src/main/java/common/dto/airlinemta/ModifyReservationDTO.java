package common.dto.airlinemta;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ModifyReservationDTO {
    private ReservationDTO reservationDTO;
    private ReservationLineDTO reservationLineDTO;
}
