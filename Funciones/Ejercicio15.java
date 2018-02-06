/*
 *  Funciones
 *
 * 15. Muestra los números primos que hay entre 1 y 1000.
 */
package ejercicio15;

import matematicas.Varias;
/**
 *
 * @author Francis
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    for(int i = 1; i < 1001;i++){
      if(matematicas.Varias.esPrimo(i)){
        System.out.print(i + " ");
      }
    }
  }
  
}
