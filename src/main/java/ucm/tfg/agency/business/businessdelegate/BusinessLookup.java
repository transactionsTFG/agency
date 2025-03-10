package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.business.businessdelegate.airline.AirlineMTAService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMTAService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelService;
import ucm.tfg.agency.business.businessdelegate.user.UserMTAService;
import ucm.tfg.agency.business.businessdelegate.user.UserService;
import ucm.tfg.agency.common.enums.TypeService;

public class BusinessLookup {
    private final AirlineMTAService airlineMTAService;
    private final HotelMTAService hotelMTAService;
    private final UserMTAService userMTAService;

    public BusinessLookup() {
        this.airlineMTAService = new AirlineMTAService();
        this.hotelMTAService = new HotelMTAService();
        this.userMTAService = new UserMTAService();
    }

    public AirlineService getAirlineService(TypeService typeService){
        if (typeService == TypeService.MTA) return this.airlineMTAService; 
            else  return null; //TODO: Aqui habria que agregar el MSA
    }

    public HotelService getHotelService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.hotelMTAService : null;
    }

    public UserService getUserService(TypeService typeService){
        if (typeService == TypeService.MTA) return this.userMTAService; 
            else  return null; //TODO: Aqui habria que agregar el MSA
    }

}