/*
 * 39.  Crea una función con la siguiente cabecera:

            public String convierteEnPalabras(int n)

 *      Esta función convierte los dígitos del número n en las correspondientes
 *      palabras y lo devuelve todo en una cadena de caracteres. Por ejemplo, el
 *      470213 convertido a palabras sería:

              cuatro, siete, cero, dos, uno, tres

 *      Utiliza esta función en un programa para comprobar que funciona bien. Desde
 *      la función no se debe mostrar nada por pantalla, solo se debe usar print desde
 *      el programa principal. Fíjate que hay una coma detrás de cada palabra salvo
 *      al final.
 */
package ejercicio39;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio39 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.println("Introduce un numero: ");
    int numero = s.nextInt();
    
    System.out.println("El numero " + numero + " convertido en una palabra es " + convierteEnPalabras(numero));
  }

  public static String convierteEnPalabras(int n) {

    String palabras = "";
    while (n > 0) {
      switch (n % 10) {
        case 1:
          palabras = ", uno" + palabras;
          break;
        case 2:
          palabras = ", dos" + palabras;
          break;
        case 3:
          palabras = ", tres" + palabras;
          break;
        case 4:
          palabras = ", cuatro" + palabras;
          break;
        case 5:
          palabras = ", cinco" + palabras;
          break;
        case 6:
          palabras = ", seis" + palabras;
          break;
        case 7:
          palabras = ", siete" + palabras;
          break;
        case 8:
          palabras = ", ocho" + palabras;
          break;
        case 9:
          palabras = ", nueve" + palabras;
          break;
        default:
          palabras = ", cero" + palabras;
      }
      n /= 10;
    }

    return palabras.substring(2);

  }
}
