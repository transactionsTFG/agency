package ucm.tfg.agency.common.dto.agency;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TravelDTO {    
    private long id;
    private long userId;
    private String date;
    private String returnDate;
    private int passengerCounter;
    private double cost;
    private String status;
    private long flightReservationID;
    private long hotelReservationID;
    private double flightCost;
    private double hotelCost;
    private boolean active;
    private LocalDateTime dateCreation;
}
