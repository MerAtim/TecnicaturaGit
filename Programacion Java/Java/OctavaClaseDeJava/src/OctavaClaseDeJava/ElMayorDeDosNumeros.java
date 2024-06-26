package OctavaClaseDeJava;

import java.util.Scanner;

public class ElMayorDeDosNumeros {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, ingrese el primer numero a evaluar: ");
        var num1 = entrada.nextInt();
        System.out.println("Por favor, ingrese el segundo numero a evaluar: ");
        var num2 = entrada.nextInt();
        
        var mayor = (num1 > num2) ? "El primer numero ingresado es mayor" : "El segundo numero ingresado es mayor";
        System.out.println(mayor);
    }
}
