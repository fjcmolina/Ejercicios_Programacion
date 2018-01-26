/*
 *  Arrays de una dimensión
 *  
 * 16. Escribe un programa que rellene un array de 20 elementos con números enteros
 *     aleatorios comprendidos entre 0 y 400 (ambos incluidos). A continuación
 *     el programa mostrará el array y preguntará si el usuario quiere resaltar los
 *     múltiplos de 5 o los múltiplos de 7. Seguidamente se volverá a mostrar el
 *     array escribiendo los números que se quieren resaltar entre corchetes.
 */
package ejercicio16;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio16 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numero = new int[20]; // se define el array y se reserva espacio para 10 enteros
    int i = 0;
    for (i = 0; i < 20; i++) {
      numero[i] = (int)(Math.random() * 401); //Genera numeros aleatorios
    }
    System.out.println();
    
    //Mostrar valores array original
    System.out.println("Los valores son: ");
    for (i = 0; i < 20; i++){
      System.out.println(numero[i]);
    }
   System.out.print("¿Que quieres destacar?(1.Multiplos de 5 2.Multiplos de 7):");
   int opcion = s.nextInt(); 
   
   switch(opcion){
     case 1:
       for (i = 0; i < 20; i++) {
        if((numero[i] % 5) == 0){
          System.out.print(" [" + numero[i] + "] ");
        }else{
          System.out.print(numero[i] + " ");
        }
       }
       break;
     case 2: 
       for (i = 0; i < 20; i++) {
        if((numero[i] % 7) == 0){
          System.out.print(" [" + numero[i] + "] ");
        }else{
          System.out.print(numero[i] + " ");
        }
       }
       break;
   }
 }
}