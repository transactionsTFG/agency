package ucm.tfg.agency.business.businessdelegate.user;

import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.Response;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.dto.user.UserDTO;
import ucm.tfg.agency.common.mapper.GatewayAgencyMapper;
import ucm.tfg.agency.common.utils.ConnectionGateway;

public class UserMSAService implements UserService {

    private final WebClient webClient = ConnectionGateway.webClient();


    @Override
    public Result<Long> createUser(RegisterUserDTO registerUserDTO) { 
        Response response = this.webClient.post()
                .uri("/user/create")
                .bodyValue(registerUserDTO)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 201) 
            return Result.success(0L);
         else 
            return Result.failure("Error creating user ");
        
    }

    @Override
    public Result<ReponseUserDTO> loginUser(LoginUserDTO userDTO) { 
        Response response = this.webClient.post()
                .uri("/user/login")
                .bodyValue(userDTO)
                .retrieve()
                .bodyToMono(Response.class)
                .block();
        if (response != null && response.getStatus() == 200) 
            return Result.success(GatewayAgencyMapper.INSTANCE.responseUserDTO(response.readEntity(UserDTO.class)));
         else 
            return Result.failure("Error logging in user ");
    }
    
}
