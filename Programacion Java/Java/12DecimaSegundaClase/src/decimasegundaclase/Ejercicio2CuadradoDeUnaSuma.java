//Ejercicio 2: Hacer un programa que calcule el cuadro de una suma, el usuario debe ingresar
//el valor de a y el valor de b. Formula: (a+b)2=a2+b2+2*a*b
//Para esto deberán utilizar la clase Math y un método llamado pow

package decimasegundaclase;

import java.util.Scanner;

public class Ejercicio2CuadradoDeUnaSuma{
    
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el valor de a: ");
        double a = entrada.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        double b = entrada.nextDouble();

        double cuadradoSuma = Math.pow(a + b, 2);
        double aCuadrado = Math.pow(a, 2); //los parametros son base y exponente.
        double bCuadrado = Math.pow(b, 2); //pow = power/potencia
        double resultadoFormula = aCuadrado + bCuadrado + 2 * a * b;

        System.out.println("El cuadrado de la suma es: (a + b)^2 = " + cuadradoSuma);
        System.out.println("Según la fórmula (a+b)2=a2+b2+2*a*b: " + resultadoFormula);
  
    }
}