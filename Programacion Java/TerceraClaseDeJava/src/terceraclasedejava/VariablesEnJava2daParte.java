package terceraclasedejava;

import java.util.Scanner;

public class VariablesEnJava2daParte {

    public static void main(String[] args) {

        //Inferencia de tipos
        var miVariableEntera = 10;
        var miVariableCadena = "Seguimos estudiando";
        System.out.println("Mi variable cadena = " + miVariableCadena);
        System.out.println("Mi variable entera = " + miVariableEntera);

        //Concatenación
        var usuario = "Mercedes";
        var titulo = "Técnica";
        var union = titulo + " " + usuario;
        System.out.println(union);

        var a = 8;
        var b = 4;
        System.out.println(a + b + usuario); //contexto de cadena. Lee de izquierda a derecha.

        //Caracteres Especiales
        System.out.println("Nueva linea: \n" + usuario);
        System.out.println("Tabulador: \t" + usuario);
        System.out.println("\t\t .:MENÚ:.");
        System.out.println("Retroceso: \b" + usuario); //backspace borra un espacio para atras.
        System.out.println("Comillas simples: \'" + usuario +"\'");
        System.out.println("Comillas dobles: \"" + usuario + "\"");
        
        //Clase Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Escriba la profesión: ");
        var titulo2 = entrada.nextLine();
        System.out.println("Resultado: "+ titulo2 + " " + usuario2);
        
    }

}
