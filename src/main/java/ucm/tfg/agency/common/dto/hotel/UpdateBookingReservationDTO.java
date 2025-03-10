package ucm.tfg.agency.common.dto.hotel;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import lombok.Data;

@Data
public class UpdateBookingReservationDTO {
    private long customerId;
    private String endDate;
    private long id;
    private int numberOfNights;
    private int peopleNumber;
    private List<Long> roomId;
    private String startDate;
    private boolean withBreakfast;
}
