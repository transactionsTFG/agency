package agency;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import java.util.Date;

@RequestScoped
@Named
public class BusquedaBean {
    
    private String destino;
    private String fechaEntrada;
    private String fechaSalida;
    private int numeroAdultos;
    private int numeroHabitaciones;
    
    private String success;
    public void buscar() {
        this.success = "Busqueda realizada: " + destino + " " + fechaEntrada + " " + fechaSalida + " " + numeroAdultos + " " + numeroHabitaciones;
//        return "/index";
    }

    public String busqueda() {
    	if (destino.isBlank()) return "No se ha seleccionado un destino";
    	if (fechaEntrada.isBlank()) return "No se ha seleccionado una fecha de entrada";
    	if (fechaSalida.isBlank()) return "No se ha seleccionado una fecha de salida";    	
    	if (numeroAdultos == 0) numeroAdultos++;
    	if (numeroHabitaciones == 0) numeroHabitaciones++;
    	return success;
//    	return "Destino: " + busqueda +
//    			"\n Fecha de entrada: " + fechaEntrada +
//    			"\n Fecha de salida: " + fechaSalida +
//    			"\n Numero de adultos: " + numeroAdultos +
//    			"\n Numero de habitaciones: " + numeroHabitaciones;
    }

    public String getBusqueda() {
        return destino;
    }
    public void setBusqueda(String busqueda) {
        this.destino = busqueda;
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
