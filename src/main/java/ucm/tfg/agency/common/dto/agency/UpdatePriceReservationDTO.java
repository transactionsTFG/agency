package ucm.tfg.agency.common.dto.agency;

import lombok.Data;

@Data
public class UpdatePriceReservationDTO {
    private long idFlightInstance;
    private double price;   
}
