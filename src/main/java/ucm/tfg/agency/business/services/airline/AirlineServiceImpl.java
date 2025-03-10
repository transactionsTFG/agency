package ucm.tfg.agency.business.services.airline;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;

@Service
@AllArgsConstructor
public class AirlineServiceImpl implements AirlineService {
    private final BusinessDelegate businessDelegate;

    @Override
    public Result<FlightAirlineDTO> getFlightById(long flightId) {
        return this.businessDelegate.getFlight(flightId);
    }

    @Override
    public Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateOrigin) {
        return this.businessDelegate.getAllFlights(countryOrigin, countryDestination, cityOrigin, cityDestination, dateOrigin);
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        return this.businessDelegate.makeFlightReservation(dni, idCustomer, flights);
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightReservation(long idReservation,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        return this.businessDelegate.modifyFlightReservation(idReservation, flights);
    }

    @Override
    public Result<Double> cancelFlightReservation(long flightReservationId) {
        return this.businessDelegate.cancelFlightReservation(flightReservationId);
    }
}
