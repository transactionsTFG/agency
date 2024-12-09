package business.businessdelegate.services.airline;

import common.dto.airlinemta.FlightDTO;
import common.dto.airlinemta.MakeReservationDTO;
import common.dto.airlinemta.ModifyReservationDTO;
import common.dto.airlinemta.ReservationDTO;
import common.mapper.airlinemta.MapperFlightSOAP;
import common.mapper.airlinemta.MapperMakeReservationSOAP;
import common.mapper.airlinemta.MapperModifyReservationSOAP;
import common.mapper.airlinemta.MapperReservationSOAP;
import common.result.Result;
import soapclient.airline.flight.FlightSOAP;
import soapclient.airline.flight.FlightWS;
import soapclient.airline.flight.FlightWS_Service;
import soapclient.airline.flight.SoapResponse;
import soapclient.airline.reservation.ReservationSOAP;
import soapclient.airline.reservation.ReservationWS;
import soapclient.airline.reservation.ReservationWS_Service;


public class AirlineMTAService implements AirlineService {
    private final FlightWS portFlightWS;
    private final ReservationWS portReservationWS;
    
    public AirlineMTAService(){
        this.portFlightWS = new FlightWS_Service().getFlightWSPort();
        this.portReservationWS = new ReservationWS_Service().getReservationWSPort();
    }

    @Override
    public Result<FlightDTO> getFlight(long idFlight) {
        Result<FlightDTO> result = null;
        try {
            SoapResponse soapResponse = this.portFlightWS.searchFlight(idFlight);
            if(!soapResponse.isSuccess())
                throw new Exception(soapResponse.getMessage());

            FlightSOAP f = (FlightSOAP) soapResponse.getData();
            FlightDTO flightDTO =  MapperFlightSOAP.toDTO(f);
            result = Result.success(flightDTO, soapResponse.getMessage());
        } catch(Exception e){
            result = Result.failure(e.getMessage());
        }
        return result;
    }

    @Override
    public Result<ReservationDTO> makeResevation(final MakeReservationDTO m) {
        Result<ReservationDTO> result = null;
        try {
            soapclient.airline.reservation.SoapResponse soapResponse = this.portReservationWS.makeReservation(MapperMakeReservationSOAP.toSOAP(m));
            if(!soapResponse.isSuccess())
                throw new Exception(soapResponse.getMessage());

            ReservationSOAP r = (ReservationSOAP) soapResponse.getData();
            ReservationDTO reservationDTO =  MapperReservationSOAP.toDTO(r);
            result = Result.success(reservationDTO, soapResponse.getMessage());
        } catch(Exception e){
            result = Result.failure(e.getMessage());
        }
        return result;
    }

    @Override
    public Result<Void> cancelReservation(final long idReservation, final long idFlightInstance) {
        Result<Void> result = null;
        try {
            soapclient.airline.reservation.SoapResponse soapResponse = this.portReservationWS.cancelReservation(idReservation, idFlightInstance);
            if(!soapResponse.isSuccess())
                throw new Exception(soapResponse.getMessage());
            result = Result.success(null, soapResponse.getMessage());
        } catch(Exception e){
            result = Result.failure(e.getMessage());
        }
        return result;
    }

    @Override
    public Result<ReservationDTO> modifyReservation(final ModifyReservationDTO m) {
        Result<ReservationDTO> result = null;
        try {
            soapclient.airline.reservation.SoapResponse soapResponse = this.portReservationWS.modifyReservation(MapperModifyReservationSOAP.toSOAP(m));
            if(!soapResponse.isSuccess())
                throw new Exception(soapResponse.getMessage());

            ReservationSOAP r = (ReservationSOAP) soapResponse.getData();
            ReservationDTO reservationDTO =  MapperReservationSOAP.toDTO(r);
            result = Result.success(reservationDTO, soapResponse.getMessage());
        } catch(Exception e){
            result = Result.failure(e.getMessage());
        }
        return result;
    }

    @Override
    public Result<ReservationDTO> searchReservation(long idReservation) {
        Result<ReservationDTO> result = null;
        try {
            soapclient.airline.reservation.SoapResponse soapResponse = this.portReservationWS.searchReservation(idReservation);
            if(!soapResponse.isSuccess())
                throw new Exception(soapResponse.getMessage());

            ReservationSOAP r = (ReservationSOAP) soapResponse.getData();
            ReservationDTO reservationDTO = MapperReservationSOAP.toDTO(r);
            result = Result.success(reservationDTO, soapResponse.getMessage());
        } catch(Exception e){
            result = Result.failure(e.getMessage());
        }
        return result;
    }
    
}
