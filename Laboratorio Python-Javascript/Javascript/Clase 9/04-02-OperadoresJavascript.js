// Si el padre puede asistir al juego del hijo
let vacaciones = false, diaDescanso = false;
if(vacaciones || diaDescanso){
    console.log("El padre puede asistir al juego");
}
else{
    console.log("El padre no puede asistir al juego");
}

// Operador Ternario
let resultado1 = 3 > 2 ? "verdadero" : "falso";
console.log(resultado1);

let numero = 9;
resultado = numero % 2 == 0 ? "Es numero PAR" : "Es numero IMPAR";
console.log(resultado);

//Convertir String a Numero 
let miNumero = "10";
console.log(typeof miNumero);
let edad = Number(miNumero);
console.log(typeof edad);

if(isNaN(edad)){
    console.log("La variable edad no es un número");
}
else{
if (edad >= 18){
    console.log("Usted es mayor de edad, puede votar.");
}
else{
    console.log("Usted es menor de edad. No puede votar.");
}
}

let resultado2 = edad >= 18 ? "Usted es mayor de edad, puede votar." : "Usted es menor de edad. No puede votar.";
console.log(resultado2);