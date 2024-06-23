let mes = 4;
let estacion;
/*
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 4 || mes == 5 || mes == 3){
    estacion = "Otoño";
}
else if(mes == 7 || mes == 8 || mes == 6){
        estacion = "Invierno";
}
else if(mes == 10 || mes == 11 || mes == 9){
    estacion = "Primavera";
}
else{
    estacion = "Mes incorrecto"
}
console.log("La estación del año es: "+estacion);
*/

switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Mes incorrecto.";
}
console.log("La estación del año es: "+estacion);