//Ejercicio 3: La calificacion final de un estudiante de informática se calcula con base a las calificaciones
//de cuatro aspectos de su rendimiento académico: participación, primer examen parcial,
//segundo examen parcial y examen final. Sabiendo que las calificaciones anteriores entran a la 
//calificación final con ponderaciones de 10%, 25%, 25% y 40%, Hacer un programa que 
//calcule e imprima la calificación final obtenida por un estudiante. 
//Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,la calificación final.

package decimasegundaclase;

import java.util.Scanner;

public class Ejercicio3CalificacionFinalEstudiante {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la calificacion de participación del estudiante: ");
        float participacion = entrada.nextFloat();
        System.out.println("Ingrese la nota del primer parcial: ");
        float parcial1 = entrada.nextFloat();
        System.out.println("Ingrese la nota del segundo parcial: ");
        float parcial2 = entrada.nextFloat();
        System.out.println("Ingrese la nota del examen final.");
        float examenFinal = entrada.nextFloat();
        
        float ponderacionParticipacion =  participacion * 0.10F;
        float ponderacionParcial1 =  parcial1 * 0.25F;
        float ponderacionParcial2 =  parcial2 * 0.25F;
        float ponderacionExamenFinal =  examenFinal * 0.25F;
        
        float calificacionFinal = (ponderacionParticipacion+ponderacionParcial1+ponderacionParcial2+ponderacionExamenFinal);
    
        System.out.println("La calificación final del estudiante es: " + calificacionFinal);
    }
}