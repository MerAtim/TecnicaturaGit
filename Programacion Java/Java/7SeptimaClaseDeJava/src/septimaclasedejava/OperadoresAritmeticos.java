
package septimaclasedejava;

public class OperadoresAritmeticos {

    public static void main(String[] args) {
       
        int num1=5, num2 = 4;
        var solucion = num1+num2;
        System.out.println("Solución de la suma = " + solucion);
        
        solucion = num1-num2;
        System.out.println("Solución de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("Solución de la multiplicación es = " + solucion);
        
        solucion = num1/num2;
        System.out.println("Solución de la división es = " + solucion);
        
        var solucion2 = 3.4/num2;
        System.out.println("Solución de la división es = " + solucion2);
        
        solucion = num1 % num2;
        System.out.println("Solución del resto de la división = " + solucion);
        
        if(num1 % 2 ==0) //Si la estructura IF-ELSE tiene solo una linea de codigo en cada bloque, pueden obviarse las llaves.
            System.out.println("El número " + num1 + " es PAR.");
        else
            System.out.println("El número " + num1 + " es IMPAR.");
        
    }
 }
