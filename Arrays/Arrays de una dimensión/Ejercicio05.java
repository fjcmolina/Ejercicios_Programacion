/*
 *  Arrays de una dimensión
 *  
 * 3. Escribe un programa que pida 10 números por teclado y que luego muestre
 *    los números introducidos junto con las palabras “máximo” y “mínimo” al lado
 *    del máximo y del mínimo respectivamente.
 */
package ejercicio05;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio05 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numero = new int[10]; // se define el array y se reserva espacio para 10 enteros
    int maximo = 0;
    int minimo = 9999999;
    
    for (int i = 0; i < 10; i++) {
      System.out.println("Introduce un numero: ");
      numero[i] = s.nextInt(); 
      
      // Comprobar maximo y minimo
      
      if(numero[i] > maximo){
        maximo = numero[i];
      } 
       if(numero[i] < minimo){
        minimo = numero[i];
      }
    }
    System.out.println();
    //Mostrar valores
    System.out.println("Los valores son: ");
    
    for (int i = 0; i < 10; i++){
      System.out.print(numero[i]);
      if(numero[i] == maximo){
        System.out.print(" Maximo\n");
      }
      if(numero[i] == minimo){
        System.out.print(" Minimo\n");
      }
     System.out.println();
    }
 }
}