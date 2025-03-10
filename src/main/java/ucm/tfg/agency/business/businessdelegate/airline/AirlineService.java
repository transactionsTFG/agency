package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import ucm.tfg.agency.common.dto.airline.flight.FlightDTO;
import ucm.tfg.agency.common.dto.airline.reservation.FlightReservationDTO;

public interface AirlineService {

    FlightDTO getFlightById(long flightId);

    List<FlightDTO> getAllFlights(String originCountry, String destinationCountry, String originCity, String destinationCity, String originDate);

    FlightReservationDTO makeFlightReservation(FlightReservationDTO flightReservationDTO);

    FlightReservationDTO modifyFlightReservation(FlightReservationDTO flightReservationDTO);

    double cancelFlightReservation(long flightReservationId);

    FlightReservationDTO getFlightReservationById(long flightReservationId);

    List<FlightReservationDTO> getAllFlightReservations();

    List<FlightReservationDTO> getFlightReservationsByUserId(long userId);

}
