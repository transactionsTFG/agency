package agency;

public class TAlojamiento {
	
	private String destino, fechaEntrada, fechaSalida;
	private int numAdultos, numHabitaciones;
	public TAlojamiento(String destino, String fechaEntrada, String fechaSalida, int numAdultos, int numHabitaciones) {
		super();
		this.destino = destino;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numAdultos = numAdultos;
		this.numHabitaciones = numHabitaciones;
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
	@Override
	public String toString() {
		return "Destino: " + this.destino + "\n" +
			    "Fecha de entrada: " + this.fechaEntrada + "\n" +
			    "Fecha de salida: " + this.fechaSalida + "\n" +
			    "Numero de adultos: " + this.numAdultos + "\n" +
			    "Numero de habitaciones: " + this.numHabitaciones + "\n";
				
	}

	
}
