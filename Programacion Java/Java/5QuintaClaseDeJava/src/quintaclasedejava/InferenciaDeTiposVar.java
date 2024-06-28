
package quintaclasedejava;

public class InferenciaDeTiposVar {

    //La inferencia es la capacidad del compilador para deducir el tipo de variable al momento de su declaración.
    //Esta característica se introdujo en Java 10 y se realiza mediante el uso de la palabra clave var.
    //En versiones anteriores de Java, era necesario declarar explícitamente el tipo de una variable.
    
    public static void main(String[] args) {
     var numEntero = 20;
        System.out.println("numEntero = " + numEntero);
        
     var numFloat = 10.0F;
        System.out.println("numFloat = " + numFloat);
        
     var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);
    }
     
}
