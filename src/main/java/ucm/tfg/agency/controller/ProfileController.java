package ucm.tfg.agency.controller;

import java.util.List;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.agency.AgencyService;
import ucm.tfg.agency.business.services.airline.AirlineService;
import ucm.tfg.agency.business.services.hotel.HotelService;
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;

@Controller
@RequestMapping("/profile")
@AllArgsConstructor
public class ProfileController {
    
    private final AgencyService agencyService;
    private final AirlineService airlineService;
    private final HotelService hotelService;
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

    @PostMapping("/removeTravel/{idFlight}/{idHotel}")
    public String deleteTravel(@PathVariable long idFlight, @PathVariable long idHotel, RedirectAttributes redirectAttributes) {
        Result<Double> result = null;
        if(idFlight > 0 && idHotel > 0) 
            result = this.agencyService.cancelFlightAndHotelReservation(idFlight, idHotel);
        
        if(idFlight > 0 && idHotel <= 0) 
            result = this.airlineService.cancelFlightReservation(idFlight);

        if(idFlight <= 0 && idHotel > 0) 
            result = this.hotelService.cancelHotelBooking(idHotel);
    
        redirectAttributes.addFlashAttribute("priceReturn", result.getData());
        return "redirect:/profile";
    }
    
}
