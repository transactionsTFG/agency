package ucm.tfg.agency.common.dto.agency;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RoomListDTO {
    private long id;
    private int number;
    private boolean occupied;
    private boolean singleBed;
    private boolean active;
    private int peopleNumber;
    private String hotelName;
    private String countryName;
}
