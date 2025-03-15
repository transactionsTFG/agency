package ucm.tfg.agency.controller;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ucm.tfg.agency.common.auth.AuthUser;


@Controller
@RequestMapping("/profile")
public class ProfileController {
    
    @GetMapping
    public String index(Model model) {
        return "profile";
    }
    
}
