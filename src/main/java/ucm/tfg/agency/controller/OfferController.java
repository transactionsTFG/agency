package ucm.tfg.agency.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.agency.AgencyService;
import ucm.tfg.agency.business.services.airline.AirlineService;
import ucm.tfg.agency.business.services.hotel.HotelService;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.utils.StringUtils;


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
        if (isActivePanelMeanwhileRedirect && activePanelMeanwhileRedirect == 1 || (!isActivePanelMeanwhileRedirect && activePanelMeanwhileRedirect == 1)) {
            String hotel = (StringUtils.hasText(model.getAttribute("hotel"))) ? (String) model.getAttribute("hotel") : null;
            String country = StringUtils.hasText(model.getAttribute("country")) ? (String) model.getAttribute("country") : null;
            model.addAttribute("hotel", hotel);
            model.addAttribute("country", country);
            List<RoomInfoDTO> rooms = this.hotelService.getAllRooms(hotel, country).getData();
            model.addAttribute("listRoom", rooms);
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

    @PostMapping("/hotel")
    public String getHotel(@RequestParam String hotel, @RequestParam String country, RedirectAttributes redirectAttributes) {
        hotel = StringUtils.hasText(country) ? hotel : null;
        country = StringUtils.hasText(country) ? country : null;
        redirectAttributes.addFlashAttribute("hotel", hotel);
        redirectAttributes.addFlashAttribute("country", country);
        redirectAttributes.addFlashAttribute("activePanel", 1);
        return "redirect:/offers";
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
