package ucm.tfg.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    @GetMapping("/")
    public String index() {
        return "alojamientos";
    }

    @GetMapping("/alojamientos")
    public String alojamientos() {
        return "alojamientos";
    }

    @GetMapping("/vuelos")
    public String vuelos() {
        return "vuelos";
    }

    @GetMapping("/vuelo_y_hotel")
    public String vueloYHotel() {
        return "vuelo_y_hotel";
    }

}
