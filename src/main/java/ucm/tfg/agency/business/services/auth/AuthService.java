package ucm.tfg.agency.business.services.auth;

import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;

public interface AuthService {
    Result<ReponseUserDTO> login(final LoginUserDTO userDTO);
    Result<Long> create(final RegisterUserDTO registerUserDTO);
}
