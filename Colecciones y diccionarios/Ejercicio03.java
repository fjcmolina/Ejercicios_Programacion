/*
 *    Colecciones y diccionarios
 *
 * 3. Escribe un programa que ordene 10 números enteros introducidos por teclado
 *    y almacenados en un objeto de la clase ArrayList.
 */
package ejercicio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio03 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    ArrayList<Integer> a = new ArrayList<>();
    
    System.out.println("Introduce 10 numeros:");
    for (int i = 0; i < 10; i++) {
      int num = s.nextInt();
      a.add(num);
    }

    System.out.println("\nNúmeros en el orden original:");
    for (int numero : a) {
      System.out.println(numero);
    }

    Collections.sort(a);

    System.out.println("\nNúmeros ordenados:");
    for (int numero : a) {
      System.out.println(numero);
    }
  }

}
