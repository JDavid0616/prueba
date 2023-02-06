// Función para mostrar una alerta cuando se hace clic en el botón de compra
function mostrarAlerta() {
    alert("Gracias por su compra!");
  }
  
  // Función para mostrar u ocultar la descripción detallada del producto al hacer clic en el botón "Ver más"
  function mostrarDescripcion() {
    let descripcion = document.getElementById("descripcion-detallada");
    if (descripcion.style.display === "block") {
      descripcion.style.display = "none";
    } else {
      descripcion.style.display = "block";
    }
  }
  
  // Añade un evento al botón de compra para mostrar la alerta
  let botonCompra = document.getElementById("boton-compra");
  botonCompra.addEventListener("click", mostrarAlerta);
  
  // Añade un evento al botón "Ver más" para mostrar u ocultar la descripción detallada
  let botonVerMas = document.getElementById("boton-ver-mas");
  botonVerMas.addEventListener("click", mostrarDescripcion);
  