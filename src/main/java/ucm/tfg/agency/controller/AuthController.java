package ucm.tfg.agency.controller;

import org.springframework.stereotype.Controller;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final BusinessDelegate businessDelegate;

    @GetMapping
    public String login() {
        return "login";
    }

    @PostMapping
    public String loginForm() {
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "index";
    }

    @PostMapping("/register")
    public String registerForm() {
        return "index";
    }
    
}
