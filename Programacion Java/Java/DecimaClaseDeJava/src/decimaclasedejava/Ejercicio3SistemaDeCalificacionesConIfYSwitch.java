package decimaclasedejava;

import java.util.Scanner;

public class Ejercicio3SistemaDeCalificacionesConIfYSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //---------------Ejercicio con IF--------------------//
        System.out.println("Ingrese la calificación: (de 1 a 10) ");
        float calificacion = entrada.nextFloat();

        if (calificacion >= 9 && calificacion <= 10) {
            System.out.println("A");
        } else if (calificacion >= 8 && calificacion < 9) {
            System.out.println("B");
        } else if (calificacion >= 7 && calificacion < 8) {
            System.out.println("C");
        } else if (calificacion >= 6 && calificacion < 7) {
            System.out.println("D");
        } else if (calificacion >= 0 && calificacion < 6) {
            System.out.println("F");
        } else {
            System.out.println("Calificacion incorrecta.");
        }

        //---------------Ejercicio con Switch--------------------//
        System.out.println("Ingrese la calificación: (de 1 a 10) ");
        int calificacion1 = entrada.nextInt();

        switch (calificacion1) {
            case 1, 2, 3, 4, 5:
                System.out.println("La nota ingresada corresponde a la calificacion F");
                break;
            case 6:
                System.out.println("La nota ingresada corresponde a la calificacion D");
                break;
            case 7:
                System.out.println("La nota ingresada corresponde a la calificacion C");
                break;
            case 8:
                System.out.println("La nota ingresada corresponde a la calificacion B");
                break;
            case 9, 10:
                System.out.println("La nota ingresada corresponde a la calificacion A");
                break;
            default:
                System.out.println("Calificacion desconocida.");
        }
    }
}