package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.soapclient.hotelbooking.BookingDTO;
import ucm.tfg.agency.soapclient.hotelbooking.MakeBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelbooking.ModifyBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomListDTO;

public class HotelMSAService implements HotelService {

    @Override
    public RoomDTO getRoomById(long roomId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoomById'");
    }

    @Override
    public List<RoomListDTO> getAllRooms(String hotelName, String countryName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllRooms'");
    }

    @Override
    public BookingDTO makeHotelBooking(MakeBookingReservationDTO booking, long userId, String dni) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeHotelBooking'");
    }

    @Override
    public BookingDTO modifyHotelBooking(ModifyBookingReservationDTO booking) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyHotelBooking'");
    }

    @Override
    public double cancelHotelBooking(long bookingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelHotelBooking'");
    }

    @Override
    public double cancelHotelBookingLine(long bookingId, long roomId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelHotelBookingLine'");
    }

    @Override
    public BookingDTO getHotelBooking(long bookingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHotelBooking'");
    }

}
