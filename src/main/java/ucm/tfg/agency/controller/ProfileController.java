package ucm.tfg.agency.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.agency.AgencyService;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;

@Controller
@RequestMapping("/profile")
@AllArgsConstructor
public class ProfileController {
    
    private final AgencyService agencyService;
    private final MessageSource messageSource;

    @GetMapping
    public String index(Model model, Locale locale) {
        AuthUser auth = (AuthUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Result<List<TravelDTO>> listTravel = this.agencyService.getTravelsByUser(auth.getId());
        int totalReservas = listTravel.isSuccess() ? listTravel.getData().size() : 0;
        if (listTravel.isSuccess() && !listTravel.getData().isEmpty()) 
            model.addAttribute("travels", listTravel.getData());
        else if(listTravel.isSuccess() && listTravel.getData().isEmpty())
            model.addAttribute("msg", this.messageSource.getMessage("app.profile.dontbuy", null, locale));
        else         
            model.addAttribute("msg", listTravel.getMessage());

        model.addAttribute("totalReservas", totalReservas);
        return "profile";
    }
    
}
