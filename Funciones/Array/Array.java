/*
 *    Funciones de arrays
 */
package array;

/**
 *
 * @author Francis
 */
public class Array {

  /**
   * 1.Genera un array de tamaño n con números aleatorios cuyo intervalo (mínimo
   * y máximo) se indica como parámetro.
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
   * 2.Devuelve el mínimo del array que se pasa como parámetro.
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
   * 3.Devuelve el maximo del array que se pasa como parámetro.
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
   * 4.Devuelve la media del array que se pasa como parámetro.
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
   * 5.Dice si un número está o no dentro de un array.
   *
   * @param n, número entero buscado
   * @param x, array número entero donde buscar
   * @return verdadero si el número está en el array, falso si no está en el
   * array
   */
  public static boolean estaEnArrayInt(int n, int[] x) {
    if (posicionEnArray(n, x) >= 0) {
      return true;
    } else {
      return false;
    }
  }

  /**
   * 6.Devuelve la posición de un número, n, dentro de un array de número
   * enteros, si el número no está en el array devuelve -1.
   *
   * @param n número entero buscado
   * @param x array de números enteros
   * @return número entero volteado
   */
  public static int posicionEnArray(int n, int[] x) {

    for (int i = 0; i < x.length; i++) {
      if (x[i] == n) {
        return i;
      }
    }
    return -1;
  }

  /**
   * 7.Devuelve un array con los valores volteados del array pasado por
   * parametro.
   *
   * @param x array de números enteros
   * @return array de números enteros con los valores volteados
   */
  public static int[] volteaArrayInt(int[] x) {

    int[] voltea = new int[x.length];
    for (int i = 0; i < x.length; i++) {
      voltea[i] = x[x.length - i - 1];
    }
    return voltea;
  }

  /**
   * 8.Devuelve el array pasado como parametro tras rotarlo n posiciones a la
   * izquierda
   *
   * @param n número entero, posiciones a rotar
   * @param x Array de números enteros,
   * @return Array de números enteros, tras rotar el array n posiciones a la
   * derecha
   */
  public static int[] rotaDerechaArrayInt(int n, int[] x) {

    int[] voltea = new int[x.length];
    n = x.length - n;
    for (int i = 0; i < x.length; i++) {
      if ((i + n) >= x.length) {
        n = -i;
      }
      voltea[i] = x[i + n];
    }
    return voltea;

  }

  /**
   * 9.Devuelve el array pasado como parametro tras rotarlo n posiciones a la
   * izquierda
   *
   * @param n número entero, posiciones a rotar
   * @param  Array de números enteros
   * @return Array de números enteros, tras rotar el array n posiciones a la
   * izquierda
   */
  public static int[] rotaIzquierdaArrayInt(int n, int[] x) {
    return rotaDerechaArrayInt((x.length - n), x);
  }
}
