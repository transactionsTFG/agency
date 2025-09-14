package ucm.tfg.agency.business.services.airline;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ReservationDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceAirlineDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;

public interface AirlineService {
    Result<FlightAirlineDTO> getFlightById(long flightId);
    Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination, String cityOrigin, String cityDestination, String dateOrigin);
    Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer, List<IdFlightInstanceWithSeatsDTO> flights);
    Result<UpdateReservationDTO> modifyFlightReservation(long idTravel, long idReservation, List<IdFlightInstanceWithSeatsDTO> flights);
    Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>>getFlightsByReservation(long idReservation);
    ReservationDTO getFlightReservation(long reservationId);
    Result<Double> cancelFlightReservation(long idTravel, long flightReservationId);
    FlightInstanceAirlineDTO searchFlightInstance(long flightInstanceId);
}
