package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ucm.tfg.agency.common.dto.airline.FlightInstanceV2DTO;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ListFlightHotelDTOV2 {
    private List<FlightInstanceV2DTO> listFlight;
    private List<RoomListDTO> listHotel;
}
