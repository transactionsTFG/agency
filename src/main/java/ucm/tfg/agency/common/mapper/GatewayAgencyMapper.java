package ucm.tfg.agency.common.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
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

    TravelDTO travelSOAPtoDTO(GetTravelSOAP travelSOAP);
    
    FlightHotelDTO flightAndHotelSOAPtoDTO(HotelFlightReservationDTO hotelFlightReservationDTO);

    MakeBookingReservationDTO makeBookingReservationDTOtoSOAP(final CreateBookingReservationDTO hotelReservationDTO);
    
    MakeFlightReservationSOAP makeFlightReservationDTOtoSOAP(final CreateAirlineReservationDTO airlineReservationDTO);

    SuccessReservationAgencyDTO successReservationSOAPtoDTO(final AgencyReservationSuccessDTO successSOAP);

    ModifyBookingReservationDTO modifyBookingReservationDTOtoSOAP(final UpdateBookingReservationDTO updateBookingReservationDTO);

    ModifyFlightReservationRequestionSOAP modifyAirlineRequestionDTOtoSOAP(final UpdateAirlineReservationDTO updateAirlineReservationDTO);

    UpdateReservationDTO updateReservationSOAPtoDTO(final ucm.tfg.agency.soapclient.gatewayagency.UpdateReservationDTO updateSOAP);
    
    default Map<String, ListFlightHotelDTO> mapListFlightHotelDTO(final SearchFlightHotelResponse.Return mapFlightHotel) {
        if (mapFlightHotel == null || mapFlightHotel.getEntry() == null ||  mapFlightHotel.getEntry().isEmpty()) 
            return new HashMap<>();

        
        return mapFlightHotel.getEntry().stream().collect(Collectors.toMap(entry -> entry.getKey(), entry -> {
            final List<FlightListDTO> flightListDTO = entry.getValue().getFlights(); 
            final List<RoomListDTO> roomListDTO = entry.getValue().getHotels();
            List<ucm.tfg.agency.common.dto.agency.FlightListDTO> listFlight = flightListDTO.stream().map(flight -> {
                return ucm.tfg.agency.common.dto.agency.FlightListDTO.builder()
                        .id(flight.getId())
                        .arrivalTime(flight.getArrivalTime())
                        .departureTime(flight.getDepartureTime())
                        .cityDestination(flight.getCityDestination())
                        .countryOrigin(flight.getCountryOrigin())
                        .countryDestination(flight.getCountryDestination())
                        .weekDay(flight.getWeekDay())
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
                        .build();
            }).toList();

            return ListFlightHotelDTO.builder()
                        .listFlight(listFlight)
                        .listHotel(listHotel)
                        .build();
        })); 
    }
}
