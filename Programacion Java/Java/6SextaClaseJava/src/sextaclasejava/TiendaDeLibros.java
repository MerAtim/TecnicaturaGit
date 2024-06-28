
package sextaclasejava;

import java.util.Scanner;

public class TiendaDeLibros {
    
    public static void main(String [] args){
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del libro: ");
        String nombreLibro = entrada.nextLine();
        
        System.out.println("Ingrese el id del libro: ");
        int idLibro = entrada.nextInt();
        
        System.out.println("Ingrese el precio del libro: ");
        double precioLibro = entrada.nextDouble();
        
        System.out.println("Confirme si el envío es gratuito: True/False");
        boolean envioGratuito = entrada.nextBoolean();
        
        System.out.println(nombreLibro + " ID: # " +  idLibro + "\n$ " +precioLibro + ". El envío del libro es gratuito: " + envioGratuito);
    }

}
