const maxHabitaciones = 6;
const minHabitaciones = 3;
const maxPasajerosPorHabitacion = 2;
const minPasajerosPorHabitacion = 1;
const botonesSinSumarRestarOnClick = [
  "btn-info-pasajeros-habitaciones",
  "anyadir-habitacion",
  "eliminar-habitacion",
];
var contadorPasajeros = 1;
var contadorHabitaciones = 1;
var clase = "Turista";
const card = `
<div class="card" style="width: 18rem;">
    <div class="card-body">
        <h5 class="card-title">Habitación ${contadorHabitaciones}</h5>
        <div class="input-row d-flex" id="info-ocupantes">
            <div class="title">
                <h4 class="label">Adultos</h4>
            </div>
            <div class="input d-flex ms-auto me-auto">
                <button class="minus" aria-label="Decrease by one"><i class="bi bi-dash"></i></button>
                <div class="number dim ms-2 me-2">1</div>
                <button class="plus" aria-label="Increase by one"><i class="bi bi-plus"></i></button>
            </div>
            </div>
    </div>
</div>`;

var origenInput = document.getElementById("origen-input");
var destinoInput = document.getElementById("destino-input");
var fechaEntrada = document.getElementById("fecha-entrada");
var fechaSalida = document.getElementById("fecha-salida");
var botonAnyadirHabitacion = document.getElementById("anyadir-habitacion");
var botonEliminarHabitacion = document.getElementById("eliminar-habitacion");
var listaDropdownHabitaciones = document.getElementById(
  "dropdown-habitaciones"
);
var botonInfoPasajerosHabitaciones = document.getElementById(
  "btn-info-pasajeros-habitaciones"
);
var inputTurista = document.getElementById("turista");
var inputPrimera = document.getElementById("primera");
var botones = document.querySelectorAll("button");

function sumarRestarPasajeros() {
  botones = document.querySelectorAll("button");
  contador = 0;
  botones.forEach((button) => {
    if (!botonesSinSumarRestarOnClick.includes(button.getAttribute("id"))) {
      button.addEventListener("click", (event) => {
        // 1. Get the clicked element
        const element = event.currentTarget;
        // 2. Get the parent
        const parent = element.parentNode;
        // 3. Get the number (within the parent)
        const numberContainer = parent.querySelector(".number");
        const number = parseFloat(numberContainer.textContent);
        // 4. Get the minus and plus buttons
        const increment = parent.querySelector(".plus");
        const decrement = parent.querySelector(".minus");
        // 5. Change the number based on click (either plus or minus)
        // var newNumber = element.classList.contains("plus")
        //   ? number + 1
        //   : number - 1;
        var newNumber = 0;
        if (element.classList.contains("plus")) {
          newNumber = number++;
        } else if (element.classList.contains("minus")) {
          newNumber = number--;
        }
        if (newNumber < minPasajerosPorHabitacion) {
          newNumber = minPasajerosPorHabitacion;
        } else if (newNumber > maxPasajerosPorHabitacion) {
          newNumber = maxPasajerosPorHabitacion;
        }
        //   contadorPasajeros += newNumber;
        // 6. Disable and enable buttons based on number value (and undim number)
        if (newNumber === minPasajerosPorHabitacion) {
          // decrement.disabled = true;
          numberContainer.classList.add("dim");
          // Make sure the button won't get stuck in active state (Safari)
          element.blur();
        } else if (
          newNumber > minPasajerosPorHabitacion &&
          newNumber < maxPasajerosPorHabitacion
        ) {
          // decrement.disabled = false;
          // increment.disabled = false;
          numberContainer.classList.remove("dim");
        } else if (newNumber === maxPasajerosPorHabitacion) {
          // increment.disabled = true;
          numberContainer.textContent = `${newNumber}+`;
          element.blur();
        }
        numberContainer.textContent = newNumber;
        console.log(newNumber);
        actualizarClase();
      });
    }
  });
}

function actualizarClase() {
  var hab, pas;
  if (contadorHabitaciones == 1) hab = "habitación";
  else hab = "habitaciones";
  if (contadorPasajeros == 1) pas = "pasajero";
  else pas = "pasajeros";
  botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} ${pas}, ${contadorHabitaciones} ${hab}, ${clase}`;
}

function anyadirHabitacion() {
  if (listaDropdownHabitaciones.children.length <= maxHabitaciones) {
    ++contadorHabitaciones;
    ++contadorPasajeros;
    actualizarClase();
    var li = document.createElement("li");
    li.innerHTML = card;
    listaDropdownHabitaciones.appendChild(li);
    sumarRestarPasajeros();
  }
}

function eliminarHabitacion() {
  if (listaDropdownHabitaciones.children.length > minHabitaciones) {
    --contadorHabitaciones;
    --contadorPasajeros;
    botonInfoPasajerosHabitaciones.innerHTML = `${contadorPasajeros} pasajeros, ${contadorHabitaciones} habitaciones, ${clase}`;
    listaDropdownHabitaciones.removeChild(
      listaDropdownHabitaciones.lastElementChild
    );
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
// botones.forEach((boton) =>
//   boton.addEventListener("click", sumarRestarPasajeros)
// );
