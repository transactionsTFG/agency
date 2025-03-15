package ucm.tfg.agency.business.businessdelegate.agency;

import java.util.List;
import java.util.Map;

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

public class AgencyMSAService implements AgencyExternalService {

    @Override
    public Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(String hotelName, String countryOrigin,
            String countryDestination, String cityOrigin, String cityDestination, String dateFrom) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightsAndHotels'");
    }

    @Override
    public Result<TravelDTO> getTravelById(long travelId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTravelById'");
    }

    @Override
    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightAndHotelReservation'");
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(
            CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeFlightAndHotelReservation'");
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation(
            UpdateBookingReservationDTO updateBookingReservationDTO,
            UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyFlightAndHotelReservation'");
    }

    @Override
    public Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelFlightAndHotelReservation'");
    }

    @Override
    public Result<List<TravelDTO>> getTravelsByUser(long userId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTravelsByUser'");
    }
    
}
