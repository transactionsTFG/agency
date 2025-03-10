package ucm.tfg.agency.business.businessdelegate.agency;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.airline.reservation.FlightReservationDTO;
import ucm.tfg.agency.common.dto.hotel.booking.HotelReservationDTO;

public interface AgencyService {

    List<FlightHotelDTO> getFlightsAndHotels();

    TravelDTO getTravelById(long travelId);

    FlightHotelDTO makeFlightAndHotelReservation(FlightReservationDTO flightReservationDTO,
            HotelReservationDTO hotelReservationDTO);

    FlightHotelDTO getFlightAndHotelReservation(long flightReservationId, long hotelReservationId);

    FlightHotelDTO modifyFlightAndHotelReservation(FlightReservationDTO flightReservationDTO,
            HotelReservationDTO hotelReservationDTO);

    double cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId);

}
