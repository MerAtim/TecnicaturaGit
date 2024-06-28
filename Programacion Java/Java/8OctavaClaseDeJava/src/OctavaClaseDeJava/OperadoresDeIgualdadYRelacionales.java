package OctavaClaseDeJava;

public class OperadoresDeIgualdadYRelacionales {

    public static void main(String[] args) {

        var aNum = 5; //int
        var bNum = 4; //int
        var cNum = (aNum == bNum); //boolean
        System.out.println("Comparación = " + cNum);

        var dNum = aNum != bNum; //boolean
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello"; //String
        var cadenaB = "Bye bye"; //String
        var cVar = cadenaA == cadenaB; //boolean
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum >= bNum;
        System.out.println("gVar = " + gVar);

        if (aNum % 2 == 0) {
            System.out.println("El numero es PAR");
        } else {
            System.out.println("El numero es IMPAR");
        }
    }

}
