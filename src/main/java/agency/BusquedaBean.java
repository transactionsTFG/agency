package agency;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.Date;

@RequestScoped
@Named
public class BusquedaBean {
    
    private String busqueda;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroAdultos;
    private int numeroHabitaciones;
    
    private String success;
    public String buscar() {
        this.success = "Busqueda realizada: " + busqueda + " " + fechaEntrada + " " + fechaSalida + " " + numeroAdultos + " " + numeroHabitaciones;
        return "/index";
    }

    public String getBusqueda() {
        return busqueda;
    }
    public void setBusqueda(String busqueda) {
        this.busqueda = busqueda;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getNumeroAdultos() {
        return numeroAdultos;
    }

    public void setNumeroAdultos(int numeroAdultos) {
        this.numeroAdultos = numeroAdultos;
    }

    public int getNumeroHabitaciones() {
        return numeroHabitaciones;
    }

    public void setNumeroHabitaciones(int numeroHabitaciones) {
        this.numeroHabitaciones = numeroHabitaciones;
    }

}
