/*
 * Ejercicios Tema 8 Funciones y Arrays
 */
package Ejercicio20a28;

import array.Array;

/**
 *
 * @author Francis
 */
public class Ejercicio20a28 {

  public static void main(String[] args) {

    int[] prueba = array.Array.generaArrayInt(11, 0, 1000);
    int a = (int) (Math.random() * 1001);
    int r = (int) (Math.random() * 10) + 1;
    int l = (int) (Math.random() * 10) + 1;

    System.out.println("Se ha creado el siguiente array de 11 números enteros aleatorios:");
    pintar(prueba);
    System.out.println();
    System.out.println();
    
    System.out.println("El array dado la vuelta sería: ");
    pintar(array.Array.volteaArrayInt(prueba));
    System.out.println();
    System.out.println();

    System.out.println("El array tras girarlo " + r + " posiciones a la derecha quedaría: ");
    pintar(array.Array.rotaDerechaArrayInt(r, prueba));
    System.out.println();
    System.out.println();

    System.out.println("El array tras girarlo " + l + " posiciones a la izquierda quedaría: ");
    pintar(array.Array.rotaIzquierdaArrayInt(l, prueba));
    System.out.println();
    System.out.println();

    System.out.println("El mínimo del array es: " + array.Array.minimoArrayInt(prueba));
    System.out.println();

    System.out.println("El maximo del array es: " + array.Array.maximoArrayInt(prueba));
    System.out.println();

    System.out.println("La media del array es: " + array.Array.mediaArrayInt(prueba));
    System.out.println();

    int p = array.Array.posicionEnArray(a, prueba);
    if (p >= 0) {
      System.out.println("El número " + a + " está en la posición " + p + " del array.");
      System.out.println();
    } else {
      System.out.println("El número " + a + " no está en el array.");
      System.out.println();
    }

    System.out.println("El número " + prueba[5] + " está en la posición "
      + array.Array.posicionEnArray(prueba[5], prueba) + " del array.");

  }

  public static void pintar(int[] x) {
    System.out.print(x[0]);
    for (int i = 1; i < x.length; i++) {
      System.out.print(" " + x[i]);
    }
  }

}
