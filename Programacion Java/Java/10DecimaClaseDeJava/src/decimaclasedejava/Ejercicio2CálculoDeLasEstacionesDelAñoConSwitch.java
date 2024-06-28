package decimaclasedejava;

import java.util.Scanner;

public class Ejercicio2CálculoDeLasEstacionesDelAñoConSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un mes del año: (del 1 al 12)");
        int mes = entrada.nextInt();

        var estacion = "Estación desconocida.";

        switch (mes) {
            case 12, 1, 2:
                estacion = "Verano";
                break;
            case 3, 4, 5:
                estacion = "Otoño";
                break;
            case 6, 7, 8:
                estacion = "Invierno";
                break;
            case 9, 10, 11:
                estacion = "Primavera";
                break;
          }
        System.out.println(estacion);
    }
}