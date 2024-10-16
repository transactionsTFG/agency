package agency;

import java.util.ArrayList;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Alojamientos {
	
	private String destino, fechaEntrada, fechaSalida, resultado;
	private int numAdultos, numHabitaciones;
	private ArrayList<TAlojamiento> listaResultados;
	
	public void buscar() {
		this.listaResultados = new ArrayList<TAlojamiento>();
		this.listaResultados.add(new TAlojamiento("Albacete", "01/01/2025", "01/02/2025", 1, 1));
		this.listaResultados.add(new TAlojamiento("Peñafría", "01/01/2025", "01/02/2025", 1, 1));
		this.listaResultados.add(new TAlojamiento("Zamora", "01/01/2025", "01/02/2025", 1, 1));
//		this.resultado = "Destino 1: Albacete\n" +
//						  "Fecha de entrada: 01/01/2025\n" +
//						  "Fecha de salida: 01/02/2025\n" +
//						  "Numero de adultos: 1\n" +
//						  "Numero de habitaciones: 1\n" +
//						  "Destino 2: Peñafría\n" +
//				 		  "Fecha de entrada: 01/01/2025\n" +
//				 		  "Fecha de salida: 01/02/2025\n" +
//				 		  "Numero de adultos: 1\n" +
//				 		  "Numero de habitaciones: 1\n" +
//				 		  "Destino 3: Zamora\n" +
//						  "Fecha de entrada: 01/01/2025\n" +
//						  "Fecha de salida: 01/02/2025\n" +
//						  "Numero de adultos: 1\n" +
//						  "Numero de habitaciones: 1\n";
	}
	
	public ArrayList<TAlojamiento> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(ArrayList<TAlojamiento> listaResultados) {
		this.listaResultados = listaResultados;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
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

	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public int getNumAdultos() {
		return numAdultos;
	}

	public void setNumAdultos(int numAdultos) {
		this.numAdultos = numAdultos;
	}

	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}
	
}
