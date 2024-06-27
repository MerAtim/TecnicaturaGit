//Determinar si un alumno aprueba o reprueba un curso sabiendo que aprueba con 70 de un promedio de 3 notas.
package decimoprimerclaseenjava;

import java.util.Scanner;

public class Ejercicio1ElpromedioDeTresNotas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese las tres calificaciones del alumno para determinar su promedio: ");
        float nota1 = entrada.nextFloat();
        float nota2 = entrada.nextFloat();
        float nota3 = entrada.nextFloat();
        float promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 70 && promedio < 100) {
            System.out.println("El alumno aprobo el curso con un promedio de: " + promedio);
        } else {
            System.out.println("El alumno reprobó el curso con un promedio de: " + promedio);
        }

    }

}
