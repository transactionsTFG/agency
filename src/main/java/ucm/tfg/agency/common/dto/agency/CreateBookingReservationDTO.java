package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.Data;

@Data
public class CreateBookingReservationDTO {
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private long customerId;
    private List<Long> roomId;
}
