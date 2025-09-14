package ucm.tfg.agency.common.mapper;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;
import org.w3c.dom.Element;

import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.dto.user.UserDTO;
import ucm.tfg.agency.common.utils.DateParser;
import ucm.tfg.agency.soapclient.gatewayagency.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.gatewayagency.FlightListDTO;
import ucm.tfg.agency.soapclient.gatewayagency.GetTravelSOAP;
import ucm.tfg.agency.soapclient.gatewayagency.HotelFlightReservationDTO;
import ucm.tfg.agency.soapclient.gatewayagency.MakeBookingReservationDTO;
import ucm.tfg.agency.soapclient.gatewayagency.MakeFlightReservationSOAP;
import ucm.tfg.agency.soapclient.gatewayagency.ModifyBookingReservationDTO;
import ucm.tfg.agency.soapclient.gatewayagency.ModifyFlightReservationRequestionSOAP;
import ucm.tfg.agency.soapclient.gatewayagency.RoomListDTO;
import ucm.tfg.agency.soapclient.gatewayagency.SearchFlightHotelResponse;

@Mapper
public interface GatewayAgencyMapper {
    GatewayAgencyMapper INSTANCE = Mappers.getMapper(GatewayAgencyMapper.class);

    @Mapping(target = "dateCreation", source = "dateCreation", qualifiedByName = "mapDateCreation")
    TravelDTO travelSOAPtoDTO(GetTravelSOAP travelSOAP);

    @Mapping(target = "dateCreation", source = "dateCreation", qualifiedByName = "mapDateCreation")
    List<TravelDTO> listTravelSOAPtoDTO(List<GetTravelSOAP> listTravelSOAP);
    
    FlightHotelDTO flightAndHotelSOAPtoDTO(HotelFlightReservationDTO hotelFlightReservationDTO);

    MakeBookingReservationDTO makeBookingReservationDTOtoSOAP(final CreateBookingReservationDTO hotelReservationDTO);
    
    @Mapping(target = "flights.flight", source = "listIdFlightInstanceSeats")
    MakeFlightReservationSOAP makeFlightReservationDTOtoSOAP(final CreateAirlineReservationDTO airlineReservationDTO);

    SuccessReservationAgencyDTO successReservationSOAPtoDTO(final AgencyReservationSuccessDTO successSOAP);

    ModifyBookingReservationDTO modifyBookingReservationDTOtoSOAP(final UpdateBookingReservationDTO updateBookingReservationDTO);

    @Mapping(target = "flights.flight", source = "listIdFlightInstanceSeats")
    ModifyFlightReservationRequestionSOAP modifyAirlineRequestionDTOtoSOAP(final UpdateAirlineReservationDTO updateAirlineReservationDTO);

    UpdateReservationDTO updateReservationSOAPtoDTO(final ucm.tfg.agency.soapclient.gatewayagency.UpdateReservationDTO updateSOAP);

    @Mapping(target = "type", source = "typeUser")
    ReponseUserDTO responseUserDTO(final UserDTO u);
    
    default Map<String, ListFlightHotelDTO> mapListFlightHotelDTO(final SearchFlightHotelResponse.Return mapFlightHotel) {
        if (mapFlightHotel == null || mapFlightHotel.getEntry() == null ||  mapFlightHotel.getEntry().isEmpty()) 
            return new HashMap<>();

        
        return mapFlightHotel.getEntry().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> {
            final List<FlightListDTO> flightListDTO = entry.getValue().getFlights(); 
            final List<RoomListDTO> roomListDTO = entry.getValue().getHotels();
            List<ucm.tfg.agency.common.dto.agency.FlightListDTO> listFlight = flightListDTO.stream().map(flight -> {
                return ucm.tfg.agency.common.dto.agency.FlightListDTO.builder()
                        .id(flight.getId())
						.idFlightInstance(flight.getIdFlightInstance())
                        .arrivalDate(flight.getArrivalDate())
                        .departureDate(flight.getDepartureDate())
                        .cityDestination(flight.getCityDestination())
                        .countryOrigin(flight.getCountryOrigin())
                        .countryDestination(flight.getCountryDestination())
                        .weekDay(flight.getWeekDay())
                        .price(flight.getPrice())
                        .build();
            }).toList();

            List<ucm.tfg.agency.common.dto.agency.RoomListDTO> listHotel = roomListDTO.stream().map(room -> {
                return ucm.tfg.agency.common.dto.agency.RoomListDTO.builder()
                        .id(room.getId())
                        .number(room.getNumber())
                        .occupied(room.isOccupied())
                        .singleBed(room.isSingleBed())
                        .active(room.isActive())
                        .peopleNumber(room.getPeopleNumber())
                        .hotelName(room.getHotelName())
                        .countryName(room.getCountryName())
                        .dailyPrice(room.getDailyPrice())
                        .build();
            }).toList();

            return ListFlightHotelDTO.builder()
                        .listFlight(listFlight)
                        .listHotel(listHotel)
                        .build();
        })); 
    }

    @Named("mapDateCreation")
    default LocalDateTime mapDateCreation(Object dateCreation) {
        return DateParser.elementToLocalDateTime(dateCreation);
    }
}
