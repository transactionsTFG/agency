package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBookingReservationV2DTO {    
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private long bookingId;
    private long travelId;
    private List<Long> roomsInfo;
    public UpdateBookingReservationV2DTO(long travelId, UpdateBookingReservationDTO booking) {
        this.startDate = booking.getStartDate();
        this.endDate = booking.getEndDate();
        this.numberOfNights = booking.getNumberOfNights();
        this.withBreakfast = booking.isWithBreakfast();
        this.peopleNumber = booking.getPeopleNumber();
        this.bookingId = booking.getId();
        this.travelId = travelId;
        this.roomsInfo = booking.getRoomId();
    }
}
