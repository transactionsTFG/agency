package ucm.tfg.agency.common.utils;

import org.springframework.security.core.context.SecurityContextHolder;

import ucm.tfg.agency.common.auth.AuthUser;

public class AuthUtil {
    private AuthUtil() {}

    public static AuthUser getAuth() {
        return (AuthUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
