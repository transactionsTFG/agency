package ucm.tfg.agency.business.businessdelegate.user;

import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.exception.CatchExceptionSOAP;
import ucm.tfg.agency.soapclient.user.UserDTO;
import ucm.tfg.agency.soapclient.user.UserLoginSOAP;
import ucm.tfg.agency.soapclient.user.UserRegisterSOAP;
import ucm.tfg.agency.soapclient.user.UserWS;
import ucm.tfg.agency.soapclient.user.UserWS_Service;

public class UserMTAService implements UserService {

    private final UserWS portuUserWS;

    public UserMTAService() {
        this.portuUserWS = new UserWS_Service().getUserWSPort();
    }

    @Override
    public Result<Long> createUser(RegisterUserDTO registerUserDTO) {
        UserRegisterSOAP userRegisterSOAP = new UserRegisterSOAP();
        userRegisterSOAP.setEmail(registerUserDTO.getEmail());
        userRegisterSOAP.setPassword(registerUserDTO.getPassword());
        userRegisterSOAP.setBorn(registerUserDTO.getBorn());
        userRegisterSOAP.setIdTypeUser(registerUserDTO.getTypeUser().getIdType());
        userRegisterSOAP.setSurname(registerUserDTO.getSurname());
        userRegisterSOAP.setName(registerUserDTO.getName());
        Result<Long> result = null;
        try {
            result = Result.success(this.portuUserWS.registerUser(userRegisterSOAP));   
        } catch (Exception e) {
            result = Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
        return result;
    }

    @Override
    public Result<ReponseUserDTO> loginUser(LoginUserDTO userDTO) {
        UserLoginSOAP userLoginSOAP = new UserLoginSOAP();
        userLoginSOAP.setEmail(userDTO.getEmail());
        userLoginSOAP.setPassword(userDTO.getPassword());
        Result<ReponseUserDTO> result = null;
        try {
            UserDTO userResponse = this.portuUserWS.loginUser(userLoginSOAP);
            ReponseUserDTO responUserDTO = ReponseUserDTO.builder()
                .active(userResponse.isActive())
                .born(userResponse.getBorn())
                .email(userResponse.getEmail())
                .id(userResponse.getId())
                .name(userResponse.getName())
                .surname(userResponse.getSurname())
                .type(userResponse.getType())
                .build();
            result = Result.success(responUserDTO);
        } catch (Exception e) {
            result = Result.failure(CatchExceptionSOAP.getMessageError(e));
        }
        return result;
    }

}
