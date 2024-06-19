// Ampliando el uso de var, let y const

//var tiene un ámbito global o de función. Si se declara fuera de una función, 
//está disponible en todo el código. Si se declara dentro de una función, 
//solo es accesible dentro de esa función.

var nombre = 'Maria';
nombre = 'Mercedes';  /**/
console.log(nombre);

function saludar(){
    var nombre = 'Leonel';
    console.log(nombre);  
}
console.log(nombre); /*var no se lee dentro de la funcion, por fue declarada afuera.*/
saludar(); 

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad);

//La palabra clave let declara una variable con un ámbito de bloque. 
//Esto significa que la variable es accesible solo dentro del bloque donde se declara.
//let tiene un ámbito de bloque. Esto significa que se limita al bloque donde se declara 
//(por ejemplo, dentro de un bucle o una condición).
//El uso de let ayuda  aque no se redeclaren variables del mismo nombre en otros bloques.

function saludar2(){
    let nombre2 = "Leonel";
    console.log(nombre2);
}
saludar2();
//console.log(nombre2); //Si se declara dentro de la funcion, no se puede invocar afuera.

if(true){
    let edad2 = 33;
    console.log(edad2);
}
//console.log(edad2); //Si se declara dentro del bloque, no se puede invocar afuera.


// const se usa oara valores constantes que no pueden ser reasignadas.

const FECHA_NACIMIENTO = 2006;
console.log(FECHA_NACIMIENTO);
//FECHA_NACIMIENTO = 2003; //No se puede reasignar, se imporimirá el valor declarado por primera vez.