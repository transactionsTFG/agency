package ucm.tfg.agency.business.businessdelegate.agency;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.airline.reservation.FlightReservationDTO;
import ucm.tfg.agency.common.dto.hotel.booking.HotelReservationDTO;

public class AgencyMSAService implements AgencyService {

    @Override
    public List<FlightHotelDTO> getFlightsAndHotels() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightsAndHotels'");
    }

    @Override
    public TravelDTO getTravelById(long travelId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getTravelById'");
    }

    @Override
    public FlightHotelDTO makeFlightAndHotelReservation(FlightReservationDTO flightReservationDTO,
            HotelReservationDTO hotelReservationDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makeFlightAndHotelReservation'");
    }

    @Override
    public FlightHotelDTO getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFlightAndHotelReservation'");
    }

    @Override
    public FlightHotelDTO modifyFlightAndHotelReservation(FlightReservationDTO flightReservationDTO,
            HotelReservationDTO hotelReservationDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'modifyFlightAndHotelReservation'");
    }

    @Override
    public double cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cancelFlightAndHotelReservation'");
    }
    
}
