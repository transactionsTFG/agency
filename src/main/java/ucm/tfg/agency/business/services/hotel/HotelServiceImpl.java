package ucm.tfg.agency.business.services.hotel;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

@Service
@AllArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final BusinessDelegate businessDelegate;

    @Override
    public Result<RoomDTO> getRoomById(long roomId) {
        return this.businessDelegate.getRoomById(roomId);
    }

    @Override
    public Result<List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName) {
        return this.businessDelegate.getAllRooms(hotelName, countryName);
    }

    @Override
    public Result<BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking, long userId, String dni) {
        return this.businessDelegate.makeHotelBooking(booking, userId, dni);
    }

    @Override
    public Result<BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking) {
        return this.businessDelegate.modifyHotelBooking(booking);
    }

    @Override
    public Result<Double> cancelHotelBooking(long bookingId) {
       return this.businessDelegate.cancelHotelBooking(bookingId);
    }

    @Override
    public Result<Double> cancelHotelBookingLine(long bookingId, long roomId) {
        return this.businessDelegate.cancelHotelBookingLine(bookingId, roomId);
    }

    @Override
    public Result<BookingDTO> getHotelBooking(long bookingId) {
        return this.businessDelegate.getHotelBooking(bookingId);
    }

    public Result<List<BookingLineDTO>> getRoomsByBooking(long bookingId) {
        return this.businessDelegate.getRoomsByBooking(bookingId);
    }
    
}
