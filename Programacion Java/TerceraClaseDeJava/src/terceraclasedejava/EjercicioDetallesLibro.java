
package terceraclasedejava;

import java.util.Scanner;

public class EjercicioDetallesLibro {

    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el título del libro: ");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el nombre del autor del libro: ");
        String autor = entrada.nextLine();
        System.out.println(titulo + " fué escrito por " + autor);
    }
}
