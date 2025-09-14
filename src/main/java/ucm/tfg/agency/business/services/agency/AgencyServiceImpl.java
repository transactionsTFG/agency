package ucm.tfg.agency.business.services.agency;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation(long idTravel, UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        return this.businessDelegate.modifyFlightAndHotelReservation(idTravel, updateBookingReservationDTO, updateAirlineReservationDTO);
    }

    @Override
    public Result<Double> cancelFlightAndHotelReservation(long idTravel, long flightReservationId, long hotelReservationId) {
        return this.businessDelegate.cancelFlightAndHotelReservation(idTravel, flightReservationId, hotelReservationId);
    }

    @Override
    public Result<List<TravelDTO>> getTravelsByUser(long userId) {
        Result<List<TravelDTO>> travels = this.businessDelegate.getTravelsByUser(userId);
        if (!travels.isSuccess())
            return travels;
        
        travels.getData().sort(Comparator.comparing(TravelDTO::getDateCreation).reversed());
        return travels;
    }
    

}
