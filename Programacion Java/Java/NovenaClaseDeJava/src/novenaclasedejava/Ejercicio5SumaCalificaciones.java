
package novenaclasedejava;

import java.util.Scanner;

public class Ejercicio5SumaCalificaciones {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese tres calificaciones: ");
        var nota1 = entrada.nextFloat();
        var nota2 = entrada.nextFloat();
        var nota3 = entrada.nextFloat();
        
        System.out.println("La suma de las calificacion ingresadas es: " + (nota1+nota2+nota3));
   }    
}
