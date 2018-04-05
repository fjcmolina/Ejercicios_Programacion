/*
 *    Colecciones y diccionarios
 *
 * 3. Escribe un programa que ordene 10 números enteros introducidos por teclado
 *    y almacenados en un objeto de la clase ArrayList.
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Francis
 */
public class Ejercicio03 {

  public static void main(String[] args) {

    ArrayList<Integer> a = new ArrayList<>();

    a.add(67);
    a.add(78);
    a.add(10);
    a.add(4);
    a.add(97);
    a.add(38);
    a.add(50);
    a.add(7);
    a.add(62);
    a.add(76);

    System.out.println("\nNúmeros en el orden original:");
    for (int numero : a) {
      System.out.println(numero);
    }

    Collections.sort(a);

    System.out.println("\nNúmeros en el orden original:");
    for (int numero : a) {
      System.out.println(numero);
    }
  }

}
