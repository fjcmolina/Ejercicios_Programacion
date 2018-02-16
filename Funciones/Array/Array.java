/*
 *  Funciones de arrays
 */
package array;

/**
 *
 * @author Francis
 */
public class Array {

  /**
   * Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo y
   * máximo) se indica como parámetro.
   *
   * @param n tamaño del array
   * @return Array con n números aleatorios entre min y max
   */
  public static int[] generraArrayInt(int n, int maximo, int minimo) {
    int[] x = new int[n];

    for (int i = 1; i < n; i++) {
      x[i] = (int) (Math.random() * (maximo - minimo + 1) + minimo);
    }
    return x;
  }

  /**
   * Devuelve el mínimo del array que se pasa como parámetro.
   *
   * @param n array de enteros
   * @return minimo del array
   */
  public static int minimoArrayInt(int x[]) {
    int minimo = Integer.MIN_VALUE;

    for (int n : x) {
      if (n < minimo) {
        minimo = n;
      }
    }

    return minimo;
  }

  /**
   * Devuelve el maximo del array que se pasa como parámetro.
   *
   * @param n array de enteros
   * @return maximo del array
   */
  public static int maximoArrayInt(int x[]) {
    int maximo = Integer.MAX_VALUE;

    for (int n : x) {
      if (n > maximo) {
        maximo = n;
      }
    }

    return maximo;
  }

  /**
   * Devuelve la media del array que se pasa como parámetro.
   *
   * @param x array de numeros enteros
   * @return media del array
   */
  public static double mediaArrayInt(int x[]) {
    int suma = 0;

    for (int n : x) {
      suma += n;
    }
    int media = suma / x.length;

    return media;
  }
  /**
   * Devuelve la media del array que se pasa como parámetro.
   *
   * @param x array de numeros enteros
   * @return media del array
   */
}
