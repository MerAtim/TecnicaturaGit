package OctavaClaseDeJava;

public class OperadoresUnarios {

    public static void main(String[] args) {
       
        //Cambio de Signo
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB);
        
        //Operador de negacion - boolean
        var varC = true;
        var varD = !varC;
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);

        //Incremento-Preincremento:
        var varE = 9;
        var varF = ++varE;
        System.out.println("varE = " + varE);
        System.out.println("varF = " + varF);
        
        //Incremento-PostIncremento:
        var varG = 3;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operador unario de decremento - Pre:
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);  
        
        //Operador unario de decremento - Post:
        var varK = 8;
        var varL = varK--;
        System.out.println("varK = " + varK);
        System.out.println("varL = " + varL);  
    }
}
