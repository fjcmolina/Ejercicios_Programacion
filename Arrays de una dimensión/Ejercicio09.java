/*
 *  Arrays de una dimensión
 *  
 * 9. Realiza un programa que pida 8 números enteros y que luego muestre esos
 *    números junto con la palabra “par” o “impar” según proceda.
 */
package ejercicio09;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio09 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numero = new int[8]; // se define el array y se reserva espacio para 10 enteros
    
    for (int i = 0; i < 8; i++) {
      System.out.print("Introduce un numero: ");
      numero[i] = s.nextInt(); 
      
      // Comprobar si es par o impar
      
      if((numero[i] % 2) == 0){
        System.out.println(numero[i] + " Par");
      } else{
        System.out.println(numero[i] + " Impar");
      }
    }
 }
}