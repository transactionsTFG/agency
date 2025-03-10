package ucm.tfg.agency.common.dto.hotel;

import lombok.Data;

@Data
public class RoomDTO {
    private boolean available;
    private double dailyPrice;
    private long hotelId;
    private long id;
    private int number;
    private int peopleNumber;
    private boolean singleBed;
}
