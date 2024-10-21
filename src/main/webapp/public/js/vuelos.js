var idaYVueltaRB = document.getElementById("ida-y-vuelta");
var soloIdaRB = document.getElementById("solo-ida");
var multiplesDestinosRB = document.getElementById("multiples-destinos");
var claseVueloDD = document.getElementById("clase-vuelo");
var soloVuelosDirectosCB = document.getElementById("vuelo-directo");

var origenInput = document.getElementById("origen-input");
var destinoInput = document.getElementById("destino-input");
var fechaEntrada = document.getElementById("fecha-entrada");
var fechaSalida = document.getElementById("fecha-salida");
var labelFechaSalida = document.getElementById("label-fecha-salida");
var numAdultos = document.getElementById("num-adultos");

function intercambiarOrigenDestino() {
	var aux = origenInput.value;
	origenInput.value = destinoInput.value;
	destinoInput.value = aux;
}

function opcionIdaYVuelta() {
	if (idaYVueltaRB.checked) {
		fechaSalida.style.display = "block";
		labelFechaSalida.style.display = "block";
	}
}

function opcionSoloIda() {
	if (soloIdaRB.checked) {
		labelFechaSalida.style.display = "none";
		fechaSalida.style.display = "none";
	}
}

function checkInput() {
	var today = new Date();
	var day = today.getDate();
	var month = today.getMonth() + 1;
	var year = today.getFullYear();
	if (month < 10) 
		month = "0" + month.toString();
	if (day < 10)
		day = "0" + day.toString();
	var currentDate = `${year}-${month}-${day}`;
	inputDate = fechaEntrada.value;
	outputDate = fechaSalida.value;
	var origen = origenInput.value;
	var destino = destinoInput.value;
	
	if (origen === null || origen === "" ||
		destino === null || destino === "" ||
		inputDate === null || inputDate === "" || 
		(!soloIdaRB.checked && (outputDate === null || outputDate === ""))) {
			alert("Rellena todos los campos, por favor");
	} else if (inputDate < currentDate || 
				(!soloIdaRB.checked &&
				  (outputDate < currentDate ||
				   outputDate < inputDate))) {
					alert("Por favor, revisa las fechas");
   }
}