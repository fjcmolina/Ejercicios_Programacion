/**
 * Sentencia Condicional
 *
 * 14. Realiza un programa que diga si un numero introducido por teclado es par
 *     y/o divisible entre 5.
 */

public class Ejercicio14{
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero : ");
    int num = Integer.parseInt(System.console().readLine());

    if ((num % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número introducido es impar");
    }

    if ((num % 5) == 0) {
      System.out.println(" y divisible entre 5");
    } else {
      System.out.println(" y no es divisible entre 5");
    }
  }
}
