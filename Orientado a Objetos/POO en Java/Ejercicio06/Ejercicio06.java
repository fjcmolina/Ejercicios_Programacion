/*
 * 6. Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase Tiempo
 *    son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 *    30) donde los parámetros que se le pasan al constructor son las horas, los
 *    minutos y los segundos respectivamente. Crea el método toString para ver los
 *    intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 *    35m 20s el resultado debería ser 1h 6m 0s. Realiza un programa de prueba para
 *    comprobar que la clase funciona bien.
 */
package ejercicio06;

/**
 *
 * @author Francis
 */
public class Ejercicio06 {

  public static void main(String[] args) {
    
    Tiempo t1 = new Tiempo(2,30,45);
    System.out.println("Tiempo 1: " + t1);
    
    Tiempo t2 = new Tiempo(1,15,55);
    System.out.println("Tiempo 2: " + t2);
    
    System.out.println();
    
    Tiempo t3 = t1.suma(1,15,55);
    System.out.println("Suma de tiempos : " + t3);
    
    System.out.println();
    
    Tiempo t4 = t1.resta(1,15,55);
    System.out.println("Resta de tiempos : " + t4);
  }
  
}
