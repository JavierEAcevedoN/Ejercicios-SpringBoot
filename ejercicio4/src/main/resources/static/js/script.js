const numero1 = document.getElementById("numero1");
const numero2 = document.getElementById("numero2");
const formulario = document.getElementById("formulario");

formulario.addEventListener("submit", async (event) => {
    if (numero1.value >= numero2.value) {
        event.preventDefault();
        alert("El primer numero no puede ser mayor o igual al segundo");
        return;
    }
});