package business.businessdelegate;

import common.enums.TypeService;
import common.result.Result;

public class BusinessDelegate {
    private final BusinessLookup lookupService = new BusinessLookup();
    private final TypeService typeService;

    public BusinessDelegate(TypeService typeService) {
        this.typeService = typeService;
    }

    public Result<Object> getFlight(long idFlight) {
        return this.lookupService.getAirlineService(this.typeService).getFlight(idFlight);
    }
    
}
