/*
 *  Arrays de una dimensión
 *  
 * 6. Escribe un programa que lea 15 números por teclado y que los almacene en un
 *    array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 *    debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 *    la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 *    del array.
 */
package ejercicio06;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio06 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] original = new int[15]; //Definicion array original
    int[] rotado = new int[16]; //Definicion array rotado
    
    for (int i = 0; i < 15; i++) {
    
      System.out.print("Escribe un número: ");
      int numeroIntroducido = s.nextInt();
      
      original[i] = numeroIntroducido;
      rotado [i+1] = numeroIntroducido;  
      
      if (i == 14) {
      rotado[0] = numeroIntroducido;   
      }
    }
    //Resultado del array original
    System.out.print("Primer array: ");
    for (int i = 0; i < 15; i++) {
      System.out.print(original[i] + " ");       
    }
    System.out.println();
    //Resultado del array rotado
    System.out.print("Array rotado: ");
    for (int j = 0; j < 15; j++) {
      System.out.print(rotado[j] + " "); 
    }
  }
}