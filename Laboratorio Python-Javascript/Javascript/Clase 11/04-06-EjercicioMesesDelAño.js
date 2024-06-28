let mes = 6;

switch (mes) {
  case 1:
    console.log("El mes ingresado es Enero");
    break;
  case 2:
    console.log("El mes ingresado es Febrero");
    break;
  case 3:
    console.log("El mes ingresado es Marzo");
    break;
  case 4:
    console.log("El mes ingresado es Abril");
    break;
  case 5:
    console.log("El mes ingresado es Mayo");
    break;
  case 6:
    console.log("El mes ingresado es Junio");
    break;
  case 7:
    console.log("El mes ingresado es Julio");
    break;
  case 8:
    console.log("El mes ingresado es Agosto");
    break;
  case 9:
    console.log("El mes ingresado es Septiembre");
    break;
  case 10:
    console.log("El mes ingresado es Octubre");
    break;
  case 11:
    console.log("El mes ingresado es Noviembre");
    break;
  case 12:
    console.log("El mes ingresado es Diciembre");
    break;
  default:
    console.log("Error en el ingreso del mes del año.");
    break;
}

let meses = ['Enero', 'Febrero', 'Marzo', 'Abril', 'Mayo', 'Junio', 'Julio',
    'Agosto', 'Septiembre', 'Octubre', 'Noviembre', 'Diciembre'];
function verMes(n){
    if(n<1||n>12){
    throw new Error('Fuera de rango');
}
return meses[n-1];
}
console.log(verMes(10));

