/*
 *  Arrays de una dimensión
 *  
 * 11. Realiza un programa que pida 10 números por teclado y que los almacene en
 *     un array. A continuación se mostrará el contenido de ese array junto al índice
 *     (0 – 9) utilizando para ello una tabla. Seguidamente el programa pasará los
 *     primos a las primeras posiciones, desplazando el resto de números (los que
 *     no son primos) de tal forma que no se pierda ninguno. Al final se debe mostrar
 *     el array resultante.
 */
package ejercicio11;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    
    int[] numero = new int[10]; // se define el array y se reserva espacio para 20 enteros
    int [] primo = new int[10]; //Array de los primos
    int [] noPrimo = new int[10]; //Array de los no primos
    int contadorPrimo = 0;
    int contadorNoPrimo = 0;
    boolean esPrimo = false;
    Scanner s =  new Scanner(System.in);
    
    for (int i = 0; i < 10; i++) {
      System.out.print("Introduce un numero: ");
      numero[i] = s.nextInt(); 
      
      esPrimo = true;
      //Comprobar si es primo o no
      for(int j = 2; j < numero[i] - 1; j++){
        if((numero[i] % j) == 0){
          esPrimo = false;
        }
      }
      
      if(esPrimo){
        primo[contadorPrimo++] = numero[i];
      }else{
        noPrimo[contadorNoPrimo++] = numero[i];
      }
    }
    //Mostrar array original
      System.out.println("\nArray original:");
      for (int i = 0; i < 10; i++) {
        System.out.print(numero[i] + " ");
      }
      //Pasar primos a las primeras posiciones del array
      for (int i = 0; i < contadorPrimo; i++) {
        numero[i] = primo[i];
      }
      //Los no primos se colocan en las posiciones restantes del array
      for (int i = contadorPrimo; i < 10; i++) {
        numero[i] = noPrimo[i - contadorPrimo];
      }
      //Mostrar el resultado del array con los cambios
      System.out.println("\nArray con los numeros primos en las primeras posiciones:");
      for (int i = 0; i < 10; i++) {
        System.out.print(numero[i] + " ");
      }
 }
}