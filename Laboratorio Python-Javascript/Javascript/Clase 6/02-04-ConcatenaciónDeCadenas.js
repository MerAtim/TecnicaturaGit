var nombre = 'Jose ';
var apellido = 'Montes';
var nombreCompleto = nombre+' '+apellido;

console.log(nombreCompleto);

var nombreCompleto2 = 'Maria'+' '+'Atim';
console.log(nombreCompleto2);

var juntos = nombre + 219; 
console.log(juntos);
juntos = nombre + 78 + 17; //Lee de izquierda a derecha, entonces el nro es una cadena, si se necesita sumar, agregar paréntesis
console.log(juntos);
juntos = 78 + 17 + nombre; //Al leer de izquierda a derecha ahora los numeros son tipo numerico
console.log(juntos);

nombre += apellido;
console.log(nombre);