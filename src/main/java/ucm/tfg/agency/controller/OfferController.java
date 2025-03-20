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
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
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
            String countryOrigin = StringUtils.hasText(model.getAttribute("countryOrigin")) ? (String) model.getAttribute("countryOrigin") : null;
            String countryDestination = StringUtils.hasText(model.getAttribute("countryDestination")) ? (String) model.getAttribute("countryDestination") : null;
            String cityOrigin = StringUtils.hasText(model.getAttribute("cityOrigin")) ? (String) model.getAttribute("cityOrigin") : null;
            String cityDestination = StringUtils.hasText(model.getAttribute("cityDestination")) ? (String) model.getAttribute("cityDestination") : null;
            String date = StringUtils.hasText(model.getAttribute("date")) ? (String) model.getAttribute("date") : null;
            Result<List<FlightAirlineInfoDTO>> flights  = this.airlineService.getAllFlights(countryOrigin, countryDestination, cityOrigin, cityDestination, date);
            model.addAttribute("countryOrigin", countryOrigin);
            model.addAttribute("countryDestination", countryDestination);
            model.addAttribute("cityOrigin", cityOrigin);
            model.addAttribute("cityDestination", cityDestination);
            model.addAttribute("date", date);
            model.addAttribute("listFlight", flights.getData());
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

    @PostMapping("/flight")
    public String getFlight(@RequestParam String countryOrigin, @RequestParam String countryDestination, @RequestParam String cityOrigin, @RequestParam String cityDestination, @RequestParam String date, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("countryOrigin", countryOrigin);
        redirectAttributes.addFlashAttribute("countryDestination", countryDestination);
        redirectAttributes.addFlashAttribute("cityOrigin", cityOrigin);
        redirectAttributes.addFlashAttribute("cityDestination", cityDestination);
        redirectAttributes.addFlashAttribute("date", date);
        redirectAttributes.addFlashAttribute("activePanel", 2);
        return "redirect:/offers";
    }

    @GetMapping("/package/{hotelId}/{flightId}")
    public String getOffer(@PathVariable("hotelId") long offerId, @PathVariable("flightId") long flightId) {
        return "single_listing";
    }
    
}
