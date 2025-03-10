package ucm.tfg.agency.business.businessdelegate.user;

import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;

public class UserMSAService implements UserService {

    @Override
    public Result<Long> createUser(RegisterUserDTO registerUserDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createUser'");
    }

    @Override
    public Result<ReponseUserDTO> loginUser(LoginUserDTO userDTO) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'loginUser'");
    }
    
}
