let days = 1;

switch (days) {
    case 1:
        console.log("Hoy es Lunes");
        break;
    case 2:
        console.log("Hoy es Martes");
        break;
    case 3:
        console.log("Hoy es Miercoles");
        break;
    case 4:
        console.log("Hoy es Jueves");
        break;
    case 5:
        console.log("Hoy es Viernes");
        break;
    case 6:
        console.log("Hoy es Sabado");
        break;
    case 7:
        console.log("Hoy es Domingo");
        break;
    default:
        console.log("Error en el ingreso del dia de la semana.")
            break;
}

// Version corta de lo anterior con menos lineas de codigo
let days2 = ['Lunes', 'Martes', 'Miercoles', 'Jueves', 'Viernes', 'Sabado', 'Domingo'];
function getDay(n){
    if(n<1||n>7){
    throw new Error('Out of range');
}
return days2[n-1];
}
console.log(getDay(5));