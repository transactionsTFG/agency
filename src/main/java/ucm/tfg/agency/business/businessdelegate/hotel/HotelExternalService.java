package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

public interface HotelExternalService {
    Result<RoomDTO> getRoomById(long roomId);
    Result<List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName);
    Result<BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking, long userId, String dni);
    Result<BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking);
    Result<Double> cancelHotelBooking(long bookingId);
    Result<Double> cancelHotelBookingLine(long bookingId, long roomId);
    Result<BookingDTO> getHotelBooking(long bookingId);
    Result<List<BookingLineDTO>> getRoomsByBooking(long bookingId);
}
