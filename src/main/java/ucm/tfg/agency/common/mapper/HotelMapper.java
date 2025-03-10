package ucm.tfg.agency.common.mapper;

import java.lang.ProcessHandle.Info;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.soapclient.hotelbooking.ModifyBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelbooking.MakeBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomListDTO;

@Mapper
public interface HotelMapper {
    HotelMapper INSTANCE = Mappers.getMapper(HotelMapper.class);
    RoomDTO toRoomDTO(ucm.tfg.agency.soapclient.hotelroom.RoomDTO room);
    List<RoomInfoDTO> infoSOAPtoDTO(List<RoomListDTO> roomInfo);
    BookingDTO toBookingDTO(ucm.tfg.agency.soapclient.hotelbooking.BookingDTO booking);
    MakeBookingReservationDTO toMakeBookingReservationDTO(CreateBookingReservationDTO booking);
    ModifyBookingReservationDTO toModifyBookingReservationDTO(UpdateBookingReservationDTO booking);
}
