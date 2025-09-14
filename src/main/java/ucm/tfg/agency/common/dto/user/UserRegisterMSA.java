package ucm.tfg.agency.common.dto.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterMSA {
    protected String name;
    protected String surname;
    protected String email;
    protected String password;
    protected String born;
    protected String phone;
    protected int typeUser;
}
