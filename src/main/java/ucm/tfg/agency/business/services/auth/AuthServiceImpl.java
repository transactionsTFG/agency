package ucm.tfg.agency.business.services.auth;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.enums.TypeUser;

@Service
@AllArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final BusinessDelegate businessDelegate;

    @Override
    public Result<ReponseUserDTO> login(LoginUserDTO userDTO) {
        return this.businessDelegate.loginUser(userDTO);
    }

    @Override
    public Result<Long> create(RegisterUserDTO registerUserDTO) {
        registerUserDTO.setTypeUser(TypeUser.CLIENT);
        final Result<Long> response = this.businessDelegate.createUser(registerUserDTO);
        if (!response.isSuccess()) 
            return response;
        
        
        return this.businessDelegate.createUser(registerUserDTO);
    }
    
}
