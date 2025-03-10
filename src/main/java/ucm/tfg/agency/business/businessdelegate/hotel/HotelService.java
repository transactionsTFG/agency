package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import ucm.tfg.agency.common.dto.hotel.booking.HotelReservationDTO;
import ucm.tfg.agency.common.dto.hotel.room.RoomDTO;

public interface HotelService {

    RoomDTO getRoomById(long roomId);

    List<RoomDTO> getAllRooms(String hotelName, String countryName);

    HotelReservationDTO makeHotelReservation(HotelReservationDTO hotelReservationDTO);

    HotelReservationDTO modifyHotelReservation(HotelReservationDTO hotelReservationDTO);

    double cancelHotelReservation(long hotelReservationId);

    double cancelHotelReservationLine(long hotelReservationId, long roomId);

    HotelReservationDTO getHotelReservationById(long hotelReservationId);

    List<HotelReservationDTO> getAllHotelReservations();

    List<HotelReservationDTO> getHotelReservationsByUserId(long userId);
}
