package ucm.tfg.agency.common.auth;


import ucm.tfg.agency.common.dto.user.ReponseUserDTO;

public class AuthUser {
    private final ReponseUserDTO user;
    public AuthUser(ReponseUserDTO user) {
        this.user = user;
    }

    public long getId() {
        return this.user.getId();
    }

    public String getEmail() {
        return this.user.getEmail();
    }
    
    public String getBorn() {
        return this.user.getBorn();
    }

    public String getName() {
        return this.user.getName();
    }

    public String getSurname() {
        return this.user.getSurname();
    }

}
