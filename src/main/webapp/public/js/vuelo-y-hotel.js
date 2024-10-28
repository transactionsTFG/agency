const maxHabitaciones = 6;
const minHabitaciones = 2;
const maxPasajerosPorHabitacion = 2;
const minPasajerosPorHabitacion = 1;

var origenInput = document.getElementById("origen-input");
var destinoInput = document.getElementById("destino-input");
var fechaEntrada = document.getElementById("fecha-entrada");
var fechaSalida = document.getElementById("fecha-salida");
var botonAnyadirHabitacion = document.getElementById("anyadir-habitacion");
var botonEliminarHabitacion = document.getElementById("eliminar-habitacion");
var listaDropdownHabitaciones = document.getElementById("dropdown-habitaciones");
var botonInfoPasajerosHabitaciones = document.getElementById("btn-info-pasajeros-habitaciones");

var contadorPasajeros = 1;
var contadorHabitaciones = 1;
var clase = "Primera";

function anyadirHabitacion() {
	if (listaDropdownHabitaciones.children.length <= maxHabitaciones) {
		++contadorHabitaciones;
		++contadorPasajeros;
		botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} pasajeros, ${contadorHabitaciones} habitaciones, ${clase}`;
		var li = document.createElement("li");
		li.innerHTML = `
				<div class='card' style='width: 18rem;'> 
				  <div class='card-body'> 
				    <h5 class='card-title'>Habitación ${contadorHabitaciones}</h5> 
				    <div id='info-ocupantes'> 
			    		<div>Adultos</div> 
			        	<div> 
				    		<button type='button'>-</button> 
				    		<span>1</span> 
				    		<button type='button'>+</button> 
				    	</div> 
				    </div> 
				  </div> 
				</div>`;
			listaDropdownHabitaciones.appendChild(li);
	}
	
}

function eliminarHabitacion() {
	if (listaDropdownHabitaciones.children.length > minHabitaciones + 1) {
		--contadorHabitaciones;
		--contadorPasajeros;
		botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} pasajeros, ${contadorHabitaciones} habitaciones, ${clase}`;
		listaDropdownHabitaciones.removeChild(listaDropdownHabitaciones.lastElementChild);
	}
}

function primera() {
	clase = "Primera";
	actualizarClase();
}
function turista() {
	clase = "Turista";
	actualizarClase();
}

function actualizarClase() {
	botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} pasajeros, ${contadorHabitaciones} habitaciones, ${clase}`;
}

botonAnyadirHabitacion.addEventListener("click", anyadirHabitacion);
botonEliminarHabitacion.addEventListener("click", eliminarHabitacion);