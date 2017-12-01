/*
 *  Arrays de una dimensión
 *  
 * 3. Escribe un programa que lea 10 números por teclado y que luego los muestre
 *    en orden inverso, es decir, el primero que se introduce es el último en
 *    mostrarse y viceversa.
 */
package ejercicio03;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio03 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numero = new int[10]; // se define el array y se reserva espacio para 10 enteros
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce un numero: ");
      numero[i] = s.nextInt(); 
    }
    System.out.println("Los numeros en el orden introducido es: ");
    for (int i = 0; i < 10; i++) {
      System.out.println(numero[i]);
      }
   System.out.println("Los numeros introducidos en el orden inverso es: ");
   for (int i = 9; i >= 0; i--){
      System.out.println(numero[i]);
      }
  } 
}
