/*
 *    Colecciones y diccionarios
 *
 * 4. Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 *    debe ordenar palabras en lugar de números.
 */
package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 *
 * @author Francis
 */
public class Ejercicio04 {

  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
      ArrayList<String> a = new ArrayList<>();

    System.out.println("Introduce 10 palabras:");
    for (int i = 0; i < 10; i++) {
      String palabra = s.next();
      a.add(palabra);
    }

    System.out.println("\nPalabras en el orden original:");
    for (String palabra : a) {
      System.out.println(palabra);
    }

    Collections.sort(a);

    System.out.println("\nPalabras ordenadas alfabeticamente:");
    for (String palabra : a) {
      System.out.println(palabra);
    }
  }
  
}
