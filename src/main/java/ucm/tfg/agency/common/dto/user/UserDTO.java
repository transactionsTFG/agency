package ucm.tfg.agency.common.dto.user;

import lombok.Data;
import ucm.tfg.agency.common.enums.SagaPhases;

@Data
public class UserDTO {
    private long id;
    private Boolean active;
    private String born;
    private String email;
    private String name;
    private String password;
    private String phone;
    private String surname;
    private String typeUser;
    private SagaPhases status;
}
