package ucm.tfg.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.airline.AirlineService;
import ucm.tfg.agency.business.services.hotel.HotelService;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.soapclient.airlineflight.FlightInstanceDTO;

@Controller
@RequestMapping("/checkout")
@AllArgsConstructor
public class CheckoutController {
    
    private final AirlineService airlineService;
    private final HotelService hotelService; 

    @GetMapping("/{idHotel}/{idFlightInstance}")
    public String checkout(@PathVariable long idHotel, @PathVariable long idFlightInstance, Model model) {

        if (idHotel > 0) {
            Result<RoomDTO> room = this.hotelService.getRoomById(idHotel);
            model.addAttribute("room", room.getData());
        }
        if (idFlightInstance > 0) {
            FlightInstanceDTO flight = this.airlineService.searchFlightInstance(idFlightInstance);
            model.addAttribute("flight", flight);
        }

        return "checkout";
    }

}
