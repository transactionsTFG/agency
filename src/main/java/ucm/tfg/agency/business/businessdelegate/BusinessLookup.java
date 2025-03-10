package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.business.businessdelegate.agency.AgencyMSAService;
import ucm.tfg.agency.business.businessdelegate.agency.AgencyMTAService;
import ucm.tfg.agency.business.businessdelegate.agency.AgencyService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineMSAService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineMTAService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMSAService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMTAService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelService;
import ucm.tfg.agency.business.businessdelegate.user.UserMSAService;
import ucm.tfg.agency.business.businessdelegate.user.UserMTAService;
import ucm.tfg.agency.business.businessdelegate.user.UserService;
import ucm.tfg.agency.common.enums.TypeService;

public class BusinessLookup {

    private final AgencyMTAService agencyMTAService;
    private final AgencyMSAService agencyMSAService;
    private final AirlineMTAService airlineMTAService;
    private final AirlineMSAService airlineMSAService;
    private final HotelMTAService hotelMTAService;
    private final HotelMSAService hotelMSAService;
    private final UserMTAService userMTAService;
    private final UserMSAService userMSAService;


    public BusinessLookup() {
        this.agencyMTAService = new AgencyMTAService();
        this.agencyMSAService = null;
        this.airlineMTAService = new AirlineMTAService();
        this.airlineMSAService = null;
        this.hotelMTAService = new HotelMTAService();
        this.hotelMSAService = null;
        this.userMTAService = new UserMTAService();
        this.userMSAService = null;
    }

    public AgencyService getAgencyMTAService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.agencyMTAService : this.agencyMSAService;
    }
    
    public AirlineService getAirlineService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.airlineMTAService : this.airlineMSAService;
    }

    public HotelService getHotelService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.hotelMTAService : this.hotelMSAService;
    }
    
    public UserService getUserService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.userMTAService : this.userMSAService;
    }

}