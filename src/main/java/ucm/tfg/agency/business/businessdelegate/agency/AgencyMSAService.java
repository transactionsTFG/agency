package ucm.tfg.agency.business.businessdelegate.agency;

import java.util.List;
import java.util.Map;

import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.reservation.CreateReservationDTO;
import ucm.tfg.agency.common.dto.reservation.SuperReservationDTO;
import ucm.tfg.agency.common.utils.ConnectionGateway;

public class AgencyMSAService implements AgencyExternalService {
    private final WebClient webClient = ConnectionGateway.webClient();

    @Override
    public Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(String hotelName, String countryOrigin,
            String countryDestination, String cityOrigin, String cityDestination, String dateFrom) {
        Response response = this.webClient.get()
                .uri("/agency/flights-hotels?hotelName=" + hotelName + "&countryOrigin=" + countryOrigin
                        + "&countryDestination=" + countryDestination + "&cityOrigin=" + cityOrigin
                        + "&cityDestination=" + cityDestination + "&dateFrom=" + dateFrom)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) {
            return Result.success(response.readEntity(new GenericType<Map<String, ListFlightHotelDTO>>() {}));
        }
        return Result.failure("Error obteniendo los vuelos y hoteles");
    }

    @Override
    public Result<TravelDTO> getTravelById(long travelId) { //DONE✅
        Response response = webClient.get()
                .uri("/travel/" + travelId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) {
            return Result.success(response.readEntity(TravelDTO.class));
        }
        return Result.failure("Error obteniendo el viaje");
    }

    @Override
    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {  //DONE✅
        return Result.failure("Method not implemented yet, with getTravelById success");
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(
            CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO) { //DONE✅
        Response response = this.webClient.post()
                .uri("/agency/create/hotel-airline")
                .bodyValue(new CreateReservationDTO(flightReservationDTO, hotelReservationDTO))
                .retrieve()
                .bodyToMono(Response.class)
                .block();

        if (response != null && response.getStatus() == 200) {
            return Result.success(null);
        } else {
            return Result.failure("Error creando la reserva");
        }
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation( //DONE✅
            UpdateBookingReservationDTO updateBookingReservationDTO,
            UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        Response response = this.webClient.put()
                .uri("/agency/update/hotel-airline")
                .bodyValue(new SuperReservationDTO(updateBookingReservationDTO, updateAirlineReservationDTO))
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
    public Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) { 
        Response response = this.webClient.delete()
                .uri("/agency/delete/hotel-airline/" + flightReservationId + "/" + hotelReservationId)
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
    public Result<List<TravelDTO>> getTravelsByUser(long userId) { //DONE✅
        Response response = webClient.get()
                .uri("/travel/user/" + userId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) {
            return Result.success(response.readEntity(new GenericType<List<TravelDTO>>() {}));
        }
        return Result.failure("Error obteniendo los viajes del usuario");
    }
    
}
