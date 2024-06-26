
package OctavaClaseDeJava;

import java.util.Scanner;

public class AreayPerimetroRectangulo {

    public static void main(String[] args) {
        
        System.out.println("Ingrese el ancho del rectángulo en centímetros: ");
        Scanner entrada = new Scanner(System.in);
        var base = entrada.nextDouble();
        System.out.println("Ingrese el alto del rectángulo: ");
        var altura = entrada.nextDouble();
        
        var area = base * altura;
        var perimetro = 2*(base +altura);
        
        System.out.println("El área del rectangulo es de: " + area + " cms y el perímetro es de: " + perimetro + " cms.");
    }
}
