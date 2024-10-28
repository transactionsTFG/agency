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


function anyadirHabitacion() {
	botonInfoPasajerosHabitaciones.value = `${contadorPasajeros} pasajeros, ${contadorHabitaciones} habitaciones, Cualquier clase`;
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

function eliminarHabitacion() {
}

botonAnyadirHabitacion.addEventListener("click", anyadirHabitacion);
botonEliminarHabitacion.addEventListener("click", eliminarHabitacion);