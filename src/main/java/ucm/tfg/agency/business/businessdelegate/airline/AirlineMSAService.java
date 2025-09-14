package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.Response;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ReservationDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceV2DTO;
import ucm.tfg.agency.common.dto.airline.MakeReservationRequestDTO;
import ucm.tfg.agency.common.dto.airline.UpdateReservationRequestDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.utils.ConnectionGateway;


public class AirlineMSAService implements AirlineExternalService {

    private final WebClient webClient = ConnectionGateway.webClient();


    @Override
    public Result<FlightAirlineDTO> getFlightById(long flightId) { 
        try {
            ResponseEntity<FlightAirlineDTO> resp = webClient.get()
                .uri("/flight/{id}", flightId)
                .retrieve()
                .toEntity(FlightAirlineDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                return Result.success(resp.getBody());
            }
            return Result.failure("Error obteniendo el vuelo (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo el vuelo: " + e.getMessage());
        }
    }

    @Override
    public Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateOrigin) { 
        try {
            ResponseEntity<List<FlightInstanceV2DTO>> resp = webClient.get()
                .uri(uriBuilder -> uriBuilder
                    .path("/flight/params")
                    .queryParam("countryOrigin", countryOrigin)
                    .queryParam("countryDestination", countryDestination)
                    .queryParam("cityOrigin", cityOrigin)
                    .queryParam("cityDestination", cityDestination)
                    .queryParam("dateOrigin", dateOrigin) // ISO yyyy-MM-dd
                    .build())
                .retrieve()
                .toEntity(new ParameterizedTypeReference<List<FlightInstanceV2DTO>>() {})
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                List<FlightAirlineInfoDTO> flights = resp.getBody().stream().map(flight -> {
                    FlightAirlineInfoDTO dto = new FlightAirlineInfoDTO();
                    dto.setId(flight.getId());
                    dto.setIdFlightInstance(flight.getId());
                    dto.setArrivalDate(flight.getArrivalDate().toString());
                    dto.setDepartureDate(flight.getDepartureDate().toString());
                    dto.setCityDestination(flight.getCityDestination());
                    dto.setCountryOrigin(flight.getCountryOrigin());
                    dto.setCountryDestination(flight.getCountryDestination());
                    dto.setWeekDay(flight.getWeekDay());
                    dto.setPrice(flight.getPrice());
                    return dto;
                }).toList();
                return Result.success(flights);
            }
            return Result.failure("Error obteniendo los vuelos (status " +
                    (resp != null ? resp.getStatusCode().value() : "sin respuesta") + ")");
        } catch (Exception e) {
            return Result.failure("Error obteniendo los vuelos: " + e.getMessage());
        }
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer,
            List<IdFlightInstanceWithSeatsDTO> flights) { 
        AuthUser user = (AuthUser) SecurityContextHolder
                    .getContext()
                    .getAuthentication()
                    .getPrincipal();
        MakeReservationRequestDTO request = new MakeReservationRequestDTO(dni, user.getId(), flights);
        try {
            ResponseEntity<Void> resp = this.webClient.post()
                .uri(uriBuilder -> uriBuilder
                    .path("/agency/create/airline")
                    .build())
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
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
    public Result<ucm.tfg.agency.common.dto.agency.UpdateReservationDTO> modifyFlightReservation(long idTravel, long idReservation,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        UpdateReservationRequestDTO request = new UpdateReservationRequestDTO(idTravel, idReservation, flights);
        try {
            ResponseEntity<Void> resp = this.webClient.put()
                .uri("/agency/update/airline")
                .contentType(MediaType.APPLICATION_JSON)
                .bodyValue(request)
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
    public Result<Double> cancelFlightReservation(long idTravel, long flightReservationId) { 
        try {
            ResponseEntity<Void> resp = this.webClient.delete()
                .uri("/agency/delete/airline/{idTravel}/{id}", idTravel, flightReservationId)
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
    public FlightInstanceAirlineDTO getFlightInstance(long flightInstanceId) {
        try {
            ResponseEntity<FlightInstanceAirlineDTO> resp = webClient.get()
                .uri("/flight/instance/{id}", flightInstanceId)
                .retrieve()
                .toEntity(FlightInstanceAirlineDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful()) {
                return resp.getBody();
            }
        } catch (Exception e) {
            // log si quieres
        }
        return null;
}

    @Override
    public Result<java.util.List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>>
    getFlightByReservation(long reservationId) {
        try {
            ResponseEntity<ucm.tfg.agency.common.dto.reservation.ReservationDTO> resp = webClient.get()
                .uri("/reservation/{id}", reservationId)
                .retrieve()
                .toEntity(ucm.tfg.agency.common.dto.reservation.ReservationDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                return Result.success(resp.getBody().getLines());
            }
            return Result.failure("Error retrieving flight by reservation (status " +
                    (resp != null ? resp.getStatusCode().value() : "no response") + ")");
        } catch (Exception e) {
            return Result.failure("Error retrieving flight by reservation: " + e.getMessage());
        }
    }

    @Override
    public ReservationDTO getFlightReservation(long flightReservationId) {
        try {
            ResponseEntity<ucm.tfg.agency.common.dto.reservation.ReservationDTO> resp = webClient.get()
                .uri("/reservation/{id}", flightReservationId)
                .retrieve()
                .toEntity(ucm.tfg.agency.common.dto.reservation.ReservationDTO.class)
                .block();

            if (resp != null && resp.getStatusCode().is2xxSuccessful() && resp.getBody() != null) {
                return resp.getBody().getReservation(); // igual que tu lógica original
            }
        } catch (Exception e) {
            // log si quieres
        }
        return null;
    } 

}