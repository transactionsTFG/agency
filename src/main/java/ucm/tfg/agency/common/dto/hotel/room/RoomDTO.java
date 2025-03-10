package ucm.tfg.agency.common.dto.hotel.room;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoomDTO {
    private long id;
    private double dailyPrice;
    private int number;
    private int peopleNumber;
    private boolean singleBed;
    private String hotelName;
}
