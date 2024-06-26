package cuartaclasedejava;

public class TiposNumericosEnJava {

    public static void main(String[] args) {
        
        //byte
        byte numEnteroByte = (byte)127; //al intentar convertir corremos el riesgo de la perdida de precisión.
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor minimo del byte: " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte: " + Byte.MAX_VALUE);
        System.out.println("");
        //short
        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor minimo de short: " + Short.MIN_VALUE);
        System.out.println("Valor maximo de short: " + Short.MAX_VALUE);
        System.out.println("");
        //int
        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor minimo de un int: " + Integer.MIN_VALUE);
        System.out.println("Valor maximo de un int: " + Integer.MAX_VALUE);
        System.out.println("");
        //long
        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor minimo de un long: " + Long.MIN_VALUE);
        System.out.println("Valor maximo de un long: " + Long.MAX_VALUE);
        System.out.println("");
    }
    
}
