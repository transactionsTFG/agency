package ucm.tfg.agency.common.dto.reservation;

import java.util.List;

import lombok.Data;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.airline.IdFlightInstanceWithSeatsV2DTO;

@Data
public class SuperReservationDTO {
    private long idTravel;
    private long idReservation;
    private long bookingId;
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private List<Long> roomsInfo;
    private List<IdFlightInstanceWithSeatsV2DTO> listIdFlightInstanceSeats;
    public SuperReservationDTO(long idTravel, UpdateBookingReservationDTO dtoBokk, UpdateAirlineReservationDTO dtoAirline){
        this.idTravel = idTravel;
        this.idReservation = dtoAirline.getIdReservation();
        this.bookingId = dtoBokk.getId();
        this.startDate = dtoBokk.getStartDate();
        this.endDate = dtoBokk.getEndDate();
        this.numberOfNights = dtoBokk.getNumberOfNights();
        this.withBreakfast = dtoBokk.isWithBreakfast();
        this.peopleNumber = dtoBokk.getPeopleNumber();
        this.roomsInfo = dtoBokk.getRoomId();
        this.listIdFlightInstanceSeats = dtoAirline.getListIdFlightInstanceSeats().stream().map(
            f -> new IdFlightInstanceWithSeatsV2DTO(f.getIdFlightInstance(), f.getSeats())
        ).toList();
    }
}
