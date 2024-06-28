//En un almacen se hace un 20% de descuento a los clientes si compran mas de $100.
//Haz un programa que calcule el valor de la compra.
package decimoprimerclaseenjava;

import java.util.Scanner;

public class Ejercicio2DescuentoAlmacen {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el valor de su compra: ");
        float compra = entrada.nextFloat();

        if (compra > 100) {
            System.out.println("Su compra tiene descuento del 20%. El total a abonar será: $" + compra * 0.8);
        } else {
            System.out.println("El valor a abonar será de: $" + compra);
        }
    }
}