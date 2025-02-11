package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.business.businessdelegate.airline.AgencyMTAService;
import ucm.tfg.agency.business.businessdelegate.airline.AgencyService;
import ucm.tfg.agency.business.businessdelegate.user.UserMTAService;
import ucm.tfg.agency.business.businessdelegate.user.UserService;
import ucm.tfg.agency.common.enums.TypeService;

public class BusinessLookup {
    private final AgencyMTAService airlineMTAService;
    private final UserMTAService userMTAService;

    public BusinessLookup() {
        this.airlineMTAService = new AgencyMTAService();
        this.userMTAService = new UserMTAService();
    }

    public AgencyService getAirlineService(TypeService typeService){
        if (typeService == TypeService.MTA) return this.airlineMTAService; 
            else  return null; //TODO: Aqui abria que agregar el MSA
    }

    public UserService getUserService(TypeService typeService){
        if (typeService == TypeService.MTA) return this.userMTAService; 
            else  return null; //TODO: Aqui abria que agregar el MSA
    }

}