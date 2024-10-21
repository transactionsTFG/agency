"use strict";
var destinoInput = document.getElementById("destino-input");
var fechaEntrada = document.getElementById("fecha-entrada");	
var fechaSalida = document.getElementById("fecha-salida");	
var numeroAdultos = document.getElementById("num-adultos");
var numeroHabitaciones = document.getElementById("num-habitaciones");

function fechaEntrada() {
	var today = new Date();

	var day = today.getDate();
	var month = today.getMonth() + 1;
	var year = today.getFullYear();
	
	if (month < 10) 
		month = "0" + month.toString();
	if (day < 10)
		day = "0" + day.toString();
	
	var maxDate = `${year}-${month}-${day}`;
	
	document.getElementById("fecha-entrada").setAttribute("min", maxDate);
	/*
	document.getElementById("fecha-entrada").attr("min", maxDate);
	*/
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
	var inputDate = fechaEntrada.value;
	var outputDate = fechaSalida.value;
	var destino = destinoInput.value;
	if (destino === null || destino === "" || 
		inputDate === null || inputDate === "" || 
		outputDate === null || outputDate === "" ) {
			alert("Rellena todos los campos, por favor");
	} else if (inputDate < currentDate ||
			   outputDate < currentDate ||
			   outputDate < inputDate) {
				alert("Por favor, revisa las fechas");
	}
}