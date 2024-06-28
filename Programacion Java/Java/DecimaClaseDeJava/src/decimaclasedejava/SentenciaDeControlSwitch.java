package decimaclasedejava;
import java.util.Scanner;

public class SentenciaDeControlSwitch {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero del 1 al 4: ");
        int numero = entrada.nextInt();
        var numeroTexto = "Valor desconocido.";

        switch (numero) {
            case 1:
                numeroTexto = "Numero uno.";
                break;
            case 2:
                numeroTexto = "Numero dos.";
                break;
            case 3:
                numeroTexto = "Numero tres.";
                break;
            case 4:
                numeroTexto = "Numero cuatro.";
                break;
            default:
                numeroTexto = "Caso no encontrado.";
        }
        System.out.println(numeroTexto);
    }
}