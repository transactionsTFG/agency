const maxHabitaciones = 6;
const minHabitaciones = 3;
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
var inputTurista = document.getElementById("turista");
var inputPrimera = document.getElementById("primera");

var contadorPasajeros = 1;
var contadorHabitaciones = 1;
var clase = "Turista";

function actualizarClase() {
	var hab, pas;
	if (contadorHabitaciones == 1) 
		hab = "habitación";
	else 
		hab = "habitaciones";
	if (contadorPasajeros == 1)
		pas = "pasajero";
	else 
		pas = "pasajeros";
	botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} ${pas}, ${contadorHabitaciones} ${hab}, ${clase}`;
}

function anyadirHabitacion() {
	if (listaDropdownHabitaciones.children.length <= maxHabitaciones) {
		++contadorHabitaciones;
		++contadorPasajeros;
		actualizarClase();
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
	if (listaDropdownHabitaciones.children.length > minHabitaciones) {
		--contadorHabitaciones;
		--contadorPasajeros;
		botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} pasajeros, ${contadorHabitaciones} habitaciones, ${clase}`;
		listaDropdownHabitaciones.removeChild(listaDropdownHabitaciones.lastElementChild);
	}
	if (listaDropdownHabitaciones.children.length == minHabitaciones) {
		botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} pasajero, ${contadorHabitaciones} habitación, ${clase}`;
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


botonAnyadirHabitacion.addEventListener("click", anyadirHabitacion);
botonEliminarHabitacion.addEventListener("click", eliminarHabitacion);
inputPrimera.addEventListener("click", primera);
inputTurista.addEventListener("click", turista);