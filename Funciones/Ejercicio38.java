/*
 * 38  Crea la función de manejo de arrays que tenga la siguiente cabecera y que
 *      haga lo que se especifica en los comentarios (puedes incluirla en tu propia
 *      biblioteca de rutinas):
 *
        public int[] filtraCapicuas(int x[]) // Devuelve un array con todos los números
                // capicúa que se encuentren en otro array
                // que se pasa como parámetro.
                // Obviamente el tamaño del array que se
                // devuelve será menor o igual al que se
                // pasa como parámetro.
 *      Utiliza esta función en un programa para comprobar que funcionan bien. Para
 *      que el ejercicio resulte más fácil, las repeticiones de números capicúa se
 *      conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
 *      array devuelto también estará repetido 3 veces. Si no existe ningún número
 */
package ejercicio38;

import java.util.Scanner;
import matematicas.Varias;
import array.Array;

/**
 *
 * @author Francis
 */
public class Ejercicio38 {

  public static void main(String[] args) {

    int[] array1 = array.Array.generaArrayInt(100, 0, 1000);

    System.out.println("Se ha creado el siguiente array de 100 numeros aleatorios: ");
    pintar(array1);

    System.out.println();
    
    int[] array2 = filtraCapicuas(array1);
    
    System.out.println("Se ha encontrado los siguientes numeros capicuas en el array anterior");
    pintar(array2);
  }

  public static int[] filtraCapicuas(int x[]) {

    int aux[] = new int[0];

    for (int i = 0; i < x.length; i++) {
      if (matematicas.Varias.esCapicua(x[i])) {
        aux = insertarUltimaPosicion(aux, x[i]);
      }
    }
    return aux;
  }

  public static int[] insertarUltimaPosicion(int x[], int n) {

    int[] temp = new int[x.length + 1];

    for (int i = 0; i < x.length; i++) {
      temp[i] = x[i];
    }

    temp[x.length] = n;

    return temp;
  }

  public static void pintar(int[] x) {

    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++) {
      System.out.print(" " + x[i]);
    }
    System.out.println("");

  }
}
