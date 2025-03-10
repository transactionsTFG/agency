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
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.exception.CatchExceptionSOAP;
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
    public Result<Map<String, ListFlightHotelDTO>> getFlightsAndHotels(String hotelName, String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateFrom) {
        try {
            SearchAirlineHotelRequestSOAP searchAirlineHotelRequestSOAP = new SearchAirlineHotelRequestSOAP();
            searchAirlineHotelRequestSOAP.setHotelName(hotelName);
            searchAirlineHotelRequestSOAP.setCountryOrigin(countryOrigin);
            searchAirlineHotelRequestSOAP.setCountryDestination(countryDestination);
            searchAirlineHotelRequestSOAP.setCityOrigin(cityOrigin);
            searchAirlineHotelRequestSOAP.setCityDestination(cityDestination);
            searchAirlineHotelRequestSOAP.setDateFrom(dateFrom);
            return Result.success(this.mapperAgency.mapListFlightHotelDTO(this.portAgencyWS.searchFlightHotel(searchAirlineHotelRequestSOAP)));
        } catch(Exception e){
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<TravelDTO> getTravelById(long travelId) {
        try {
            return Result.success(this.mapperAgency.travelSOAPtoDTO(this.portAgencyWS.searchTravel(travelId)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<FlightHotelDTO> getFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        try {
            return Result.success(this.mapperAgency.flightAndHotelSOAPtoDTO(this.portAgencyWS.getFlightHotelReservation(hotelReservationId, flightReservationId)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightAndHotelReservation(CreateAirlineReservationDTO flightReservationDTO, CreateBookingReservationDTO hotelReservationDTO){
        try {
            return Result.success(this.mapperAgency.successReservationSOAPtoDTO(
                this.portAgencyWS.makeFlightHotelReservation(
                    this.mapperAgency.makeBookingReservationDTOtoSOAP(hotelReservationDTO), 
                    this.mapperAgency.makeFlightReservationDTOtoSOAP(flightReservationDTO)
                )
        ));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightAndHotelReservation(UpdateBookingReservationDTO updateBookingReservationDTO, UpdateAirlineReservationDTO updateAirlineReservationDTO) {
        try {
            return Result.success(this.mapperAgency.updateReservationSOAPtoDTO(this.portAgencyWS.modFlightHotelReservation(
                this.mapperAgency.modifyBookingReservationDTOtoSOAP(updateBookingReservationDTO), 
                this.mapperAgency.modifyAirlineRequestionDTOtoSOAP(updateAirlineReservationDTO))));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<Double> cancelFlightAndHotelReservation(long flightReservationId, long hotelReservationId) {
        try {
            return Result.success(this.portAgencyWS.delFlightHotelReservation(hotelReservationId, flightReservationId));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }
    
}
