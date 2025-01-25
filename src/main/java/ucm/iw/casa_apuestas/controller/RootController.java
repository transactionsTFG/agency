package ucm.iw.casa_apuestas.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {

    private static Logger log = LogManager.getLogger(
        RootController.class);

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
