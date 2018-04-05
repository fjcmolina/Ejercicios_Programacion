/*
 *    Colecciones y diccionarios
 *
 * 4. Realiza un programa equivalente al anterior pero en esta ocasión, el programa
 *    debe ordenar palabras en lugar de números.
 */
package ejercicio04;

import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author Francis
 */
public class Ejercicio04 {

  public static void main(String[] args) {
    
      ArrayList<String> a = new ArrayList<>();

    a.add("Hola");
    a.add("Coche");
    a.add("Moto");
    a.add("Bicicleta");
    a.add("Furgoneta");
    a.add("Avion");
    a.add("Tractor");
    a.add("Camion");
    a.add("Adios");
    a.add("Tren");

    System.out.println("\nNúmeros en el orden original:");
    for (String palabra : a) {
      System.out.println(palabra);
    }

    Collections.sort(a);

    System.out.println("\nNúmeros en el orden original:");
    for (String palabra : a) {
      System.out.println(palabra);
    }
  }
  
}
