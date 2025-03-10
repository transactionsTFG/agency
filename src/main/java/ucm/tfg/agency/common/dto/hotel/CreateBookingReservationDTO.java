package ucm.tfg.agency.common.dto.hotel;

import java.util.List;

import lombok.Data;

@Data
public class CreateBookingReservationDTO {
    private long customerId;
    private String endDate;
    private int numberOfNights;
    private int peopleNumber;
    private List<Long> roomId;
    private String startDate;
    private boolean withBreakfast;
}
