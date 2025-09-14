package ucm.tfg.agency.business.businessdelegate.airline;

import java.util.List;

import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ReservationDTO;
import ucm.tfg.agency.common.dto.agency.SuccessReservationAgencyDTO;
import ucm.tfg.agency.common.dto.agency.UpdateReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceAirlineDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.exception.CatchExceptionSOAP;
import ucm.tfg.agency.common.mapper.AirlineMapper;
import ucm.tfg.agency.soapclient.airlineflight.AgencyAirlineFlightWS;
import ucm.tfg.agency.soapclient.airlineflight.AgencyAirlineFlightWS_Service;
import ucm.tfg.agency.soapclient.airlineflight.FlightInstanceDTO;
import ucm.tfg.agency.soapclient.airlineflight.ParamSearchFlightSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyAirlineReservationWS;
import ucm.tfg.agency.soapclient.airlinereservation.AgencyAirlineReservationWS_Service;
import ucm.tfg.agency.soapclient.airlinereservation.MakeFlightReservationSOAP;
import ucm.tfg.agency.soapclient.airlinereservation.ModifyFlightReservationRequestionSOAP;

public class AirlineMTAService implements AirlineExternalService {

    private final AgencyAirlineFlightWS agencyAirlineFlightWS;
    private final AgencyAirlineReservationWS agencyAirlineReservationWS;
    private final AirlineMapper airlineMapper;

    public AirlineMTAService() {
        this.agencyAirlineFlightWS = new AgencyAirlineFlightWS_Service().getAgencyAirlineFlightWSPort();
        this.agencyAirlineReservationWS = new AgencyAirlineReservationWS_Service().getAgencyAirlineReservationWSPort();
        this.airlineMapper = AirlineMapper.INSTANCE;
    }

    @Override
    public Result<FlightAirlineDTO> getFlightById(long flightId) {
        try {
            return Result.success(this.airlineMapper.flightSOAPtoDTO(this.agencyAirlineFlightWS.search(flightId)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<List<FlightAirlineInfoDTO>> getAllFlights(String countryOrigin, String countryDestination,
            String cityOrigin, String cityDestination, String dateOrigin) {
        try {
            ParamSearchFlightSOAP params = new ParamSearchFlightSOAP();
            params.setCountryOrigin(countryOrigin);
            params.setCityDestination(cityDestination);
            params.setCountryDestination(countryDestination);
            params.setCityOrigin(cityOrigin);
            params.setDateOrigin(dateOrigin);
            return Result
                    .success(this.airlineMapper.flightSOAPtoInfoDTO(this.agencyAirlineFlightWS.searchFlight(params)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<SuccessReservationAgencyDTO> makeFlightReservation(String dni, long idCustomer,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        try {
            MakeFlightReservationSOAP makeFlightReservationSOAP = new MakeFlightReservationSOAP();
            makeFlightReservationSOAP.setDni(dni);
            makeFlightReservationSOAP.setIdCustomer(idCustomer);
            MakeFlightReservationSOAP.Flights flightsSOAP = new MakeFlightReservationSOAP.Flights();
            
            flightsSOAP.getFlight().addAll(this.airlineMapper.idFlightInstanceWithSeatsDTOtoSOAP(flights));
            makeFlightReservationSOAP.setFlights(flightsSOAP);
            return Result.success(this.airlineMapper.successReservationSOAPtoDTO(
                    this.agencyAirlineReservationWS.makeFlightReservation(makeFlightReservationSOAP)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<UpdateReservationDTO> modifyFlightReservation(long idTravel, long idReservation,
            List<IdFlightInstanceWithSeatsDTO> flights) {
        try {
            ModifyFlightReservationRequestionSOAP flightReservationDTO = new ModifyFlightReservationRequestionSOAP();
            flightReservationDTO.setIdReservation(idReservation);
            ModifyFlightReservationRequestionSOAP.Flights flightsSOAP = new ModifyFlightReservationRequestionSOAP.Flights();
            flightsSOAP.getFlight().addAll(this.airlineMapper.idFlightInstanceWithSeatsDTOtoSOAP(flights));
            flightReservationDTO.setFlights(flightsSOAP);
            return Result.success(this.airlineMapper.updateReservationSOAPtoDTO(
                    this.agencyAirlineReservationWS.modFlightReservation(flightReservationDTO)));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<Double> cancelFlightReservation(long idTravel, long flightReservationId) {
        try {
            return Result.success(this.agencyAirlineReservationWS.delFlightReservation(flightReservationId));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>> getFlightByReservation(
            long reservationId) {
        try {
            return Result.success(this.agencyAirlineFlightWS.searchFlightsByReservation(reservationId));
        } catch (Exception e) {
            return Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
    }

    @Override
    public FlightInstanceAirlineDTO getFlightInstance(long flightInstanceId) {
        return this.airlineMapper.flightInstanceSOAPtoDTO(this.agencyAirlineFlightWS.searchFlightInstance(flightInstanceId));  
    }

    @Override
    public ReservationDTO getFlightReservation(long flightReservationId) {
        return this.airlineMapper.flightReservationToDTO(this.agencyAirlineReservationWS.searchFlightReservation(flightReservationId));
    }

}
