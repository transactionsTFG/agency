package ucm.tfg.agency.common.dto.reservation;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.airline.IdFlightInstanceWithSeatsV2DTO;

@Data
@AllArgsConstructor
public class CreateReservationDTO {
    private long idUser;
    private CustomerDTO customer;
    private InfoReservation infoReservation;
    public CreateReservationDTO(CreateAirlineReservationDTO airline, CreateBookingReservationDTO hotel, AuthUser authUser) {
        this.idUser = authUser.getId();
        this.customer = new CustomerDTO(authUser);
        this.infoReservation = new InfoReservation(airline, hotel);
    }
    @Data
    @AllArgsConstructor
    private static class CustomerDTO {
        private String name;
        private String email;
        private String dni;
        private String phone;
        public CustomerDTO(AuthUser user) {
            this.name = user.getName();
            this.email = user.getEmail();
            this.dni = user.getSurname();
            this.phone = user.getPhone();
        }
    }

    @Data
    @AllArgsConstructor
    private static class InfoReservation {
        private String startDate;
        private String endDate;
        private int numberOfNights;
        private boolean withBreakfast;
        private int peopleNumber;
        private List<Long> roomIds;
        private List<IdFlightInstanceWithSeatsV2DTO> flightInstances;
        public InfoReservation(CreateAirlineReservationDTO airline, CreateBookingReservationDTO hotel) {
            this.startDate = hotel.getStartDate();
            this.endDate = hotel.getEndDate();
            this.numberOfNights = hotel.getNumberOfNights();
            this.withBreakfast = hotel.isWithBreakfast();
            this.peopleNumber = hotel.getPeopleNumber();
            this.roomIds = hotel.getRoomId();
            this.flightInstances = airline.getListIdFlightInstanceSeats().stream().map(
                fi -> new IdFlightInstanceWithSeatsV2DTO(fi.getIdFlightInstance(), fi.getSeats())
            ).toList();
            
        }
    }
}
