package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import ucm.tfg.agency.soapclient.airlineflight.FlightListDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightSOAP;
import ucm.tfg.agency.soapclient.airlineflight.ParamSearchFlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.airlinereservation.MakeFlightReservationSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.ModifyFlightReservationRequestionSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO;

public interface AirlineService {

    FlightSOAP getFlightById(long flightId);

    List<FlightListDTO> getAllFlights(ParamSearchFlightSOAP params);

    AgencyReservationSuccessDTO makeFlightReservation(MakeFlightReservationSOAP flightReservationDTO);

    UpdateReservationDTO modifyFlightReservation(ModifyFlightReservationRequestionSOAP flightReservationDTO);

    double cancelFlightReservation(long flightReservationId);

    // FlightReservationDTO getFlightReservationById(long flightReservationId);

    // List<FlightReservationDTO> getAllFlightReservations();

    // List<FlightReservationDTO> getFlightReservationsByUserId(long userId);

}
