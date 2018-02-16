/*
 * 36.  Crea la función de manejo de arrays que tenga la siguiente cabecera y que
 *      haga lo que se especifica en los comentarios (puedes incluirla en tu propia
 *      biblioteca de rutinas):
                public static int[] filtraPrimos(int x[]) // Devuelve un array con todos los
                        // números primos que se encuentren
                        // en otro array que se pasa como
                        // parámetro.
                        // Obviamente el tamaño del array
                        // que se devuelve será menor o
                        // igual al que se pasa como
                        // parámetro.
 *      Utiliza esta función en un programa para comprobar que funcionan bien. Para
 *      que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
 *      decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
 *      también estará repetido 3 veces. Si no existe ningún número primo en x, se
 *      devuelve un array con el número -1 como único elemento.
 */
package ejercicio36;

import java.util.Scanner;
import matematicas.Varias;

/**
 *
 * @author Francis
 */
public class Ejercicio36 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el intervalo mínimo: ");
    int minimo = s.nextInt();
    System.out.println("Introduce el intervalo máximo: ");
    int maximo = s.nextInt();

    int[] original = new int[20];

    for (int a = 0; a < 20; a++) {
      original[a] = (int) (Math.random() * ((maximo - minimo) + 1) + minimo);
      System.out.print(original[a] + " ");
    }
    System.out.println();

    System.out.println("Este es el array solo con primos: ");

    int[] soloPrimos = filtraPrimos(original);

    for (int a : soloPrimos) {
      System.out.print(a + " ");
    }
    System.out.println();
  }

  public static int[] filtraPrimos(int x[]) {

    int numerosPrimos = 0;

    for (int a : x) {
      if (matematicas.Varias.esPrimo(a)) {
        numerosPrimos++;
      }
    }

    int[] soloPrimos = new int[numerosPrimos];
    int indice = 0;

    for (int a : x) {
      if (matematicas.Varias.esPrimo(a)) {
        soloPrimos[indice] = a;
        indice++;
      }
    }
    return soloPrimos;
  }
}
