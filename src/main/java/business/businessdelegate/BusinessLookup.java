package business.businessdelegate;

import business.businessdelegate.services.airline.AirlineMTAService;
import business.businessdelegate.services.airline.AirlineService;
import common.enums.TypeService;



public class BusinessLookup {
    private final AirlineMTAService airlineMTAService;

    public BusinessLookup(){
        this.airlineMTAService = new AirlineMTAService();
    }

    public AirlineService getAirlineService(TypeService typeService){
        if (typeService == TypeService.MTA)
            return this.airlineMTAService; 
        else 
            return null; //TODO: Aqui abria que agregar el MSA
    }

    //TODO: Agregar los demas Services como Agency y el Hotel
    

}
