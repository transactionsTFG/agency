package ucm.tfg.agency.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.security.core.context.SecurityContextHolder;
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
import ucm.tfg.agency.common.auth.AuthUser;
import ucm.tfg.agency.common.dto.agency.BookingDTO;
import ucm.tfg.agency.common.dto.agency.FlightHotelDTO;
import ucm.tfg.agency.common.dto.agency.IdFlightInstanceWithSeatsDTO;
import ucm.tfg.agency.common.dto.agency.ReservationDTO;
import ucm.tfg.agency.common.dto.agency.TravelDTO;
import ucm.tfg.agency.common.dto.agency.UpdateAirlineReservationDTO;
import ucm.tfg.agency.common.dto.agency.UpdateBookingReservationDTO;
import ucm.tfg.agency.common.dto.airline.FlightAirlineDTO;
import ucm.tfg.agency.common.dto.patternresult.Result;
import ucm.tfg.agency.common.utils.AuthUtil;
import ucm.tfg.agency.common.utils.DateParser;
import ucm.tfg.agency.soapclient.hotelroom.BookingLineDTO;

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
        else if (listTravel.isSuccess() && listTravel.getData().isEmpty())
            model.addAttribute("msg", this.messageSource.getMessage("app.profile.dontbuy", null, locale));
        else
            model.addAttribute("msg", listTravel.getMessage());

        model.addAttribute("totalReservas", totalReservas);
        return "profile";
    }

    @PostMapping("/removeTravel/{travelId}/{idFlight}/{idHotel}")
    public String deleteTravel(@PathVariable long travelId, @PathVariable long idFlight, @PathVariable long idHotel,
            RedirectAttributes redirectAttributes) {
        Result<Double> result = null;
        if (idFlight > 0 && idHotel > 0)
            result = this.agencyService.cancelFlightAndHotelReservation(travelId, idFlight, idHotel);

        if (idFlight > 0 && idHotel <= 0)
            result = this.airlineService.cancelFlightReservation(travelId, idFlight);

        if (idFlight <= 0 && idHotel > 0)
            result = this.hotelService.cancelHotelBooking(travelId, idHotel);
        
        redirectAttributes.addFlashAttribute("priceReturn", result.getData());
        return "redirect:/profile";
    }

    @GetMapping("modifyTravel/{idFlight}/{idHotel}")
    public String modifyTravel(@PathVariable long idFlight, @PathVariable long idHotel,  @RequestParam(required = false) Long idTravel,
            RedirectAttributes redirectAttributes, Model model) {
        if (idFlight != -1 && idHotel != -1) {
            Result<FlightHotelDTO> flightHoteResult = this.agencyService.getFlightAndHotelReservation(idFlight,
                    idHotel);
            ReservationDTO flightResult = this.airlineService.getFlightReservation(idFlight);
            Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>> flightReservationsResult = this.airlineService
                    .getFlightsByReservation(flightResult.getId());
            Result<List<BookingLineDTO>> bookingLinesResult = this.hotelService.getRoomsByBooking(idHotel);
            List<BookingLineDTO> bookingLineDTOs = bookingLinesResult.getData();
            try {
                model.addAttribute("idTravel", idTravel);
                model.addAttribute("flight", flightResult);
                if (!flightReservationsResult.getData().isEmpty())
                    model.addAttribute("flightInstance", flightReservationsResult.getData().get(0));
                else
                    model.addAttribute("errorVuelos", "Ha ocurrido un error al leer los vuelos");
                model.addAttribute("booking", flightHoteResult.getData().getBooking());
                model.addAttribute("roomList", bookingLineDTOs);
                return "modifyTravel";
            } catch (Exception e) {
                return "redirect:/profile";
            }
        }
        if (idFlight != -1) {
            return "redirect:/profile/modifyFlight/" + idFlight + "?idTravel=" + idTravel;
        }
        if (idHotel != -1) {
            return "redirect:/profile/modifyHotel/" + idHotel + "?idTravel=" + idTravel;
        }
        return "redirect:/profile";
    }

    @PostMapping("modifyTravel")
    public String modifyTravelPost(@RequestParam long bookingId,
            @RequestParam Boolean withBreakfast,
            @RequestParam int peopleNumber,
            @RequestParam long roomId,
            @RequestParam LocalDate startDate,
            @RequestParam LocalDate endDate,
            @RequestParam int numberOfNights,
            @RequestParam long idReservation,
            @RequestParam long idFlightInstance,
            @RequestParam(required = false) Long idTravel,
            @RequestParam int seats) {
        UpdateBookingReservationDTO updateBookingReservationDTO = new UpdateBookingReservationDTO();
        updateBookingReservationDTO.setId(bookingId);
        updateBookingReservationDTO.setStartDate(startDate.toString());
        updateBookingReservationDTO.setEndDate(endDate.toString());
        updateBookingReservationDTO.setNumberOfNights(numberOfNights);
        updateBookingReservationDTO.setWithBreakfast(withBreakfast);
        updateBookingReservationDTO.setPeopleNumber(peopleNumber);
        updateBookingReservationDTO.setCustomerId(AuthUtil.getAuth().getId());
        updateBookingReservationDTO.setRoomId(Arrays.asList(roomId));
        UpdateAirlineReservationDTO updateAirlineReservationDTO = new UpdateAirlineReservationDTO();
        updateAirlineReservationDTO.setIdReservation(idReservation);
        IdFlightInstanceWithSeatsDTO flightInstanceWithSeats = new IdFlightInstanceWithSeatsDTO(idFlightInstance,
                seats);
        updateAirlineReservationDTO.setListIdFlightInstanceSeats(Arrays.asList(flightInstanceWithSeats));
        this.agencyService.modifyFlightAndHotelReservation(idTravel, updateBookingReservationDTO, updateAirlineReservationDTO);
        return "redirect:/profile";
    }

    @GetMapping("modifyFlight/{flightId}")
    public String modifyFlight(@PathVariable long flightId,  @RequestParam(required = false) Long idTravel, Model model) {
        ReservationDTO flightResult = this.airlineService.getFlightReservation(flightId);
        Result<List<ucm.tfg.agency.soapclient.airlineflight.IdFlightInstanceWithSeatsDTO>> flightReservationsResult = this.airlineService
                .getFlightsByReservation(flightResult.getId());
        model.addAttribute("flight", flightResult);
        model.addAttribute("idTravel", idTravel);
        if (!flightReservationsResult.getData().isEmpty())
            model.addAttribute("flightInstance", flightReservationsResult.getData().get(0));
        else
            model.addAttribute("errorVuelos", "Ha ocurrido un error al leer los vuelos");
        return "modifyFlight";
    }

    @GetMapping("modifyHotel/{bookingId}")
    public String modifyHotel(@PathVariable long bookingId, @RequestParam(required = false) Long idTravel, Model model) {
        Result<BookingDTO> bookingResult = this.hotelService.getHotelBooking(bookingId);
        Result<List<BookingLineDTO>> bookingLinesResult = this.hotelService.getRoomsByBooking(bookingId);
        List<BookingLineDTO> bookingLineDTOs = bookingLinesResult.getData();
        // bookingLineDTOs.forEach(bl -> {
        //     bl.setStartDate(DateParser.parserLocalDateClientToFrontEnd(bl.getStartDate()));
        //     bl.setEndDate(DateParser.parserLocalDateClientToFrontEnd(bl.getEndDate()));
        // });
        model.addAttribute("idTravel", idTravel);
        model.addAttribute("booking", bookingResult.getData());
        model.addAttribute("roomList", bookingLineDTOs);
        return "modifyHotel";
    }

    @PostMapping("modifyHotel")
    public String modifyHotelPost(@RequestParam long bookingId,
            @RequestParam Boolean withBreakfast, @RequestParam int peopleNumber, @RequestParam long roomId,
            @RequestParam LocalDate startDate, @RequestParam LocalDate endDate, @RequestParam int numberOfNights,  @RequestParam(required = false) Long idTravel) {
        UpdateBookingReservationDTO booking = new UpdateBookingReservationDTO();
        booking.setId(bookingId);
        booking.setStartDate(DateParser.parserLocalDateClientToBackendFormat(startDate.toString()));
        booking.setEndDate(DateParser.parserLocalDateClientToBackendFormat(endDate.toString()));
        booking.setNumberOfNights(numberOfNights);
        booking.setWithBreakfast(withBreakfast);
        booking.setPeopleNumber(peopleNumber);
        booking.setCustomerId(AuthUtil.getAuth().getId());
        booking.setRoomId(Arrays.asList(roomId));
        booking.setIdTravel(idTravel);
        this.hotelService.modifyHotelBooking(booking);
        return "redirect:/profile";
    }

    @PostMapping("modifyFlight")
    public String modifyFlightPost(@RequestParam long idReservation, @RequestParam long idFlightInstance, @RequestParam(required = false) Long idTravel,
            @RequestParam int seats) {
        IdFlightInstanceWithSeatsDTO flightInstanceWithSeats = new IdFlightInstanceWithSeatsDTO(idFlightInstance,
                seats);
        this.airlineService.modifyFlightReservation(idTravel, idReservation, Arrays.asList(flightInstanceWithSeats));
        return "redirect:/profile";
    }

}
