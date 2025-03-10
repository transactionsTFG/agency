package ucm.tfg.agency.business.businessdelegate;

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
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.enums.TypeService;
import ucm.tfg.agency.soapclient.airlineflight.FlightListDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightSOAP;
import ucm.tfg.agency.soapclient.airlineflight.ParamSearchFlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.airlinereservation.MakeFlightReservationSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.ModifyFlightReservationRequestionSOAP;
import ucm.tfg.agency.soapclient.hotelbooking.BookingDTO;
import ucm.tfg.agency.soapclient.hotelbooking.MakeBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelbooking.ModifyBookingReservationDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomDTO;
import ucm.tfg.agency.soapclient.hotelroom.RoomListDTO;

public class BusinessDelegate {
    private final BusinessLookup lookupService = new BusinessLookup();
    private final TypeService typeService;

    public BusinessDelegate(TypeService typeService) {
        this.typeService = typeService;
    }

    public Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(String hotelName, String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateFrom) {
        return this.lookupService.getAgencyService(this.typeService).getFlightsAndHotels(hotelName, countryOrigin, countryDestination, cityOrigin, cityDestination, dateFrom);
    }

    public Result<TravelDTO> getTravelById(long travelId) {
        return this.lookupService.getAgencyService(this.typeService).getTravelById(travelId);
    }

    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.lookupService.getAgencyService(this.typeService).getFlightAndHotelReservation(flightReservationId, hotelReservationId);
    }

    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO){
        return this.lookupService.getAgencyService(this.typeService).makeFlightAndHotelReservation(flightReservationDTO, hotelReservationDTO);
    }

    public Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.lookupService.getAgencyService(this.typeService).cancelFlightAndHotelReservation(flightReservationId, hotelReservationId);
    }

    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation(UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        return this.lookupService.getAgencyService(this.typeService).modifyFlightAndHotelReservation(updateBookingReservationDTO, updateAirlineReservationDTO);
    }

    public FlightSOAP getFlight(long idFlight) {
        return this.lookupService.getAirlineService(this.typeService).getFlightById(idFlight);
    }

    public List<FlightListDTO> getAllFlights(ParamSearchFlightSOAP params) {
        return this.lookupService.getAirlineService(typeService).getAllFlights(params);
    }

    public AgencyReservationSuccessDTO makeFlightReservation(MakeFlightReservationSOAP flightReservationDTO) {
        return this.lookupService.getAirlineService(typeService).makeFlightReservation(flightReservationDTO);
    }

    public ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO modifyFlightReservation(ModifyFlightReservationRequestionSOAP flightReservationDTO) {
        return this.lookupService.getAirlineService(typeService).modifyFlightReservation(flightReservationDTO);
    }

    public double cancelFlightReservation(long flightReservationId) {
        return this.lookupService.getAirlineService(typeService).cancelFlightReservation(flightReservationId);
    }

    public RoomDTO getRoomById(long roomId) {
        return this.lookupService.getHotelService(typeService).getRoomById(roomId);
    }

    public List<RoomListDTO> getAllRooms(String hotelName, String countryName) {
        return this.lookupService.getHotelService(typeService).getAllRooms(hotelName, countryName);
    }

    public BookingDTO makeHotelBooking(MakeBookingReservationDTO booking, long userId, String dni) {
        return this.lookupService.getHotelService(typeService).makeHotelBooking(booking, userId, dni);
    }

    public BookingDTO modifyHotelBooking(ModifyBookingReservationDTO booking) {
        return this.lookupService.getHotelService(typeService).modifyHotelBooking(booking);
    }

    public double cancelHotelBooking(long bookingId) {
        return this.lookupService.getHotelService(typeService).cancelHotelBooking(bookingId);
    }

    public double cancelHotelBookingLine(long bookingId, long roomId) {
        return this.lookupService.getHotelService(typeService).cancelHotelBookingLine(bookingId, roomId);
    }

    public BookingDTO getHotelBooking(long bookingId) {
        return this.lookupService.getHotelService(typeService).getHotelBooking(bookingId);
    }

    public Result<Long> createUser(final RegisterUserDTO registerUserDTO) {
        return this.lookupService.getUserService(this.typeService).createUser(registerUserDTO);
    }

    public Result<ReponseUserDTO> loginUser(final LoginUserDTO userDTO) {
        return this.lookupService.getUserService(this.typeService).loginUser(userDTO);
    }

    
}