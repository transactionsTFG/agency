package ucm.tfg.agency.business.businessdelegate.user;

import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import jakarta.ws.rs.core.Response;
import reactor.core.publisher.Mono;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;
import ucm.tfg.agency.common.dto.user.UserDTO;
import ucm.tfg.agency.common.dto.user.UserRegisterMSA;
import ucm.tfg.agency.common.mapper.GatewayAgencyMapper;
import ucm.tfg.agency.common.utils.ConnectionGateway;

public class UserMSAService implements UserService {

    private final WebClient webClient = ConnectionGateway.webClient();


    @Override
    public Result<Long> createUser(RegisterUserDTO registerUserDTO) { 
        UserRegisterMSA userRegisterMSA = new UserRegisterMSA();
        userRegisterMSA.setEmail(registerUserDTO.getEmail());
        userRegisterMSA.setPassword(registerUserDTO.getPassword());
        userRegisterMSA.setBorn(registerUserDTO.getBorn());
        userRegisterMSA.setTypeUser(registerUserDTO.getTypeUser().getIdType());
        userRegisterMSA.setSurname(registerUserDTO.getSurname());
        userRegisterMSA.setName(registerUserDTO.getName());
        userRegisterMSA.setPhone(registerUserDTO.getPhone());
        ResponseEntity<Void> response = this.webClient.post()
                .uri("/user/create")
                .bodyValue(userRegisterMSA)
                .retrieve()
                .toBodilessEntity()
                .block();
        if (response != null && response.getStatusCode().value() == 201) 
            return Result.success(0L);
         else 
            return Result.failure("Error creating user ");
        
    }

    @Override
    public Result<ReponseUserDTO> loginUser(LoginUserDTO userDTO) { 
        try {
        UserDTO user = this.webClient.post()
            .uri("/user")
            .bodyValue(userDTO)
            .retrieve()
            .onStatus(HttpStatusCode::is4xxClientError,
                      resp -> Mono.error(new RuntimeException("Usuario no encontrado")))
            .onStatus(HttpStatusCode::is5xxServerError,
                      resp -> Mono.error(new RuntimeException("Error del servidor de autenticación")))
            .bodyToMono(UserDTO.class)
            .block();

            if (user != null) {
                return Result.success(GatewayAgencyMapper.INSTANCE.responseUserDTO(user));
            }
            return Result.failure("Usuario no encontrado");
        } catch (Exception e) {
            return Result.failure("Usuario no encontrado");
        }
    }
    
}
