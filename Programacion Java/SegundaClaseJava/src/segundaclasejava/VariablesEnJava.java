      //Variables de tipo PRIMITIVAS: enteros y flotantes, boolean...
      //ENTEROS: byte - short - char - int - long.
      //FLOTANTES: float - double
      //BOOLEAN: true - false <- default
      //Variables de tipo REFERENCIADAS (Tipo Object): Clases, Interfaces y Arreglos...

package segundaclasejava;

public class VariablesEnJava {

    public static void main(String[] args) {
        String cadena = "Hola Mundo";
        System.out.println(cadena.equals("Hola Mundo")); //Una cadena se compara con el metodo equals.
        System.out.println(""); 
        
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        
        //Tipo String
        String miVariableCadena = "Bienvenidos";
        System.out.println(miVariableCadena);
        miVariableCadena = "Sigamos creciendo en Programación";
        System.out.println(miVariableCadena);
    }
}