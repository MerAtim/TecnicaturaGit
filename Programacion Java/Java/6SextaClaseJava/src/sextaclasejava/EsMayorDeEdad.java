package sextaclasejava;

import java.util.Scanner;

public class EsMayorDeEdad {

    public static void main(String[] args) {

        var edad = 18;
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //Conversion tipos primitivos
        var edad1 = Integer.parseInt("20");
        System.out.println("Edad = " + (edad1 + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("Valor de Pi = " + valorPI);
        
        var entrada = new Scanner(System.in);
        System.out.println("Ingrese su edad: ");
        edad1 = Integer.parseInt(entrada.nextLine());
        System.out.println("Edad = " + edad1);
        
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "programadores".charAt(6);
        System.out.println("fraseChar = " + fraseChar);
        
        System.out.println("Ingrese un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = " + fraseChar);
    }
}
