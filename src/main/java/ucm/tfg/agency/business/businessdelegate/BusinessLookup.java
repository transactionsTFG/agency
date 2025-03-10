package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.business.businessdelegate.agency.AgencyMSAService;
import ucm.tfg.agency.business.businessdelegate.agency.AgencyMTAService;
import ucm.tfg.agency.business.businessdelegate.agency.AgencyExternalService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineMSAService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineMTAService;
import ucm.tfg.agency.business.businessdelegate.airline.AirlineExternalService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMSAService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelMTAService;
import ucm.tfg.agency.business.businessdelegate.hotel.HotelExternalService;
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
        this.agencyMSAService = new AgencyMSAService();
        this.airlineMTAService = new AirlineMTAService();
        this.airlineMSAService = new AirlineMSAService();
        this.hotelMTAService = new HotelMTAService();
        this.hotelMSAService = new HotelMSAService();
        this.userMTAService = new UserMTAService();
        this.userMSAService = new UserMSAService();
    }

    public AgencyExternalService getAgencyService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.agencyMTAService : this.agencyMSAService;
    }
    
    public AirlineExternalService getAirlineService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.airlineMTAService : this.airlineMSAService;
    }

    public HotelExternalService getHotelService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.hotelMTAService : this.hotelMSAService;
    }
    
    public UserService getUserService(TypeService typeService) {
        return typeService.name().equals(TypeService.MTA.name()) ? this.userMTAService : this.userMSAService;
    }

}