package ucm.tfg.agency.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
@RequestMapping("/offers")
public class OfferController {

    @GetMapping
    public String offers(Model model) {
        final boolean isActivePanelMeanwhileRedirect = model.containsAttribute("activePanel");
        final int activePanelMeanwhileRedirect = isActivePanelMeanwhileRedirect ? (int) model.getAttribute("activePanel") : 1;
        if (isActivePanelMeanwhileRedirect && activePanelMeanwhileRedirect == 1) {
            model.addAttribute("hotel", model.getAttribute("hotel"));
            model.addAttribute("country", model.getAttribute("country"));
        } else if (isActivePanelMeanwhileRedirect && activePanelMeanwhileRedirect == 2) {
            model.addAttribute("countryOrigin", model.getAttribute("countryOrigin"));
            model.addAttribute("countryDestination", model.getAttribute("countryDestination"));
            model.addAttribute("cityOrigin", model.getAttribute("cityOrigin"));
            model.addAttribute("cityDestination", model.getAttribute("cityDestination"));
            model.addAttribute("date", model.getAttribute("date"));
        } else if (isActivePanelMeanwhileRedirect && activePanelMeanwhileRedirect == 3) {
            model.addAttribute("hotel", model.getAttribute("hotel"));
            model.addAttribute("countryOrigin", model.getAttribute("countryOrigin"));
            model.addAttribute("countryDestination", model.getAttribute("countryDestination"));
            model.addAttribute("cityOrigin", model.getAttribute("cityOrigin"));
            model.addAttribute("cityDestination", model.getAttribute("cityDestination"));
            model.addAttribute("date", model.getAttribute("date"));
        }

        model.addAttribute("activePanel", activePanelMeanwhileRedirect);
        return "offers";
    }
}
