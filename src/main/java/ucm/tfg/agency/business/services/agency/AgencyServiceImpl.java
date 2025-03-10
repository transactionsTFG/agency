package ucm.tfg.agency.business.services.agency;

import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;

@Service
@AllArgsConstructor
public class AgencyServiceImpl implements AgencyService {

    private final BusinessDelegate businessDelegate;

    @Override
    public Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(String hotelName, String countryOrigin,
            String countryDestination, String cityOrigin, String cityDestination, String dateFrom) {
        return this.businessDelegate.getFlightsAndHotels(hotelName, countryOrigin, countryDestination, cityOrigin, cityDestination, dateFrom);
    }

    @Override
    public Result<TravelDTO> getTravelById(long travelId) {
        return this.businessDelegate.getTravelById(travelId);
    }

    @Override
    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.businessDelegate.getFlightAndHotelReservation(flightReservationId, hotelReservationId);
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(
            CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO) {
        return this.businessDelegate.makeFlightAndHotelReservation(flightReservationDTO, hotelReservationDTO);
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation(UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        return this.businessDelegate.modifyFlightAndHotelReservation(updateBookingReservationDTO, updateAirlineReservationDTO);
    }

    @Override
    public Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.businessDelegate.cancelFlightAndHotelReservation(flightReservationId, hotelReservationId);
    }
    

}
