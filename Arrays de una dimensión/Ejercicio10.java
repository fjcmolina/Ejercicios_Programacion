/*
 *  Arrays de una dimensión
 *  
 * 10. Escribe un programa que genere 20 números enteros aleatorios entre 0 y 100
 *     y que los almacene en un array. El programa debe ser capaz de pasar todos
 *     los números pares a las primeras posiciones del array (del 0 en adelante) y
 *     todos los números impares a las celdas restantes. Utiliza arrays auxiliares si
 *     es necesario.
 */
package ejercicio10;

/**
 * @author Francis
 */

public class Ejercicio10 {
  public static void main(String[] args) {
    
    int[] numero = new int[20]; // se define el array y se reserva espacio para 20 enteros
    int [] par = new int[20]; //Array de los pares
    int [] impar = new int[20]; //Array de los impares
    int pares = 0;
    int impares = 0;
    
    //Genero los 2o numeros aleatorios
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 101);
      System.out.print(numero[i] + " ");
    
    //Comprobar si es par o impar
      if((numero[i] % 2) == 0){
        par[pares++] = numero[i];
      }else{
        impar[impares++] = numero[i];
      }
    }
    
    //Mostrar array original
    System.out.println("\nArray original:");
    for (int i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    //Pasar pares a las primeras posiciones del array
    for (int i = 0; i < pares; i++) {
      numero[i] = par[i];
    }
    //Los impares se coloan en las posiciones restantes del array
    for (int i = pares; i < 20; i++) {
      numero[i] = impar[i - pares];
    }
    //Mostrar el resultado del array con los cambios
    System.out.println("\nArray con los numeros pares en las primeras posiciones:");
    for (int i = 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
 }
}