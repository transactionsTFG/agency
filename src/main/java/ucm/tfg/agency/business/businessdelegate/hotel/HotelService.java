package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.soapclient.hotelbooking.BookingDTO;
import ucm.tfg.agency.soapclient.hotelbooking.MakeBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelbooking.ModifyBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomListDTO;

public interface HotelService {
    RoomDTO getRoomById(long roomId);

    List<RoomListDTO> getAllRooms(String hotelName, String countryName);

    BookingDTO makeHotelBooking(MakeBookingReservationDTO booking, long userId, String dni);

    BookingDTO modifyHotelBooking(ModifyBookingReservationDTO booking);

    double cancelHotelBooking(long bookingId);

    double cancelHotelBookingLine(long bookingId, long roomId);

    BookingDTO getHotelBooking(long bookingId);
}
