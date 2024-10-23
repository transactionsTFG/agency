var origenInput = document.getElementById("origen-input");
var destinoInput = document.getElementById("destino-input");
var fechaEntrada = document.getElementById("fecha-entrada");
var fechaSalida = document.getElementById("fecha-salida");
var botonAnyadirHabitacion = document.getElementById("anyadir-habitacion");
var botonEliminarHabitacion = document.getElementById("eliminar-habitacion");
var listaDropdownHabitaciones = document.getElementById("dropdown-habitaciones");


function anyadirHabitacion() {
	alert("Boton añadir habitación pulsado");
	if (listaDropdownHabitaciones.children.length < 7) {
		listaDropdownHabitaciones.appendChild(
			"<li>" + 
				"<div class='card' style='width: 18rem;'>" +
				  "<div class='card-body'>" +
				    "<h5 class='card-title'>Habitación Z</h5>" +
				    "<div id='info-ocupantes'>" +
			    		"<div>Adultos</div>" +
				        	"<div>" +
					    		"<button type='button'>-</button>" +
					    		"<span>1</span>" +
					    		"<button type='button'>+</button>" +
				    	"</div>" +
				    "</div>" +
    			  "</div>" +
				"</div>" +
		    "</li>");
		botonEliminarHabitacion.setAttribute("disabled", "false");
	} else {
		botonAnyadirHabitacion.setAttribute("disabled", "true");
		
	}
}

function eliminarHabitacion() {
	if (listaDropdownHabitaciones.children.length > 2) {
		
		botonAnyadirHabitacion.setAttribute("disabled", "false");
	} else {
		botonEliminarHabitacion.setAttribute("disabled", "true");
	}
}