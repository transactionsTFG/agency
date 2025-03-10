package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.Data;

@Data
public class SuccessReservationAgencyDTO {
    private long idReservation;
    private long idBooking;
    private String dateReservation;
    private double totalReservation;
    private List<StatusFlightDTO> statusFlightsDTO;
}
