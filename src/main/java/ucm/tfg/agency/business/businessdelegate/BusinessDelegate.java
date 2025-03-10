package ucm.tfg.agency.business.businessdelegate;

import java.util.List;

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
import ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO;
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

    //TODO... Agregar mas metodos de Agencia

    public FlightSOAP getFlight(long idFlight) {
        return this.lookupService.getAirlineService(this.typeService).getFlightById(idFlight);
    }

    public List<FlightListDTO> getAllFlights(ParamSearchFlightSOAP params) {
        return this.lookupService.getAirlineService(typeService).getAllFlights(params);
    }

    public AgencyReservationSuccessDTO makeFlightReservation(MakeFlightReservationSOAP flightReservationDTO) {
        return this.lookupService.getAirlineService(typeService).makeFlightReservation(flightReservationDTO);
    }

    public UpdateReservationDTO modifyFlightReservation(ModifyFlightReservationRequestionSOAP flightReservationDTO) {
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