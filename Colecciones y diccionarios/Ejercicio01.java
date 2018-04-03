/*
 *    Colecciones y diccionarios
 *
 * 1. Crea un ArrayList con los nombres de 6 compañeros de clase. A continuación,
 * muestra esos nombres por pantalla. Utiliza para ello un bucle for que recorra
 * todo el ArrayList sin usar ningún índice.
 */
package ejercicio01;

import java.util.ArrayList;

/**
 *
 * @author Francis
 */
public class Ejercicio01 {

  public static void main(String[] args) {

    ArrayList<String>  nombres = new ArrayList<>();
    
    nombres.add("Lucia");
    nombres.add("Adrian");
    nombres.add("Alex");
    nombres.add("Jesus");
    nombres.add("Adam");
    nombres.add("Juan");
    
    System.out.println("Nombres de alumnos de clase: ");
    
    for(String n : nombres){
      System.out.println(n);
    }
  }

}
