package ucm.tfg.agency.business.businessdelegate;

import java.util.List;
import java.util.Map;

import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.enums.TypeService;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

public class BusinessDelegate {
    private final BusinessLookup lookupService = new BusinessLookup();
    private final TypeService typeService;

    public BusinessDelegate(TypeService typeService) {
        this.typeService = typeService;
    }

    public Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(String hotelName, String countryOrigin,
            String countryDestination,
            String cityOrigin, String cityDestination, String dateFrom) {
        return this.lookupService.getAgencyService(this.typeService).getFlightsAndHotels(hotelName, countryOrigin,
                countryDestination, cityOrigin, cityDestination, dateFrom);
    }

    public Result<TravelDTO> getTravelById(long travelId) {
        return this.lookupService.getAgencyService(this.typeService).getTravelById(travelId);
    }

    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.lookupService.getAgencyService(this.typeService).getFlightAndHotelReservation(flightReservationId,
                hotelReservationId);
    }

    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(
            CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO) {
        return this.lookupService.getAgencyService(this.typeService).makeFlightAndHotelReservation(flightReservationDTO,
                hotelReservationDTO);
    }

    public Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.lookupService.getAgencyService(this.typeService)
                .cancelFlightAndHotelReservation(flightReservationId, hotelReservationId);
    }

    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation(
            UpdateBookingReservationDTO updateBookingReservationDTO,
            UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        return this.lookupService.getAgencyService(this.typeService)
                .modifyFlightAndHotelReservation(updateBookingReservationDTO, updateAirlineReservationDTO);
    }

    public Result<FlightAirlineDTO> getFlight(long idFlight) {
        return this.lookupService.getAirlineService(this.typeService).getFlightById(idFlight);
    }

    public Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>> getFlightReservation(
            long idReservation) {
        return this.lookupService.getAirlineService(this.typeService).getFlightByReservation(idReservation);
    }

    public Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateOrigin) {
        return this.lookupService.getAirlineService(typeService).getAllFlights(countryOrigin, countryDestination,
                cityOrigin, cityDestination, dateOrigin);
    }

    public Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        return this.lookupService.getAirlineService(typeService).makeFlightReservation(dni, idCustomer, flights);
    }

    public Result<UpdateReservationDTO> modifyFlightReservation(long idReservation,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        return this.lookupService.getAirlineService(typeService).modifyFlightReservation(idReservation, flights);
    }

    public Result<Double> cancelFlightReservation(long flightReservationId) {
        return this.lookupService.getAirlineService(typeService).cancelFlightReservation(flightReservationId);
    }

    public Result<RoomDTO> getRoomById(long roomId) {
        return this.lookupService.getHotelService(typeService).getRoomById(roomId);
    }

    public Result<List<RoomInfoDTO>> getAllRooms(String hotelName, String countryName) {
        return this.lookupService.getHotelService(typeService).getAllRooms(hotelName, countryName);
    }

    public Result<List<BookingLineDTO>> getRoomsByBooking(long bookingId) {
        return this.lookupService.getHotelService(typeService).getRoomsByBooking(bookingId);
    }

    public Result<BookingDTO> makeHotelBooking(CreateBookingReservationDTO booking, long userId, String dni) {
        return this.lookupService.getHotelService(typeService).makeHotelBooking(booking, userId, dni);
    }

    public Result<BookingDTO> modifyHotelBooking(UpdateBookingReservationDTO booking) {
        return this.lookupService.getHotelService(typeService).modifyHotelBooking(booking);
    }

    public Result<Double> cancelHotelBooking(long bookingId) {
        return this.lookupService.getHotelService(typeService).cancelHotelBooking(bookingId);
    }

    public Result<Double> cancelHotelBookingLine(long bookingId, long roomId) {
        return this.lookupService.getHotelService(typeService).cancelHotelBookingLine(bookingId, roomId);
    }

    public Result<BookingDTO> getHotelBooking(long bookingId) {
        return this.lookupService.getHotelService(typeService).getHotelBooking(bookingId);
    }

    public Result<Long> createUser(final RegisterUserDTO registerUserDTO) {
        return this.lookupService.getUserService(this.typeService).createUser(registerUserDTO);
    }

    public Result<ReponseUserDTO> loginUser(final LoginUserDTO userDTO) {
        return this.lookupService.getUserService(this.typeService).loginUser(userDTO);
    }

    public Result<List<TravelDTO>> getTravelsByUser(long userId) {
        return this.lookupService.getAgencyService(this.typeService).getTravelsByUser(userId);
    }
}