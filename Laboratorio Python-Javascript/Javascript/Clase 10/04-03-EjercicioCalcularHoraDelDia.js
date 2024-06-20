let hora = 20;
let mensaje;

if (hora >= 1 && hora <= 6) {
    mensaje = "¡Es de Madrugada, tiempo de descansar!";
} else if (hora >= 7 && hora <= 11) {
    mensaje = "¡Buen día! Vamos a desayunar. Empieza nuestro día productivo.";
} else if (hora >= 12 && hora <= 14) {
    mensaje = "¡Es momento de parar y almorzar!";
} else if (hora >= 15 && hora <= 17) {
    mensaje = "Hora de la merecida siesta.";
} else if (hora >= 18 && hora <= 20) {
    mensaje = "¡Buenas tardes, vamos a merendar!";
} else if (hora >= 21 && hora <= 23) {
    mensaje = "¡Buenas noches! Ya en casa podemos descansar y cenar.";
} else if (hora === 0) {
    mensaje = "¡Buen descanso! A recuperar fuerzas para mañana.";
} else {
    mensaje = "Hora incorrecta.";
}
console.log("Hora: " + hora + ":00, " + mensaje);