package agency;

import java.util.ArrayList;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Vuelos {

	private ArrayList<TVuelo> listaResultados;
	
	public void buscar() {
		this.listaResultados = new ArrayList<TVuelo>();
		this.listaResultados.add(new TVuelo("Madrid", "Barcelona", "01/01/2025", "01/02/2025", 1));
		this.listaResultados.add(new TVuelo("Madrid", "Valencia", "01/01/2025", "01/02/2025", 1));
		this.listaResultados.add(new TVuelo("Madrid", "París", "01/01/2025", "01/02/2025", 1));
	}

	public ArrayList<TVuelo> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(ArrayList<TVuelo> listaResultados) {
		this.listaResultados = listaResultados;
	}
	
	
}
