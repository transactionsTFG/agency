package ucm.tfg.agency.common.dto.hotel;

import lombok.Data;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMSAService;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

import java.util.List;

@Data
public class BookingRequestMSADTO {
    private BookingV2DTO bookingDTO;
    private List<BookingLineV2DTO> bookingLines;
    
    @Data
    private static class BookingV2DTO {
        private boolean available;
        private Long id;
        private int peopleNumber;
        private String sagaId;
        private String statusSaga;
        private double totalPrice;
        private String userId;
        private boolean withBreakfast;
    }

    @Data
    private static class BookingLineV2DTO {
        private boolean available;
        private String startDate;   // puedes mapear a LocalDate si lo prefieres
        private String endDate;     // idem
        private int numberOfNights;
        private double roomDailyPrice;
        private String roomId;      // si es numérico, cámbialo a Long
    }

    public List<BookingLineDTO> toBookingLines(HotelMSAService hotelMSAService) {
        List<BookingLineDTO> bookingLinesResponse = new java.util.ArrayList<>();
        for (BookingLineV2DTO lineV2 : this.bookingLines) {
            BookingLineDTO lineDTO = new BookingLineDTO();
            lineDTO.setAvailable(lineV2.isAvailable());
            lineDTO.setStartDate(lineV2.getStartDate());
            lineDTO.setEndDate(lineV2.getEndDate());
            lineDTO.setNumberOfNights(lineV2.getNumberOfNights());
            lineDTO.setRoomDailyPrice(lineV2.getRoomDailyPrice());

            ucm.tfg.agency.soapclient.hotelroom.BookingDTO bookingDTOR = new ucm.tfg.agency.soapclient.hotelroom.BookingDTO();
            bookingDTOR.setId(this.bookingDTO.getId());
            bookingDTOR.setCustomerId(Long.parseLong(this.bookingDTO.getUserId()));
            bookingDTOR.setTotalPrice(this.bookingDTO.getTotalPrice());
            bookingDTOR.setWithBreakfast(this.bookingDTO.isWithBreakfast());
            bookingDTOR.setAvailable(this.bookingDTO.isAvailable());
            bookingDTOR.setPeopleNumber(this.bookingDTO.getPeopleNumber());
            lineDTO.setBookingDTO(bookingDTOR);

            Result<RoomDTO> roomResult = hotelMSAService.getRoomById(Long.parseLong(lineV2.getRoomId()));
            ucm.tfg.agency.soapclient.hotelroom.RoomDTO roomDTO = new ucm.tfg.agency.soapclient.hotelroom.RoomDTO();
            if (roomResult.isSuccess()) {
                RoomDTO room = roomResult.getData();
                roomDTO.setId(room.getId());
                roomDTO.setAvailable(room.isAvailable());
                roomDTO.setDailyPrice(room.getDailyPrice());
                roomDTO.setHotelId(room.getHotelId());
                roomDTO.setNumber(room.getNumber());
                roomDTO.setPeopleNumber(room.getPeopleNumber());
                roomDTO.setSingleBed(room.isSingleBed());
            }
            lineDTO.setRoomDTO(roomDTO);

            bookingLinesResponse.add(lineDTO);
        }        
        return bookingLinesResponse;
    }
}

