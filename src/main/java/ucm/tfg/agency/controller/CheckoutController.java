package ucm.tfg.agency.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import lombok.AllArgsConstructor;
import ucm.tfg.agency.business.services.agency.AgencyService;
import ucm.tfg.agency.business.services.airline.AirlineService;
import ucm.tfg.agency.business.services.hotel.HotelService;
import ucm.tfg.agency.common.dto.agency.CreateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.CreateBookingReservationDTO;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.airline.FlightInstanceAirlineDTO;
import ucm.tfg.agency.common.dto.hotel.RoomDTO;
import ucm.tfg.agency.common.utils.AuthUtil;
import ucm.tfg.agency.common.utils.DateParser;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/checkout")
@AllArgsConstructor
public class CheckoutController {
    
    private final AirlineService airlineService;
    private final HotelService hotelService;
    private final AgencyService agencyService;

    @GetMapping("/hotel/{idHotel}")
    public String checkoutHotel(@PathVariable long idHotel, Model model) {
        RoomDTO room = this.hotelService.getRoomById(idHotel).getData();
        model.addAttribute("room", room);
        return "checkout-hotel";
    }

    @PostMapping("/hotel")
    public String reservationHotel(@RequestParam String startDate, @RequestParam String endDate, 
                                    @RequestParam int numberOfNights, @RequestParam(name = "withBreakfast", defaultValue = "false") boolean withBreakfast, 
                                    @RequestParam int peopleNumber, @RequestParam long roomId, @RequestParam String dni) {
        CreateBookingReservationDTO booking = new CreateBookingReservationDTO();
        booking.setStartDate(DateParser.parserLocalDateClientToBackendFormat(startDate));
        booking.setEndDate(DateParser.parserLocalDateClientToBackendFormat(endDate));
        booking.setNumberOfNights(numberOfNights);
        booking.setWithBreakfast(Boolean.TRUE.equals(withBreakfast));
        booking.setPeopleNumber(peopleNumber);
        booking.setRoomId(List.of(Long.valueOf(roomId)));
        this.hotelService.makeHotelBooking(booking, AuthUtil.getAuth().getId(), dni);
        return "redirect:/profile";
    }
    
    @GetMapping("/flight/{idFlightInstance}")
    public String checkoutFlight(@PathVariable long idFlightInstance, Model model) {
        FlightInstanceAirlineDTO flight = this.airlineService.searchFlightInstance(idFlightInstance);
        model.addAttribute("flight", flight);
        return "checkout-airline";
    }

    @PostMapping("/flight")
    public String reservationFlight(@RequestParam int numberOfSeats, @RequestParam long flightInstanceId, @RequestParam String dni) {
        this.airlineService.makeFlightReservation(dni, AuthUtil.getAuth().getId(), List.of(new IdFlightInstanceWithSeatsDTO(flightInstanceId, numberOfSeats)));
        return "redirect:/profile";
    }

    @GetMapping("/{idHotel}/{idFlightInstance}")
    public String checkout(@PathVariable long idHotel, @PathVariable long idFlightInstance, Model model) {
        int price = 0;
        RoomDTO room = this.hotelService.getRoomById(idHotel).getData();
        price += room.getDailyPrice();
        model.addAttribute("room", room);
        FlightInstanceAirlineDTO flight = this.airlineService.searchFlightInstance(idFlightInstance);
        price += flight.getPrice();
        model.addAttribute("flight", flight);
        model.addAttribute("price", price);
        return "checkout-airlinehotel";
    }


    

    @PostMapping("/flighthotel")
    public String reservationHotelFlight(@RequestParam String startDate, @RequestParam String endDate, 
                @RequestParam int numberOfNights, @RequestParam(name = "withBreakfast", defaultValue = "false") boolean withBreakfast, 
                @RequestParam int peopleNumber, @RequestParam long roomId, @RequestParam int numberOfSeats, @RequestParam long flightInstanceId, @RequestParam String dni) {
        CreateBookingReservationDTO booking = new CreateBookingReservationDTO();
        booking.setStartDate(DateParser.parserLocalDateClientToBackendFormat(startDate));
        booking.setEndDate(DateParser.parserLocalDateClientToBackendFormat(endDate));
        booking.setNumberOfNights(numberOfNights);
        booking.setWithBreakfast(Boolean.TRUE.equals(withBreakfast));
        booking.setPeopleNumber(peopleNumber);
        booking.setRoomId(List.of(Long.valueOf(roomId)));
        CreateAirlineReservationDTO flight = new CreateAirlineReservationDTO(dni, AuthUtil.getAuth().getId(), List.of(new IdFlightInstanceWithSeatsDTO(flightInstanceId, numberOfSeats)));
        this.agencyService.makeFlightAndHotelReservation(flight, booking);
        return "redirect:/profile";
    }
}
