//Ejercicio 1: Construir un programa que, dado un número total de horas,
//devuelve el número de semanas, días y horas equivalentes.
//Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas, 6 días y 16 horas.
package decimasegundaclase;

import java.util.Scanner;

public class Ejercicio1CalcularSemanasDiasHoras {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de horas a evaluar: ");
        int horasTotales = entrada.nextInt();

        int semana = horasTotales / 168;
        int horasRestantes = horasTotales % 168;
        int dias = horasRestantes / 24;
        int horas = horasRestantes % 24;
        
        System.out.println("Las horas ingresadas: " + horasTotales +" son equivalentes a: ");
        System.out.println(semana + " semanas, " + dias + " dias y " + horas+ " horas.");

    }
}