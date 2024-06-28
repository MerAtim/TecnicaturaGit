//Una compañia de ventas de carros usados, paga a su personal de ventas un salario de $1000 mensuales mas $150
// de comision por cada auto vendido, mas el 5% del valor de la venta por auto.
//Realizar un programa que calcule e imprima el salario mensual de un vendedor dado.
package novenaclasedejava;

import java.util.Scanner;

public class Ejercicio7SalarioMensualVendedorAutos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        final double SALARIO_BASE = 1000.0;
        
        System.out.print("Ingresa el número de carros vendidos: ");
        
        int carrosVendidos = entrada.nextInt();
        
        System.out.print("Ingresa el valor de venta por carro: ");
        
        double valorPrecioPorCarro = entrada.nextDouble();
        double comisionCarrosVendidos = 150.0 * carrosVendidos;
        double comisionValorVenta = 0.05 * valorPrecioPorCarro * carrosVendidos;
        double salarioMensual = SALARIO_BASE + comisionCarrosVendidos + comisionValorVenta;
        
        System.out.println("El salario mensual del vendedor es: $" + salarioMensual);
    }
}