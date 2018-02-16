/*
 * Ejercicios Tema 8 Funciones y Arrays Bidimensionales
 */
package Ejercicio29a34;

import array.ArrayBi;

/**
 *
 * @author Francis
 */
public class Ejercicio29a34 {

  public static void main(String[] args) {
    int[][] prueba = array.ArrayBi.generaArrayBiInt(9, 11, 0, 1000);
    int a = (int) (Math.random() * 1001);
    int f = (int) (Math.random() * 9);
    int c = (int) (Math.random() * 11);

    System.out.println("Se ha creado el siguiente array bidimensional de 99 números enteros aleatorios: ");
    pintar(prueba);

    System.out.println("La fila " + f + " del array sería: ");
    pintar(array.ArrayBi.filaDeArrayBiInt(prueba, f));
    System.out.println();

    System.out.println("La columna " + c + " del array sería: ");
    pintar(array.ArrayBi.columnaDeArrayBiInt(prueba, c));
    System.out.println();

    int[][] p = array.ArrayBi.coordenadasEnArrayBiInt(prueba, a);
    if (p[0][0] >= 0) {
      System.out.println("El número " + a + " está en la posición [" + p[0][0] + ", " + p[0][1]
        + "] del array.");
    } else {
      System.out.println("El número " + a + " no está en el array.");
    }
    p = array.ArrayBi.coordenadasEnArrayBiInt(prueba, prueba[5][8]);
    System.out.println("El número " + prueba[5][8] + " está en la posición [" + p[0][0] + ", "
      + p[0][1] + "] del array.");

    if (array.ArrayBi.esPuntoDeSilla(prueba, f, c)) {
      System.out.println("El número " + prueba[f][c] + " es un punto de silla.");
    } else {
      System.out.println("El número " + prueba[f][c] + " no es un punto de silla.");
    }
    System.out.println();

    System.out.println("La diagonal que pasa por la posición [" + f + ", " + c
      + "] en dirección Noroeste a Sureste es: ");
    pintar(array.ArrayBi.diagonal(prueba, f, c, "nose"));
    System.out.println();

    System.out.println("La diagonal que pasa por la posición [" + f + ", " + c
      + "] en dirección Noreste a Suroeste es: ");
    pintar(array.ArrayBi.diagonal(prueba, f, c, "neso"));

  }

  public static void pintar(int[][] x) {
    for (int i = 0; i < x.length; i++) {
      pintar(x[i]);
    }
    System.out.println();
  }

  public static void pintar(int[] x) {
    for (int i = 0; i < x.length; i++) {
      System.out.printf("%5d", x[i]);
    }
    System.out.println();
  }

}
