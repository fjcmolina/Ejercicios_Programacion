/*
 * 35. Esta función convierte el número n al sistema de palotes y lo devuelve en una
 *     cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
 *     | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
 *     para comprobar que funciona bien. Desde la función no se debe mostrar nada
 *     por pantalla, solo se debe usar print desde el programa principal.
 */
package ejercicio35;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio35 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el número para convertir en palotes: ");
    int numero = s.nextInt();

    System.out.println(convierteEnPalotes(numero));
  }

  public static String convierteEnPalotes(int n) {

    String palotes = "";

    while (n > 9) {
      for (int i = 1; i <= (n % 10); i++) {
        palotes = "|" + palotes;
      }
      palotes = "-" + palotes;
      n /= 10;
    }
    for (int i = 1; i <= n; i++) {
      palotes = "|" + palotes;
    }

    return palotes;

  }
}
