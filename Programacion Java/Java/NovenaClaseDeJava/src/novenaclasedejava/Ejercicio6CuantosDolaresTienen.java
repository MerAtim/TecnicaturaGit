//Guillermo tiene N dolares. Luis tiene la mitad de lo que tiene Guillermo.
//Juan tiene la mitad de lo que tienen Luis y Guillermo.

package novenaclasedejava;

import java.util.Scanner;

public class Ejercicio6CuantosDolaresTienen {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de dolares que tiene Guillermo: ");
        var guillermo = entrada.nextFloat();
        var luis = (guillermo/2);
        var juan = (luis + guillermo)/2;
        var total = guillermo + luis + juan;
        
        System.out.println("Luis tiene: u$d " + luis);
        System.out.println("Juan tiene: u$d " + juan);
        System.out.println("La suma de dinero entre los 3 es: u$d " + total);
        
    }
    
}
