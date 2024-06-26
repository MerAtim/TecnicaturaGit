package septimaclasedejava;

public class OperadoresDeAsignacion {

    public static void main(String[] args) {
        
        //Las sumas y restas tienen la misma prioridad, el compilador hará el cálculo de izquierda a derecha
        int num1 = 1, num2 = 4;
        var num3 = num1 + 6 - num2;
        System.out.println("num3 = " + num3);
        
        //Operador de composición
        num1 += 1;
        System.out.println("Suma = " + num1);
        
        num2 -= 2;
        System.out.println("Resta = " + num2);
        
        num1 *= 5;
        System.out.println("Multiplicación = " + num1);
        
        num1 /= 4;
        System.out.println("División = " + num1);
        
        num1 %= 6;
        System.out.println("Resto = " + num1);
    }
    
}
