package ucm.tfg.agency.business.businessdelegate.user;

import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;

public interface UserService {
    Result<Long> createUser(final RegisterUserDTO registerUserDTO);
    Result<ReponseUserDTO> loginUser(final LoginUserDTO userDTO);
}
