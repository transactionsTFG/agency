package ucm.tfg.agency.common.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import ucm.tfg.agency.common.enums.TypeUser;

@Data
@AllArgsConstructor
@Builder
public class RegisterUserDTO {
    private String name;
    private String surname;
    private String email;
    private String password;
    private String passport;
    private String born;
    private TypeUser typeUser;
}
