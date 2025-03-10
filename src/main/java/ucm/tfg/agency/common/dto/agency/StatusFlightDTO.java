package ucm.tfg.agency.common.dto.agency;

import lombok.Data;

@Data
public class StatusFlightDTO {
    private String status;
    private String returnDate;
    private int seats;
    private double price;
}
