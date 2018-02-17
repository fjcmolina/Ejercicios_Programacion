/*
 * 40.  Crea la función de manejo de arrays que tenga la siguiente cabecera y que
 *      haga lo que se especifica en los comentarios (puedes incluirla en tu propia
 *      biblioteca de rutinas):

            public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
                // que contienen el 7 (por ej. 7, 27, 782)
                // que se encuentren en otro array que se
                // pasa como parámetro. El tamaño del array
                // que se devuelve será menor o igual al
                // que se pasa como parámetro.

 *      Utiliza esta función en un programa para comprobar que funcionan bien. Para
 *      que el ejercicio resulte más fácil, las repeticiones de números que contienen 7
 *      se conservan; es decir, si en el array x el número 875 se repite 3 veces, en el
 *      array devuelto también estará repetido 3 veces. Si no existe ningún número
 *      que contiene 7 en el array x, se devuelve un array con el número -1 como
 *      único elemento.
 */
package ejercicio40;

import matematicas.Varias;
import array.Array;
/**
 *
 * @author Francis
 */
public class Ejercicio40 {

  public static void main(String[] args) {
    int[] a = array.Array.generaArrayInt(100, 0, 1000);

    System.out.println("Se ha creado el siguiente array de 100 números enteros aleatorios:");
    pintar(a);

    int[] b = filtraCon7(a);

    System.out.println();
    
    System.out.println("Se han encontrado los siguientes números, que incluyen un 7, dentro del anterior array: ");
    pintar(b);

  }

  public static int[] filtraCon7(int x[]) {

    int[] temp = new int[0];
    for (int i = 0; i < x.length; i++) {
      if (matematicas.Varias.posicionDeDigito(x[i], 7) >= 0) {
        temp = insertarUltimaPosicion(temp, x[i]);
      }
    }
    return temp;

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
      System.out.print(", " + x[i]);
    }
    System.out.println(".");

  }
}
