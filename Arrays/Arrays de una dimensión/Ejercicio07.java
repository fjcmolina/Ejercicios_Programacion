/*
 *  Arrays de una dimensión
 *  
 * 7. Escribe un programa que genere 100 números aleatorios del 0 al 20 y que los
 *    muestre por pantalla separados por espacios. El programa pedirá entonces
 *    por teclado dos valores y a continuación cambiará todas las ocurrencias del
 *    primer valor por el segundo en la lista generada anteriormente. Los números
 *    que se han cambiado deben aparecer entrecomillados.
 */
package ejercicio07;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio07 {
  public static void main(String[] args) {
    
    int[] numero = new int[100]; // se define el array y se reserva espacio para 21 enteros
    Scanner s = new Scanner(System.in);
    
    for (int i = 0; i < 100; i++) {
      numero[i] = (int)( Math.random() * 21);
      System.out.print(numero[i] + " ");
     }
    
    //Pide dos valores de los numeros mostrados de forma aleatoria
     System.out.println("\nIntroduce un numero: ");
     int numero1 = s.nextInt(); 
     System.out.println("\nIntroduce un numero: ");
     int numero2 = s.nextInt();
     
     for(int i = 0; i < 100; i++){
       if(numero1 == numero[i]){
         numero[i] = numero2;
         System.out.print("\"" + numero[i] + "\"  ");
       }else{
         System.out.print(numero[i] + "  ");
       }
     }
  }
}