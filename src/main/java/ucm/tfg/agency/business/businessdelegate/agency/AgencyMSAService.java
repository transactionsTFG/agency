package ucm.tfg.agency.business.businessdelegate.agency;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.Response;
import reactor.core.publisher.Mono;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTOV2;
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
        
        try {
            ResponseEntity<Map<String, ListFlightHotelDTOV2>> response = this.webClient.get()
                .uri(uriBuilder -> uriBuilder.path("/agency/list")
                        .queryParam("hotelName", hotelName)
                        .queryParam("countryOrigin", countryOrigin)
                        .queryParam("countryDestination", countryDestination)
                        .queryParam("cityOrigin", cityOrigin)
                        .queryParam("cityDestination", cityDestination)
                        .queryParam("dateOrigin", dateFrom)
                        .build())
                .retrieve()
                .onStatus(HttpStatusCode::is4xxClientError,
                      resp -> Mono.error(new RuntimeException("Usuario no encontrado")))
                .onStatus(HttpStatusCode::is5xxServerError,
                      resp -> Mono.error(new RuntimeException("Error del servidor de autenticación")))
                .toEntity(new ParameterizedTypeReference<Map<String, ListFlightHotelDTOV2>>() {})
                .block();
            if (response != null && response.getStatusCode().is2xxSuccessful() && response.getBody() != null) {
                Map<String, ListFlightHotelDTO> data = new HashMap<>();
                for (Map.Entry<String, ListFlightHotelDTOV2> entry : response.getBody().entrySet()) {
                    ListFlightHotelDTOV2 value = entry.getValue();
                    ListFlightHotelDTO dto = ListFlightHotelDTO.builder()
                        .listFlight(value.getListFlight().stream().map(flight -> {
                            return ucm.tfg.agency.common.dto.agency.FlightListDTO.builder()
                                .id(flight.getId())
                                .idFlightInstance(flight.getId())
                                .arrivalDate(flight.getArrivalDate().toString())
                                .departureDate(flight.getDepartureDate().toString())
                                .cityDestination(flight.getCityDestination())
                                .countryOrigin(flight.getCountryOrigin())
                                .countryDestination(flight.getCountryDestination())
                                .weekDay(flight.getWeekDay())
                                .price(flight.getPrice())
                                .build();
                        }).toList())
                        .listHotel(value.getListHotel())
                        .build();
                    data.put(entry.getKey(), dto);
                }
                return Result.success(data);
            }
               
            return Result.failure("Error obteniendo los vuelos y hoteles");
        } catch (Exception e) {
            return Result.failure(e.getMessage());
        }
    }

    @Override
    public Result<TravelDTO> getTravelById(long travelId) { //DONE✅
        try {
            ResponseEntity<TravelDTO> resp = webClient.get()
                .uri("/agency/travel/{id}", travelId)
                .retrieve()
                .toEntity(TravelDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                return Result.success(resp.getBody());
            }
            return Result.failure("Viaje no encontrado (status " 
                    + (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo el viaje: " + e.getMessage());
        }
    }

    @Override
    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {  //DONE✅
        try {
            ResponseEntity<FlightHotelDTO> resp = webClient.get()
                .uri("/agency/hotel-airline/{hotel}/{flight}", hotelReservationId, flightReservationId)
                .retrieve()
                .toEntity(FlightHotelDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                return Result.success(resp.getBody());
            }
            return Result.failure("Viaje no encontrado (status " 
                    + (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo el viaje: " + e.getMessage());
        }
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(
            CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO) { //DONE✅
        try {
            AuthUser user = (AuthUser) SecurityContextHolder
                    .getContext()
                    .getAuthentication()
                    .getPrincipal();
            ResponseEntity<Void> resp = this.webClient.post()
                .uri("/agency/create/hotel-airline")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(new CreateReservationDTO(flightReservationDTO, hotelReservationDTO, user))
                .retrieve()
                .toBodilessEntity()
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful()) {
                return Result.success(null); // SAGA iniciada
            }
            return Result.failure("Error creando la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error creando la reserva: " + e.getMessage());
        }
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation( //DONE✅
            long idTravel,
            UpdateBookingReservationDTO updateBookingReservationDTO,
            UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        try {
            ResponseEntity<Void> resp = this.webClient.put()
                .uri("/agency/update/hotel-airline")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(new SuperReservationDTO(idTravel, updateBookingReservationDTO, updateAirlineReservationDTO))
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
    public Result<Double> cancelFlightAndHotelReservation(long idTravel, long flightReservationId, long hotelReservationId) { 
        try {
            ResponseEntity<Void> resp = this.webClient.delete()
                .uri("/agency/delete/hotel-airline/{travelId}/{flightId}/{hotelId}", idTravel, flightReservationId, hotelReservationId)
                .retrieve()
                .toBodilessEntity()
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful()) {
                return Result.success(0.0); // SAGA iniciada
            }
            return Result.failure("Error cancelando la reserva (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error cancelando la reserva: " + e.getMessage());
        }
    }

    @Override
    public Result<List<TravelDTO>> getTravelsByUser(long userId) { //DONE✅
        try {
            ResponseEntity<List<TravelDTO>> resp = webClient.get()
                .uri("/agency/travel/user/{userId}", userId)
                .retrieve()
                .toEntity(new ParameterizedTypeReference<List<TravelDTO>>() {})
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                return Result.success(resp.getBody());
            }
            return Result.failure("Error obteniendo los viajes del usuario (status "
                    + (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo los viajes del usuario: " + e.getMessage());
        }
    }
    
}
