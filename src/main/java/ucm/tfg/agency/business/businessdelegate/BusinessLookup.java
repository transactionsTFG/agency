package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.business.businessdelegate.airline.AgencyMTAService;
import ucm.tfg.agency.business.businessdelegate.airline.AgencyService;
import ucm.tfg.agency.common.enums.TypeService;

public class BusinessLookup {
    private final AgencyMTAService airlineMTAService;
    //TODO: Add AgencyMSAService
    public BusinessLookup(){
        this.airlineMTAService = new AgencyMTAService();
    }

    public AgencyService getAirlineService(TypeService typeService){
        if (typeService == TypeService.MTA) return this.airlineMTAService; 
            else  return null; //TODO: Aqui abria que agregar el MSA
    }

}