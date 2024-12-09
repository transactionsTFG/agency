package common.dto.airlinemta;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ReservationDTO {
    private long id;
    private String date;
    private double total;
    private long idCustomer;
    private boolean active;
}
