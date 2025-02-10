package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.common.enums.TypeService;

public class BusinessDelegate {
    private final BusinessLookup lookupService = new BusinessLookup();
    private final TypeService typeService;

    public BusinessDelegate(TypeService typeService) {
        this.typeService = typeService;
    }

    //TODO... Agregar mas metodos de Agencia

    public void getFlight(long idFlight) {
        this.lookupService.getAirlineService(this.typeService).getFlight(idFlight);
    }
    
}