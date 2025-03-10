package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListFlightHotelDTO {
    private List<FlightListDTO> listFlight;
    private List<RoomListDTO> listHotel;
}
