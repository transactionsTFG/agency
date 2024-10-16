package agency;

public class TVuelo {

	private String origen, destino, fechaIda, fechaVuelta;
	private int numAdultos;
	
	public TVuelo(String origen, String destino, String fechaIda, String fechaVuelta, int numAdultos) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fechaIda = fechaIda;
		this.fechaVuelta = fechaVuelta;
		this.numAdultos = numAdultos;
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

	public String getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(String fechaIda) {
		this.fechaIda = fechaIda;
	}

	public String getFechaVuelta() {
		return fechaVuelta;
	}

	public void setFechaVuelta(String fechaVuelta) {
		this.fechaVuelta = fechaVuelta;
	}

	public int getNumAdultos() {
		return numAdultos;
	}

	public void setNumAdultos(int numAdultos) {
		this.numAdultos = numAdultos;
	}

	@Override
	public String toString() {
		return "TVuelo [origen=" + origen + ", destino=" + destino + ", fechaIda=" + fechaIda + ", fechaVuelta="
				+ fechaVuelta + ", numAdultos=" + numAdultos + "]";
	}
	
	
	
}
