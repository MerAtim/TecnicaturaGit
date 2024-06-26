package decimaclasedejava;

public class SentenciaIfElse {

    public static void main(String[] args) {

        var condicion = true;
        if (condicion) {
            System.out.println("La condicion es verdadera. ");
        } else {
            System.out.println("La condicion es falsa.");
        }
                
        var numero = 4;
        var numeroTexto = "Numero desconocido.";
        if (numero == 1){
            numeroTexto = "Numero uno.";
        }
        else if (numero == 2){
            numeroTexto = "Numero dos.";            
        }
        else if (numero == 3){
            numeroTexto = "Numero tres.";            
        }
        else if (numero == 4){
            numeroTexto = "Numero cuatro.";            
        }
        else{
            numeroTexto = "Número no encontrado.";
        }
        System.out.println(numeroTexto);
    }
}
