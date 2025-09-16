package ucm.tfg.agency.common.dto.airline;
  
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;
@Data
public class ReservationMSADTO {
    private List<FlightLineDTO> lines;
    private ReservationDTO reservation;

    @Data
    public static class FlightLineDTO {
        private boolean active;
        private Long flightInstanceId;
        private Long idReservation;
        private int passengers;
        private Double price;
    }

    @Data
    public static class ReservationDTO {
        private boolean active;
        private LocalDateTime createdAt;
        private Long customerId;
        private Long id;
        private String sagaId;
        private String statusSaga;
        private Double total;
    }

}
