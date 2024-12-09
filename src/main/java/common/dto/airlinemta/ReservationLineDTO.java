package common.dto.airlinemta;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReservationLineDTO {
    private long flightInstanceId;
    private int passengerCount;
    private long reservationId;
}
