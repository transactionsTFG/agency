package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import ucm.tfg.agency.soapclient.airlineflight.AgencyAirlineFlightWS;
import ucm.tfg.agency.soapclient.airlineflight.AgencyAirlineFlightWS_Service;
import ucm.tfg.agency.soapclient.airlineflight.FlightListDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightSOAP;
import ucm.tfg.agency.soapclient.airlineflight.ParamSearchFlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyAirlineReservationWS;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyAirlineReservationWS_Service;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.airlinereservation.MakeFlightReservationSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.ModifyFlightReservationRequestionSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO;

public class AirlineMTAService implements AirlineService {

    private AgencyAirlineFlightWS agencyAirlineFlightWS;
    private AgencyAirlineReservationWS agencyAirlineReservationWS;

    public AirlineMTAService() {
        this.agencyAirlineFlightWS = new AgencyAirlineFlightWS_Service().getAgencyAirlineFlightWSPort();
        this.agencyAirlineReservationWS = new AgencyAirlineReservationWS_Service().getAgencyAirlineReservationWSPort();
    }

    @Override
    public FlightSOAP getFlightById(long flightId) {
        return this.agencyAirlineFlightWS.search(flightId);
    }

    @Override
    public List<FlightListDTO> getAllFlights(ParamSearchFlightSOAP params) {
        return this.agencyAirlineFlightWS.searchFlight(params);
    }

    @Override
    public AgencyReservationSuccessDTO makeFlightReservation(MakeFlightReservationSOAP flightReservationDTO) {
        return this.agencyAirlineReservationWS.makeFlightReservation(flightReservationDTO);
    }

    @Override
    public UpdateReservationDTO modifyFlightReservation(ModifyFlightReservationRequestionSOAP flightReservationDTO) {
        return this.agencyAirlineReservationWS.modFlightReservation(flightReservationDTO);
    }

    @Override
    public double cancelFlightReservation(long flightReservationId) {
        return this.agencyAirlineReservationWS.delFlightReservation(flightReservationId);
    }

}
