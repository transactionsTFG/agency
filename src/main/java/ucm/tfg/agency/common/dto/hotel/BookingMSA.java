package ucm.tfg.agency.common.dto.hotel;

import java.util.List;

import lombok.Data;
import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

@Data
public class BookingMSA {
    private BookingDTO bookingDTO;
    private List<BookingLineDTO> bookingLines;
}
