package ucm.tfg.agency.business.businessdelegate;

import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
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

    public Result<Long> createUser(final RegisterUserDTO registerUserDTO) {
        return this.lookupService.getUserService(this.typeService).createUser(registerUserDTO);
    }

    public Result<ReponseUserDTO> loginUser(final LoginUserDTO userDTO) {
        return this.lookupService.getUserService(this.typeService).loginUser(userDTO);
    }

    
}