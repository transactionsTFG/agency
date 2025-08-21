package ucm.tfg.agency.business.businessdelegate.hotel;

import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.hotel.BookingMSA;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.utils.ConnectionGateway;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

public class HotelMSAService implements HotelExternalService {
    private final WebClient webClient = ConnectionGateway.webClient();

    @Override
    public Result<ucm.tfg.agency.common.dto.hotel.RoomDTO> getRoomById(long roomId) {
        Response response = this.webClient.get()
                .uri("/room/" + roomId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            RoomDTO room = response.readEntity(RoomDTO.class);
            return Result.success(room);
        } else 
            return Result.failure("Error obteniendo la habitación");
        
    }

    @Override
    public Result<List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName) {
        Response response = this.webClient.get()
                .uri("/room/params?nameHotel=" + hotelName + "&country=" + countryName)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            List<RoomInfoDTO> rooms = response.readEntity(new GenericType<List<RoomInfoDTO>>() {});
            return Result.success(rooms);
        } else {
            return Result.failure("Error obteniendo las habitaciones");
        }
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking,
            long userId, String dni) {
        Response response = this.webClient.post()
                .uri("/agency/create/hotel")
                .bodyValue(booking)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            return Result.success(null); //Se ha iniciado la Transaccion SAGA
        } else {
            return Result.failure("Error creando la reserva");
        }
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking) { //DONE✅
        Response response = this.webClient.put()
                .uri("/agency/update/hotel")
                .bodyValue(booking)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            return Result.success(null);
        } else {
            return Result.failure("Error modificando la reserva");
        }
    }

    @Override
    public Result<Double> cancelHotelBooking(long bookingId) {
        Response response = this.webClient.delete()
                .uri("/agency/delete/hotel/" + bookingId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            return Result.success(0.0); //Se ha iniciado la Transaccion SAGA
        } else {
            return Result.failure("Error cancelando la reserva");
        }
    }

    @Override
    public Result<Double> cancelHotelBookingLine(long bookingId, long roomId) {
        return Result.success(200.0); //Metodo no necesario en MSA
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> getHotelBooking(long bookingId) {
        Response response = this.webClient.get()
                .uri("/booking/" + bookingId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            BookingMSA booking = response.readEntity(BookingMSA.class);
            return Result.success(booking.getBookingDTO());
        } else {
            return Result.failure("Error obteniendo la reserva");
        }
    }

    @Override
    public Result<List<BookingLineDTO>> getRoomsByBooking(long bookingId) {
        Response response = this.webClient.get()
                .uri("/booking/" + bookingId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            List<BookingLineDTO> rooms = response.readEntity(BookingMSA.class).getBookingLines();
            return Result.success(rooms);
        } else {
            return Result.failure("Error obteniendo las habitaciones de la reserva");
        }
    }

}
