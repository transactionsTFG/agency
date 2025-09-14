package ucm.tfg.agency.common.dto.agency;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import ucm.tfg.agency.common.auth.AuthUser;

@Data
public class CreateBookingReservationV2DTO {
    private String startDate;
    private String endDate;
    private int numberOfNights;
    private boolean withBreakfast;
    private int peopleNumber;
    private List<Long> roomIds;
    private CustomerDTO customer;
    private Long userId;

    public CreateBookingReservationV2DTO(CreateBookingReservationDTO booking, AuthUser authUser) {
        this.startDate = booking.getStartDate();
        this.endDate = booking.getEndDate();
        this.numberOfNights = booking.getNumberOfNights();
        this.withBreakfast = booking.isWithBreakfast();
        this.peopleNumber = booking.getPeopleNumber();
        this.roomIds = booking.getRoomId();
        this.userId = authUser.getId();
        this.customer = new CustomerDTO(authUser);
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
}
