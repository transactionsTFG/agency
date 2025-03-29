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

public interface AgencyExternalService {
        Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(final String hotelName, final String countryOrigin, final String countryDestination, final String cityOrigin, final String cityDestination, final String dateFrom);
        Result<TravelDTO> getTravelById(long travelId);
        Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId);
        Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO);
        Result<UpdateReservationDTO> modifyFlightAndHotelReservation(UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO);
        Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId);
        Result<List<TravelDTO>> getTravelsByUser(long userId);
}
