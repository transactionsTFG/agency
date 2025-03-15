package ucm.tfg.agency.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.agency.AgencyService;
import ucm.tfg.agency.business.services.airline.AirlineService;
import ucm.tfg.agency.business.services.hotel.HotelService;
import ucm.tfg.agency.common.dto.agency.ListFlightHotelDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineInfoDTO;
import ucm.tfg.agency.common.dto.hotel.RoomInfoDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@AllArgsConstructor
public class RootController {

    private final AgencyService agencyService;
    private final AirlineService airlineService;
    private final HotelService hotelService;

    @GetMapping({ "/", "index" })
    public String index(Model model) {
        Result<Map<String, ListFlightHotelDTO>> resultFlightsAndHotels = agencyService.getFlightsAndHotels(null, null, null, null, null, null);
        Result<List<FlightAirlineInfoDTO>> resultFlights = airlineService.getAllFlights(null, null, null, null, null);
        Result<List<RoomInfoDTO>> getAllRooms = hotelService.getAllRooms(null, null);
        Map<String, ListFlightHotelDTO> data = resultFlightsAndHotels.isSuccess() ? resultFlightsAndHotels.getData() : new HashMap<>();
        List<FlightAirlineInfoDTO> flights = resultFlights.isSuccess() ? resultFlights.getData().stream().limit(3).toList() : new ArrayList<>();
        List<RoomInfoDTO> rooms = getAllRooms.isSuccess() ? getAllRooms.getData().stream().limit(4).toList() : new ArrayList<>();   
        model.addAttribute("flightsAndHotels", data);
        model.addAttribute("flights", flights);
        model.addAttribute("rooms", rooms);
        return "index";
    }

    @PostMapping("/search/hotel")
    public String searchHotel(@RequestParam String hotel, 
                            @RequestParam String country, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("hotel", hotel);
        redirectAttributes.addFlashAttribute("country", country);
        redirectAttributes.addFlashAttribute("activePanel", 1);
        return "redirect:/offers";
    }
    
    @PostMapping("/search/flight")
    public String searchFlight(@RequestParam String countryOrigin, 
                                @RequestParam String countryDestination,
                                @RequestParam String cityOrigin,
                                @RequestParam String cityDestination,
                                @RequestParam String date, RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("countryOrigin", countryOrigin);
        redirectAttributes.addFlashAttribute("countryDestination", countryDestination);
        redirectAttributes.addFlashAttribute("cityOrigin", cityOrigin);
        redirectAttributes.addFlashAttribute("cityDestination", cityDestination);
        redirectAttributes.addFlashAttribute("date", date);
        redirectAttributes.addFlashAttribute("activePanel", 2);
        return "redirect:/offers";
    }

    @PostMapping("/search/hotelAndFlight")
    public String searchFlightAndHotel(@RequestParam String hotel, 
                                        @RequestParam String countryOrigin, 
                                        @RequestParam String countryDestination,
                                        @RequestParam String cityOrigin,
                                        @RequestParam String cityDestination,
                                        @RequestParam String date, RedirectAttributes redirectAttributes) {
                                            redirectAttributes.addFlashAttribute("hotel", hotel);
                                            redirectAttributes.addFlashAttribute("countryOrigin", countryOrigin);
                                            redirectAttributes.addFlashAttribute("countryDestination", countryDestination);
                                            redirectAttributes.addFlashAttribute("cityOrigin", cityOrigin);
                                            redirectAttributes.addFlashAttribute("cityDestination", cityDestination);
                                            redirectAttributes.addFlashAttribute("date", date);
                                            redirectAttributes.addFlashAttribute("activePanel", 3);
        return "redirect:/offers";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    @GetMapping("/elements")
    public String elements() {
        return "elements";
    }


    @GetMapping("/single_listing")
    public String single_listing() {
        return "single_listing";
    }

}
