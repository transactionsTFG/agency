package agency;

public class TVueloHotel {
	
	private String origen, destino, fechaInicio, fechaFin;
	private int numAdultos, numHabitaciones;
	
	public TVueloHotel(String origen, String destino, String fechaInicio, String fechaFin, int numAdultos,
			int numHabitaciones) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.numAdultos = numAdultos;
		this.numHabitaciones = numHabitaciones;
	}
	public String getOrigen() {
		return origen;
	}
	public void setOrigen(String origen) {
		this.origen = origen;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public String getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public String getFechaFin() {
		return fechaFin;
	}
	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
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
		return "TVueloHotel [origen=" + origen + ", destino=" + destino + ", fechaInicio=" + fechaInicio + ", fechaFin="
				+ fechaFin + ", numAdultos=" + numAdultos + ", numHabitaciones=" + numHabitaciones + "]";
	}
	
	
	
}
