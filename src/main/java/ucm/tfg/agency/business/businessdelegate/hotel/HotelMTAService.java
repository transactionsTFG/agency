package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.soapclient.hotelbooking.AgencyHotelBookingWS;
import ucm.tfg.agency.soapclient.hotelbooking.AgencyHotelBookingWS_Service;
import ucm.tfg.agency.soapclient.hotelbooking.BookingDTO;
import ucm.tfg.agency.soapclient.hotelbooking.MakeBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelbooking.ModifyBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelroom.AgencyHotelRoomWS;
import ucm.tfg.agency.soapclient.hotelroom.AgencyHotelRoomWS_Service;
import ucm.tfg.agency.soapclient.hotelroom.RoomDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomListDTO;

public class HotelMTAService implements HotelService {

    private AgencyHotelRoomWS agencyHotelRoomWS;
    private AgencyHotelBookingWS agencyHotelBookingWS;

    public HotelMTAService() {
        this.agencyHotelRoomWS = new AgencyHotelRoomWS_Service().getAgencyHotelRoomWSPort();
        this.agencyHotelBookingWS = new AgencyHotelBookingWS_Service().getAgencyHotelBookingWSPort();
    }

    @Override
    public RoomDTO getRoomById(long roomId) {
        return this.agencyHotelRoomWS.searchRoom(roomId);
    }

    @Override
    public List<RoomListDTO> getAllRooms(String hotelName, String countryName) {
        return this.agencyHotelRoomWS.searchRooms(hotelName, countryName);
    }

    @Override
    public BookingDTO makeHotelBooking(MakeBookingReservationDTO booking, long userId, String dni) {
        return this.agencyHotelBookingWS.makeHotelBooking(booking, userId, dni);
    }

    @Override
    public BookingDTO modifyHotelBooking(ModifyBookingReservationDTO booking) {
        return this.agencyHotelBookingWS.modifyHotelBooking(booking);
    }

    @Override
    public double cancelHotelBooking(long bookingId) {
        return this.agencyHotelBookingWS.cancelHotelBooking(bookingId, -1);
    }

    @Override
    public double cancelHotelBookingLine(long bookingId, long roomId) {
        return this.agencyHotelBookingWS.cancelHotelBookingLine(bookingId, roomId);
    }

    @Override
    public BookingDTO getHotelBooking(long bookingId) {
        return this.agencyHotelBookingWS.readHotelBooking((int) bookingId);
    }

}
