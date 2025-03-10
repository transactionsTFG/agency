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
import ucm.tfg.agency.common.dto.agency.UpdatePriceReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.reservation.FlightReservationDTO;
import ucm.tfg.agency.common.dto.hotel.booking.HotelReservationDTO;
import ucm.tfg.agency.common.mapper.GatewayAgencyMapper;
import ucm.tfg.agency.soapclient.gatewayagency.GatewayAgencyWS;
import ucm.tfg.agency.soapclient.gatewayagency.GatewayAgencyWS_Service;
import ucm.tfg.agency.soapclient.gatewayagency.SearchAirlineHotelRequestSOAP;

public class AgencyMTAService implements AgencyService {

    private final GatewayAgencyWS portAgencyWS;
    private final GatewayAgencyMapper mapperAgency;

    public AgencyMTAService() {
        this.portAgencyWS = new GatewayAgencyWS_Service().getGatewayAgencyWSPort();
        this.mapperAgency = GatewayAgencyMapper.INSTANCE;
    }

    @Override
    public Map<String, ListFlightHotelDTO> getFlightsAndHotels(String hotelName, String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateFrom) {
        SearchAirlineHotelRequestSOAP searchAirlineHotelRequestSOAP = new SearchAirlineHotelRequestSOAP();
        searchAirlineHotelRequestSOAP.setHotelName(hotelName);
        searchAirlineHotelRequestSOAP.setCountryOrigin(countryOrigin);
        searchAirlineHotelRequestSOAP.setCountryDestination(countryDestination);
        searchAirlineHotelRequestSOAP.setCityOrigin(cityOrigin);
        searchAirlineHotelRequestSOAP.setCityDestination(cityDestination);
        searchAirlineHotelRequestSOAP.setDateFrom(dateFrom);
        return this.mapperAgency.mapListFlightHotelDTO(this.portAgencyWS.searchFlightHotel(searchAirlineHotelRequestSOAP));
    }

    @Override
    public TravelDTO getTravelById(long travelId) {
        return this.mapperAgency.travelSOAPtoDTO(this.portAgencyWS.searchTravel(travelId));
    }

    @Override
    public FlightHotelDTO getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.mapperAgency.flightAndHotelSOAPtoDTO(this.portAgencyWS.getFlightHotelReservation(hotelReservationId, flightReservationId));
    }

    @Override
    public SuccessReservationAgencyDTO makeFlightAndHotelReservation(CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO){
        return this.mapperAgency.successReservationSOAPtoDTO(
                        this.portAgencyWS.makeFlightHotelReservation(
                            this.mapperAgency.makeBookingReservationDTOtoSOAP(hotelReservationDTO), 
                            this.mapperAgency.makeFlightReservationDTOtoSOAP(flightReservationDTO)
                        )
                );
    }

    @Override
    public UpdateReservationDTO modifyFlightAndHotelReservation(UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        return this.mapperAgency.updateReservationSOAPtoDTO(this.portAgencyWS.modFlightHotelReservation(
                this.mapperAgency.modifyBookingReservationDTOtoSOAP(updateBookingReservationDTO), 
                this.mapperAgency.modifyAirlineRequestionDTOtoSOAP(updateAirlineReservationDTO)));
    }

    @Override
    public double cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        return this.portAgencyWS.delFlightHotelReservation(hotelReservationId, flightReservationId);
    }
    
}
