package ucm.tfg.agency.common.mapper;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ReservationDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceAirlineDTO;
import ucm.tfg.agency.common.utils.DateParser;
import ucm.tfg.agency.soapclient.airlineflight.FlightInstanceDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightListDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.airlinereservation.IdFlightInstanceWithSeatsSOAP;

@Mapper
public interface AirlineMapper {
    AirlineMapper INSTANCE = Mappers.getMapper(AirlineMapper.class);

    @Mapping(target = "arrivalTime", source = "arrivalTime", qualifiedByName = "mapDateTimeCreation")
    @Mapping(target = "departureTime", source = "departureTime", qualifiedByName = "mapDateTimeCreation")
    FlightAirlineDTO flightSOAPtoDTO(FlightSOAP flightSOAP);
    List<FlightAirlineInfoDTO> flightSOAPtoInfoDTO(List<FlightListDTO> flightSOAP);
    SuccessReservationAgencyDTO successReservationSOAPtoDTO(final AgencyReservationSuccessDTO successSOAP);
    UpdateReservationDTO updateReservationSOAPtoDTO(final ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO updateSOAP);
    List<IdFlightInstanceWithSeatsSOAP> idFlightInstanceWithSeatsDTOtoSOAP(List<IdFlightInstanceWithSeatsDTO> idFlightInstanceWithSeatsDTO);
    @Mapping(target = "arrivalDate", source = "arrivalDate", qualifiedByName = "mapDateCreation")
    @Mapping(target = "departureDate", source = "departureDate", qualifiedByName = "mapDateCreation")
    FlightInstanceAirlineDTO flightInstanceSOAPtoDTO(FlightInstanceDTO flightSOAP);

    ReservationDTO flightReservationToDTO(ucm.tfg.agency.soapclient.airlinereservation.ReservationDTO reservationDTO);

    @Named("mapDateTimeCreation")
    default String mapTimeDateCreation(Object arrivalTime) {
        return DateParser.elementToString(arrivalTime);
    }

    @Named("mapDateCreation")
    default LocalDate mapDateCreation(Object date) {
        return DateParser.elementToLocalDate(date);
    }
}
