package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;


public class HotelMSAService implements HotelExternalService {

    @Override
    public Result<ucm.tfg.agency.common.dto.hotel.RoomDTO> getRoomById(long roomId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoomById'");
    }

    @Override
    public Result<List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllRooms'");
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking,
            long userId, String dni) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeHotelBooking'");
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyHotelBooking'");
    }

    @Override
    public Result<Double> cancelHotelBooking(long bookingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelHotelBooking'");
    }

    @Override
    public Result<Double> cancelHotelBookingLine(long bookingId, long roomId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelHotelBookingLine'");
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> getHotelBooking(long bookingId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getHotelBooking'");
    }

   
}
