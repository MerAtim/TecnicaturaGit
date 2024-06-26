package OctavaClaseDeJava;

public class OperadorTernario {

    public static void main(String[] args) {

        //Se llama operador Ternario porque tiene 3 partes - CONDICION + SI SE CUMPLE + SI NO SE CUMPLE

        var resultadoT = (5 > 4) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 7;
        resultadoT = numeroT % 2 == 0 ? "Es Par. " : "Es Impar";
        System.out.println("resultadoT = " + resultadoT);
                
        // Prioridad de los Operadores
        //Las expresiones se evalúan de izquierda a derecha.
        var x = 5;
        var y = 10;
        var z = ++x + y--; //x vale 6 e y vale 10 porque al leer de izquierda a derecha se encuentra primero la variable y.
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
        var solucionAritmetica = 4 + 5 * 6 / 3; //1° Multiplicacion - 2° División - 3° Suma
        System.out.println(solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; //La prioridad la tienen los parentesis
        System.out.println(solucionAritmetica);
    }

}
