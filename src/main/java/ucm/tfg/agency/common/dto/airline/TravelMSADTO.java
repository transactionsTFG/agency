package ucm.tfg.agency.common.dto.airline;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class TravelMSADTO {
    private boolean active;
    private Double cost;
    private LocalDateTime date;
    private LocalDateTime dateCreation;
    private Double flightCost;
    private Long flightReservationID;
    private Double hotelCost;
    private Long hotelReservationID;
    private Long id;
    private Integer passengerCounter;
    private LocalDateTime returnDate;
    private String sagaId;
    private String sagaPhases;
    private String status;
    private Integer transactionActive;
    private Long userId;
}
