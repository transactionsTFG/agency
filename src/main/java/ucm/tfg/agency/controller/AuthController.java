package ucm.tfg.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.businessdelegate.BusinessDelegate;
import ucm.tfg.agency.business.services.auth.AuthService;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.dto.user.LoginUserDTO;
import ucm.tfg.agency.common.dto.user.RegisterUserDTO;
import ucm.tfg.agency.common.dto.user.ReponseUserDTO;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@AllArgsConstructor
@RequestMapping("/auth")
public class AuthController {
    private final AuthService authService;

    @GetMapping
    public String login() {
        return "login";
    }

    @PostMapping
    public String loginForm(@ModelAttribute LoginUserDTO userDTO, Model model) {
        Result<ReponseUserDTO> response = this.authService.login(userDTO);
        if (response.isSuccess())
             return "redirect:/index";

        model.addAttribute("error", response.getMessage());
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String registerForm(@ModelAttribute RegisterUserDTO registerUserDTO, Model model) {
        Result<Long> response = this.authService.create(registerUserDTO);
        if (response.isSuccess())
            return "redirect:/index";
        model.addAttribute("error", response.getMessage());
        return "register";
    }
    
}
