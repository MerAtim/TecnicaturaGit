
package quintaclasedejava;

public class TipoPrimitivoChar {
    
    public static void main(String [] args){
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        
        char varCaracter = '\u0024'; //Codigo Unicode
        System.out.println("varCaracter = " + varCaracter);
        
        char varCaracterDecimal = 36;
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
        System.out.println("--------------------------------");
        
        var varCaracter1 = '\u0024'; //Codigo Unicode
        System.out.println("varCaracter1 = " + varCaracter1);
        
        var varCaracterDecimal1 = (char)36; //Toma el tipo int, para que tome char hay que convertir anteponiendo el tipo entre paréntesis
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        
        var varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar  = '$'; //Muestra el valor decimal asociado al simbolo
        System.out.println("varEnteroChar = " + varEnteroChar);
        
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
    }
}
