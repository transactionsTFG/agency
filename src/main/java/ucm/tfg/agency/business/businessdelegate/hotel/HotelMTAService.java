package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.exception.CatchExceptionSOAP;
import ucm.tfg.agency.common.mapper.HotelMapper;
import ucm.tfg.agency.soapclient.hotelbooking.AgencyHotelBookingWS;
import ucm.tfg.agency.soapclient.hotelbooking.AgencyHotelBookingWS_Service;
import ucm.tfg.agency.soapclient.hotelroom.AgencyHotelRoomWS;
import ucm.tfg.agency.soapclient.hotelroom.AgencyHotelRoomWS_Service;

public class HotelMTAService implements HotelExternalService {

    private AgencyHotelRoomWS agencyHotelRoomWS;
    private AgencyHotelBookingWS agencyHotelBookingWS;
    private HotelMapper hotelMapper;

    public HotelMTAService() {
        this.agencyHotelRoomWS = new AgencyHotelRoomWS_Service().getAgencyHotelRoomWSPort();
        this.agencyHotelBookingWS = new AgencyHotelBookingWS_Service().getAgencyHotelBookingWSPort();
        this.hotelMapper = HotelMapper.INSTANCE;
    }

    @Override
    public Result<RoomDTO> getRoomById(long roomId) {
        try {
            return Result.success(this.hotelMapper.toRoomDTO(this.agencyHotelRoomWS.searchRoom(roomId)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName) {
        try {
            return Result.success(this.hotelMapper.infoSOAPtoDTO(this.agencyHotelRoomWS.searchRooms(hotelName, countryName)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking, long userId, String dni) {
        try {
            return Result.success(this.hotelMapper.toBookingDTO(this.agencyHotelBookingWS.makeHotelBooking(this.hotelMapper.toMakeBookingReservationDTO(booking), userId, dni)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking) {
        try {
            return Result.success(this.hotelMapper.toBookingDTO(this.agencyHotelBookingWS.modifyHotelBooking( this.hotelMapper.toModifyBookingReservationDTO(booking))));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<Double> cancelHotelBooking(long bookingId) {
        try {
            return Result.success(this.agencyHotelBookingWS.cancelHotelBooking(bookingId));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<Double> cancelHotelBookingLine(long bookingId, long roomId) {
        try {
            return Result.success(this.agencyHotelBookingWS.cancelHotelBookingLine(bookingId, roomId));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<BookingDTO> getHotelBooking(long bookingId) {
        try {
            return Result.success(this.hotelMapper.toBookingDTO(this.agencyHotelBookingWS.readHotelBooking((int) bookingId)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<List<RoomDTO>> getRoomsByBooking(long bookingId) {
        // this.agencyHotelRoomWS.
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getRoomsByBooking'");
    }

}
