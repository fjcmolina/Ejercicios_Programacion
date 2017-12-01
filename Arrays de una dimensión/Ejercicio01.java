/*
 *  Arrays de una dimensión
 *  
 * 1. Define un array de 12 números enteros con nombre num y asigna los valores
 *    según la tabla que se muestra a continuación. Muestra el contenido de todos
 *    los elementos del array. ¿Qué sucede con los valores de los elementos que no
 *    han sido inicializados?
 */
package ejercicio01;

/**
 * @author Francis
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    int[] num = new int[12]; // se define el array y se reserva espacio para 12 enteros
    
    num[0] = 39;
    num[1] = -2;
    num[4] = 0;
    num[6] = 14;
    num[8] = 5;
    num[9] = 120;
    
    // Al no introducir valores a un elemento del array por defecto toma el valor 0
    
    System.out.println("El array contiene los siguientes valores:");
    
    for (int i = 0; i < 12; i++) {
      System.out.println(num[i]);
     }
  } 
}
