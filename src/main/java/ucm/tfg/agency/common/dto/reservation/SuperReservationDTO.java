package ucm.tfg.agency.common.dto.reservation;

import java.util.List;

import lombok.Data;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;

@Data
public class SuperReservationDTO {
    private long id;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private long customerId;
    private List<Long> roomId;
    private long idReservation;
    private List<IdFlightInstanceWithSeatsDTO> listIdFlightInstanceSeats;
    public SuperReservationDTO(UpdateBookingReservationDTO dtoBokk, UpdateAirlineReservationDTO dtoAirline){
        this.id = dtoBokk.getId();
        this.startDate = dtoBokk.getStartDate();
        this.endDate = dtoBokk.getEndDate();
        this.numberOfNights = dtoBokk.getNumberOfNights();
        this.withBreakfast = dtoBokk.isWithBreakfast();
        this.peopleNumber = dtoBokk.getPeopleNumber();
        this.customerId = dtoBokk.getCustomerId();
        this.roomId = dtoBokk.getRoomId();
        this.idReservation = dtoAirline.getIdReservation();
        this.listIdFlightInstanceSeats = dtoAirline.getListIdFlightInstanceSeats();
    }
}
