package ucm.tfg.agency.common.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightListDTO;
import ucm.tfg.agency.soapclient.airlineflight.FlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyReservationSuccessDTO;
import ucm.tfg.agency.soapclient.airlinereservation.IdFlightInstanceWithSeatsSOAP;

@Mapper
public interface AirlineMapper {
    AirlineMapper INSTANCE = Mappers.getMapper(AirlineMapper.class);

    FlightAirlineDTO flightSOAPtoDTO(FlightSOAP flightSOAP);
    List<FlightAirlineInfoDTO> flightSOAPtoInfoDTO(List<FlightListDTO> flightSOAP);
    SuccessReservationAgencyDTO successReservationSOAPtoDTO(final AgencyReservationSuccessDTO successSOAP);
    UpdateReservationDTO updateReservationSOAPtoDTO(final ucm.tfg.agency.soapclient.airlinereservation.UpdateReservationDTO updateSOAP);
    List<IdFlightInstanceWithSeatsSOAP> idFlightInstanceWithSeatsDTOtoSOAP(List<IdFlightInstanceWithSeatsDTO> idFlightInstanceWithSeatsDTO);
}
