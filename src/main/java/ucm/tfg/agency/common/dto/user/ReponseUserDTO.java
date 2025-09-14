package ucm.tfg.agency.common.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReponseUserDTO {
    private boolean active;
    private String born;
    private String email;
    private long id;
    private String name;
    private String phone;
    private String passport;
    private String surname;
    private String type;
}

