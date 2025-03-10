package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import ucm.tfg.agency.soapclient.airlineflight.FlightListDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightSOAP;
import ucm.tfg.agency.soapclient.airlineflight.ParamSearchFlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.airlinereservation.MakeFlightReservationSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.ModifyFlightReservationRequestionSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO;


public class AirlineMSAService implements AirlineService {

    @Override
    public FlightSOAP getFlightById(long flightId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightById'");
    }

    @Override
    public List<FlightListDTO> getAllFlights(ParamSearchFlightSOAP params) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllFlights'");
    }

    @Override
    public AgencyReservationSuccessDTO makeFlightReservation(MakeFlightReservationSOAP flightReservationDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeFlightReservation'");
    }

    @Override
    public UpdateReservationDTO modifyFlightReservation(ModifyFlightReservationRequestionSOAP flightReservationDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyFlightReservation'");
    }

    @Override
    public double cancelFlightReservation(long flightReservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelFlightReservation'");
    }

    
    
}
