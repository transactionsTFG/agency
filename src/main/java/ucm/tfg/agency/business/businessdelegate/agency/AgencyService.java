package ucm.tfg.agency.business.businessdelegate.agency;

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

public interface AgencyService {
        Map<String, ListFlightHotelDTO> getFlightsAndHotels(final String hotelName, final String countryOrigin, final String countryDestination, final String cityOrigin, final String cityDestination, final String dateFrom);
        TravelDTO getTravelById(long travelId);
        FlightHotelDTO getFlightAndHotelReservation(long flightReservationId, long hotelReservationId);
        SuccessReservationAgencyDTO makeFlightAndHotelReservation(CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO);
        UpdateReservationDTO modifyFlightAndHotelReservation(UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO);
        double cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId);
}
