package agency;

import java.util.ArrayList;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class VuelosHoteles {
	
	private ArrayList<TVueloHotel> listaResultados = new ArrayList<TVueloHotel>();
	
	public void buscar() {
		this.listaResultados.add(new TVueloHotel("Madrid", "Barcelona", "01/01/2025", "01/02/2025", 1, 1));
		this.listaResultados.add(new TVueloHotel("Madrid", "Valencia", "01/01/2025", "01/02/2025", 1, 1));
		this.listaResultados.add(new TVueloHotel("Madrid", "París", "01/01/2025", "01/02/2025", 1, 1));
	}
	
	public ArrayList<TVueloHotel> getListaResultados() {
		return listaResultados;
	}

	public void setListaResultados(ArrayList<TVueloHotel> listaResultados) {
		this.listaResultados = listaResultados;
	}

}
