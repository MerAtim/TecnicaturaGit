
package OctavaClaseDeJava;

public class OperadoresCondicionales {

    public static void main(String[] args) {
        
        var valorA = -7;
        var valorMinimo = 0;
        var valorMaximo = 10;
        var respuesta = valorA >= valorMinimo && valorA <=valorMaximo;
        
        if (respuesta){
            System.out.println("Esta dentro del rango establecido.");
        }else{
            System.out.println("Está fuera del rango establecido.");
        }
  
        
        //Ejercicio padre puede asistir al juego. Usamos el operador OR
        var vacaciones = false;
        var diaLibre = true;
        if(vacaciones || diaLibre){
            System.out.println("El padre puede asistir al juego.");
        }else{
            System.out.println("El padre no puede asistir al juego.");
        }
        
    }
  }