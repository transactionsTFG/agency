package business.businessdelegate.services.airline;

import common.result.Result;

public interface AirlineService {
    Result<Object> getFlight(long idFlight);  
}
