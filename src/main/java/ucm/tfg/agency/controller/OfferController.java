package ucm.tfg.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.agency.AgencyService;
import ucm.tfg.agency.business.services.airline.AirlineService;
import ucm.tfg.agency.business.services.hotel.HotelService;


@Controller
@AllArgsConstructor
@RequestMapping("/offers")
public class OfferController {

    private final HotelService hotelService;
    private final AirlineService airlineService;
    private final AgencyService agencyService;

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

    @GetMapping("/hotel/{hotelId}")
    public String getHotel(@PathVariable("hotelId") long offerId) {
        return "single_listing";
    }

    @GetMapping("/flight/{flightId}")
    public String getFlight(@PathVariable("flightId") long flightId) {
        return "single_listing";
    }

    @GetMapping("/package/{hotelId}/{flightId}")
    public String getOffer(@PathVariable("hotelId") long offerId, @PathVariable("flightId") long flightId) {
        return "single_listing";
    }
    
}
