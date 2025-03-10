package ucm.tfg.agency.common.dto.agency;
import lombok.Data;

@Data
public class BookingDTO {
    private long id;
    private boolean withBreakfast;
    private int peopleNumber;
    private long customerId;
    private boolean available;
    private double totalPrice;
}
