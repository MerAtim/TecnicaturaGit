//Leer dos numeros: Si son iguales, que se multipliquen.
//Si el primero es mayor, que el segundo se reste.
//Si el segundo es mayor, que se sumen.
package decimoprimerclaseenjava;

import java.util.Scanner;

public class Ejercicio3LecturaDe2NumerosSumaRestaOMultiplicacion {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese dos números: ");
        int num1 = entrada.nextInt();
        int num2 = entrada.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales. El resultado de la multiplicación es: " + (num1 * num2));
        } else if (num1 > num2) {
            System.out.println("El primer número ingresado es mayor. El resultado de la resta es: " + (num1 - num2));
        } else if (num1 < num2) {
            System.out.println("El segundo número ingresado es mayor. El resultado de la suma es: " + (num1 + num2));
        }
    }
}