package ucm.tfg.agency.business.businessdelegate.hotel;


import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.Response;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationV2DTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationV2DTO;
import ucm.tfg.agency.common.dto.hotel.BookingMSA;
import ucm.tfg.agency.common.dto.hotel.BookingRequestMSADTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.utils.ConnectionGateway;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

public class HotelMSAService implements HotelExternalService {
    private final WebClient webClient = ConnectionGateway.webClient();

    @Override
    public Result<ucm.tfg.agency.common.dto.hotel.RoomDTO> getRoomById(long roomId) {
        try {
            ResponseEntity<ucm.tfg.agency.common.dto.hotel.RoomDTO> resp = this.webClient.get()
                .uri("/room/{id}", roomId)
                .retrieve()
                .toEntity(ucm.tfg.agency.common.dto.hotel.RoomDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null)
                return Result.success(resp.getBody());

            return Result.failure("Error obteniendo la habitación (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo la habitación: " + e.getMessage());
        }
    }

    @Override
    public Result<java.util.List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName) {
        try {
            ResponseEntity<java.util.List<RoomInfoDTO>> resp = this.webClient.get()
                .uri(uriBuilder -> uriBuilder
                    .path("/room/params")
                    .queryParam("nameHotel", hotelName)
                    .queryParam("country", countryName)
                    .build())
                .retrieve()
                .toEntity(new ParameterizedTypeReference<java.util.List<RoomInfoDTO>>() {})
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null)
                return Result.success(resp.getBody());

            return Result.failure("Error obteniendo las habitaciones (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo las habitaciones: " + e.getMessage());
        }
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking,
            long userId, String dni) {
        try {
            AuthUser user = (AuthUser) SecurityContextHolder
                    .getContext()
                    .getAuthentication()
                    .getPrincipal();
            CreateBookingReservationV2DTO bookingV2 = new CreateBookingReservationV2DTO(booking, user);
            ResponseEntity<Void> resp = this.webClient.post()
                .uri("/agency/create/hotel")
                .bodyValue(bookingV2)
                .retrieve()
                .toBodilessEntity()
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful()) {
                return Result.success(null); // Se ha iniciado la Transacción SAGA
            }
            return Result.failure("Error creando la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error creando la reserva: " + e.getMessage());
        }
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking) { //DONE✅
        try {
            UpdateBookingReservationV2DTO bookingV2 = new UpdateBookingReservationV2DTO(booking.getIdTravel(), booking);
            ResponseEntity<Void> resp = this.webClient.put()
                .uri("/agency/update/hotel")
                .bodyValue(bookingV2)
                .retrieve()
                .toBodilessEntity()
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful()) {
                return Result.success(null);
            }
            return Result.failure("Error modificando la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error modificando la reserva: " + e.getMessage());
        }
    }

    @Override
    public Result<Double> cancelHotelBooking(long travelId, long bookingId) {
        try {
            ResponseEntity<Void> resp = this.webClient.delete()
                .uri("/agency/delete/hotel/{travelId}/{id}", travelId, bookingId)
                .retrieve()
                .toBodilessEntity()
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful()) {
                return Result.success(0.0); // Se ha iniciado la Transacción SAGA
            }
            return Result.failure("Error cancelando la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error cancelando la reserva: " + e.getMessage());
        }
    }

    @Override
    public Result<Double> cancelHotelBookingLine(long bookingId, long roomId) {
        return Result.success(0.0); //Metodo no necesario en MSA
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.BookingDTO> getHotelBooking(long bookingId) {
        try {
            ResponseEntity<BookingMSA> resp = this.webClient.get()
                .uri("/booking/{id}", bookingId)
                .retrieve()
                .toEntity(BookingMSA.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null)
                return Result.success(resp.getBody().getBookingDTO());

            return Result.failure("Error obteniendo la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo la reserva: " + e.getMessage());
        }
    }


    @Override
    public Result<java.util.List<BookingLineDTO>> getRoomsByBooking(long bookingId) {
        try {
            ResponseEntity<BookingRequestMSADTO> resp = this.webClient.get()
                .uri("/booking/{id}", bookingId)
                .retrieve()
                .toEntity(BookingRequestMSADTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null){
                return Result.success(resp.getBody().toBookingLines(this));
            }
            return Result.failure("Error obteniendo las habitaciones de la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo las habitaciones de la reserva: " + e.getMessage());
        }
    }

}
