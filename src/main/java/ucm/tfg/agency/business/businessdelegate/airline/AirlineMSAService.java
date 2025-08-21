package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ReservationDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceAirlineDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.utils.ConnectionGateway;


public class AirlineMSAService implements AirlineExternalService {

    private final WebClient webClient = ConnectionGateway.webClient();


    @Override
    public Result<FlightAirlineDTO> getFlightById(long flightId) { 
        Response response = webClient.get()
                .uri("/flights/" + flightId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) {
            return Result.success(response.readEntity(FlightAirlineDTO.class));
        }
        return Result.failure("Error obteniendo el vuelo");
    }

    @Override
    public Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateOrigin) { 
        Response response = webClient.get()
                .uri("/flights/params?countryOrigin=" + countryOrigin + "&countryDestination=" + countryDestination
                        + "&cityOrigin=" + cityOrigin + "&cityDestination=" + cityDestination + "&dateOrigin="
                        + dateOrigin)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) {
            return Result.success(response.readEntity(new GenericType<List<FlightAirlineInfoDTO>>() {}));
        }
        return Result.failure("Error obteniendo los vuelos");
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer,
            List<IdFlightInstanceWithSeatsDTO> flights) { 
         Response response = this.webClient.post()
                .uri("/agency/create/airline")
                .bodyValue(flights)
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
    public Result<ucm.tfg.agency.common.dto.agency.UpdateReservationDTO> modifyFlightReservation(long idReservation,
            List<IdFlightInstanceWithSeatsDTO> flights) { 
        Response response = this.webClient.put()
                .uri("/agency/update/airline/")
                .bodyValue(flights)
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
    public Result<Double> cancelFlightReservation(long flightReservationId) { 
        Response response = this.webClient.delete()
                .uri("/agency/delete/airline/" + flightReservationId)
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
    public FlightInstanceAirlineDTO getFlightInstance(long flightInstanceId) { 
        Response response = webClient.get()
                .uri("/flights/instance/" + flightInstanceId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) 
            return response.readEntity(FlightInstanceAirlineDTO.class);
        
        return null;
    }

    @Override
    public Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>> getFlightByReservation(
            long reservationId) {
        Response response = webClient.get()
                .uri("/reservations/" + reservationId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) 
            return Result.success(response.readEntity(ucm.tfg.agency.common.dto.reservation.ReservationDTO.class).getLines());
        
        return Result.failure("Error retrieving flight by reservation");
    }

    @Override
    public ReservationDTO getFlightReservation(long flightReservationId) { 
        Response response = webClient.get()
                .uri("/reservations/" + flightReservationId)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) 
            return response.readEntity(ucm.tfg.agency.common.dto.reservation.ReservationDTO.class).getReservation();
        
        return null;

    }   

}