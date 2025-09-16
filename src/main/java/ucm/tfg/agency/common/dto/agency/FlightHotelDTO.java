package ucm.tfg.agency.common.dto.agency;

import lombok.Data;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineMSAService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMSAService;
import ucm.tfg.agency.common.dto.airline.TravelMSADTO;
import ucm.tfg.agency.common.dto.patternresult.Result;

@Data
public class FlightHotelDTO {
    private BookingDTO booking;
    private ReservationDTO reservation;

    public FlightHotelDTO(HotelMSAService msaService, AirlineMSAService airlineMSAService ,TravelMSADTO msa) {
        BookingDTO booking = new BookingDTO();
        Result<ucm.tfg.agency.common.dto.agency.BookingDTO> result = msaService.getHotelBooking(msa.getHotelReservationID());
        ucm.tfg.agency.common.dto.agency.ReservationDTO result2 = airlineMSAService.getFlightReservation(msa.getFlightReservationID());
        booking.setWithBreakfast(false);
        booking.setPeopleNumber(0);
        booking.setAvailable(false);
        if (result.isSuccess()) {
            booking.setWithBreakfast(result.getData().isWithBreakfast());
            booking.setPeopleNumber(result.getData().getPeopleNumber());
            booking.setAvailable(result.getData().isAvailable());
        }
        booking.setId(msa.getHotelReservationID());
        booking.setCustomerId(msa.getUserId());
        booking.setTotalPrice(msa.getHotelCost());
        this.booking = booking;


        ReservationDTO reservation = new ReservationDTO();
        reservation.setId(msa.getFlightReservationID());
        reservation.setDate(msa.getDate().toString());
        reservation.setTotal(msa.getFlightCost());
        reservation.setIdCustomer(msa.getUserId());
        reservation.setActive(result2 != null ? result2.isActive() : false);
        this.reservation = reservation;
    }
}
