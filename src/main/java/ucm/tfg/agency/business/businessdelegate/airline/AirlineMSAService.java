package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;


public class AirlineMSAService implements AirlineExternalService {

    @Override
    public Result<FlightAirlineDTO> getFlightById(long flightId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightById'");
    }

    @Override
    public Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateOrigin) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllFlights'");
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeFlightReservation'");
    }

    @Override
    public Result<ucm.tfg.agency.common.dto.agency.UpdateReservationDTO> modifyFlightReservation(long idReservation,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyFlightReservation'");
    }

    @Override
    public Result<Double> cancelFlightReservation(long flightReservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelFlightReservation'");
    }

    @Override
    public Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>> getFlightByReservation(
            long reservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightByReservation'");
    }
 
}
