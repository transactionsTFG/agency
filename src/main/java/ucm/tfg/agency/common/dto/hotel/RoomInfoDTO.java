package ucm.tfg.agency.common.dto.hotel;

import lombok.Data;

@Data
public class RoomInfoDTO {
    private long id;
    private int number;
    private boolean occupied;
    private boolean singleBed;
    private boolean active;
    private int peopleNumber;
    private String hotelName;
    private String countryName;
}
