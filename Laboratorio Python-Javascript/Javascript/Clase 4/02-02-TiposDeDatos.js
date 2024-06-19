nombre = "Mercedes";
console.log(nombre);
console.log(typeof nombre); //muestra el tipo de dato

nombre = 7;
console.log(nombre);
console.log(typeof nombre);

nombre = 12.3;
console.log(nombre);
console.log(typeof nombre);

var objeto = {nombre: "Rocky", raza: "Rotweiller"}
console.log(typeof objeto)

var bandera =   true;
console.log(bandera);
console.log(typeof bandera);

function miFuncion(){}
    console.log(typeof miFuncion);

var simbolo = Symbol("Mi Simbolo");
console.log(typeof simbolo);

class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);
console.log(typeof Persona)