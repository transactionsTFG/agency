"use strict";
function showToast(text, status) {
  Toastify({
    text: text,
    duration: 2000,
    gravity: "top",
    position: "left",
    stopOnFocus: true,
    style: {
      background:
        status === "success"
          ? "linear-gradient(to right, #00b09b, #96c93d)"
          : "linear-gradient(to right, #ff5f6d, #ffc371)",
    },
  }).showToast();
}

$(() => {
  $("#registerForm").on("submit", (event) => {
    event.preventDefault();
    const userData = new FormData($("#registerForm")[0]);
    console.log(userData);
    showToast("Enviando formulario", "success");

    fetch("http://localhost:9001/agencyMTA/UserWS?wsdl", {
      method: "POST",
      body: userData,
    })
      .then((response) => {
        if (!response.ok) {
          throw new Error("Error al registrar. Verifique los datos.");
        }
        return response.json();
      })
      .then((data) => {
        showToast("Registro exitoso", "success");

        console.log("Respuesta del servidor:", data);
        // Puedes redirigir al usuario o realizar alguna acción adicional
        // Por ejemplo:
        // window.location.href = "/dashboard";
      })
      .catch((error) => {
        showToast("Hubo un error al registrar", "error");
        console.error("Error:", error);
      });
  });
});
