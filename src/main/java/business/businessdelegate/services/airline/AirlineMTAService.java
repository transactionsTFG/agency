package business.businessdelegate.services.airline;

import common.result.Result;
import soapclient.airline.flight.FlightWS;
import soapclient.airline.flight.FlightWS_Service;
import soapclient.airline.flight.SoapResponse;

public class AirlineMTAService implements  AirlineService {
    private final FlightWS portFlightWS;
    public AirlineMTAService(){
        this.portFlightWS = new FlightWS_Service().getFlightWSPort();
    }

    @Override
    public Result<Object> getFlight(long idFlight) {
        Result<Object> result = null;
        try {
            SoapResponse soapResponse = this.portFlightWS.searchFlight(idFlight);
            result = Result.success(soapResponse.getData(), soapResponse.getMessage());
        } catch(Exception e){
            result = Result.failure(e.getMessage());
        }
        return result;
    }
    
}
