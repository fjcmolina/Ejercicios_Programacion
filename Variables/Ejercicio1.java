/**
 * Variables
 *
 * 1. Escribe un programa en el que se declaren las variables enteras X e Y. 
 *    Asignales los valores 144 y 999 respectivamente. A continuación, muestra
 *    por pantalla el valor de cada variable, la suma, la resta, la división
 *    y la multiplicación.
 */
 
public class Ejercicio1{
  public static void main(String[] args) {
    
    int x = 144;
    int y = 999;
    
    System.out.println("El valor de X es igual a " + x);
    System.out.println("El valor de Y es igual a " + y);
    System.out.println("El valor de la suma entre X e Y es igual a " + (x + y));
    System.out.println("El valor de la resta entre X e Y es igual a " + (x - y));
    System.out.println("El valor de la division entre X e Y es igual a " + ((double)x / (double)y));
    System.out.println("El valor de la multiplicación entre X e Y es igual a " + (x * y));
  
  }
}
