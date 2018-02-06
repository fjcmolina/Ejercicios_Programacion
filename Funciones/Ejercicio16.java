/*
*  Funciones
 *
 * 16. Muestra los números capicúa que hay entre 1 y 99999.
 */
package ejercicio16;

import matematicas.Varias;
/**
 *
 * @author Francis
 */
public class Ejercicio16 {
  public static void main(String[] args) {
    
    for(int i = 1; i < 99999;i++){
      if(matematicas.Varias.esCapicua(i)){
        System.out.print(i + " ");
      }
    }
  }
  
}
