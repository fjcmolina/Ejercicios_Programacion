/*
 * 37.  Crea una función con la siguiente cabecera:
 
             public String convierteEnMorse(int n)

 *      Esta función convierte el número n al sistema Morse y lo devuelve en una
 *      cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
 *      Morse. Utiliza esta función en un programa para comprobar que funciona bien.
 *      Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
 *      desde el programa principal.
 */
package ejercicio37;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio37 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduce el numero para convertir a palotes");
    int numero = s.nextInt();

    System.out.println("El numero " + numero + "en el sistema palotes es " + convierteMorse(numero));
  }

  public static String convierteMorse(int n) {
    String morse = " ";

    while (n > 0) {
      switch (n % 10) {
        case 1:
          morse = ". _ _ _ _" + morse;
          break;
        case 2:
          morse = ". . _ _ _" + morse;
          break;
        case 3:
          morse = ". . . _ _" + morse;
          break;
        case 4:
          morse = " . . . . _" + morse;
          break;
        case 5:
          morse = " . . . . ." + morse;
          break;
        case 6:
          morse = " _ . . . ." + morse;
          break;
        case 7:
          morse = " _ _ . . ." + morse;
          break;
        case 8:
          morse = " _ _ _ . ." + morse;
          break;
        case 9:
          morse = " _ _ _ _ ." + morse;
          break;
        default:
          morse = " _ _ _ _ _" + morse;
      }
      n /= 10;
    }

    return morse;
  }

}
