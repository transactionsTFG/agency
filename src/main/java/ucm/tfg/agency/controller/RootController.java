package ucm.tfg.agency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }
    @GetMapping("/index")
    public String indexTemplate() {
        return "index";
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
    @GetMapping("/about")
    public String about() {
        return "about";
    }
    @GetMapping("/blog")
    public String blog() {
        return "blog";
    }

    @GetMapping("/elements")
    public String elements() {
        return "elements";
    }
    @GetMapping("/offers")
    public String offers() {
        return "offers";
    }
    @GetMapping("/single_listing")
    public String single_listing() {
        return "single_listing";
    }

}
