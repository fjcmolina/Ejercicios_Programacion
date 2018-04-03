/*
 *    Colecciones y diccionarios
 *
 * 2. Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 *    ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 *    números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 *    y 20 elementos ambos inclusive.
 */
package ejercicio02;

import java.util.ArrayList;

/**
 *
 * @author Francis
 */
public class Ejercicio02 {

  public static void main(String[] args) {
    
    ArrayList<Integer> a = new ArrayList<>();
    
    int variable = (int)(Math.random() * 11 ) + 10;
    
    for(int i = 0; i < variable;i++){
      int num = (int)(Math.random() * 100);
      a.add(num);
    }
    
    System.out.println(a);
  }
  
}
