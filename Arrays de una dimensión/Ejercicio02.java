/*
 *  Arrays de una dimensión
 *  
 * 2. Define un array de 10 caracteres con nombre simbolo y asigna valores a los
 *    elementos según la tabla que se muestra a continuación. Muestra el contenido
 *    de todos los elementos del array. ¿Qué sucede con los valores de los elementos
 *    que no han sido inicializados?
 */
package ejercicio02;

/**
 * @author Francis
 */
public class Ejercicio02 {
  public static void main(String[] args) {
    
    char[] simbolo = new char[10]; // se define el array y se reserva espacio para 12 enteros
    
    simbolo[0] = 'a';
    simbolo[1] = 'x';
    simbolo[4] = '@';
    simbolo[6] = ' ';
    simbolo[7] = '+';
    simbolo[8] = 'Q';
    
    // Al no introducir valores a un elemento del array por defecto toma el valor 0
    
    System.out.println("El array contiene los siguientes valores:");
    
    for (int i = 0; i < 10; i++) {
      System.out.println(simbolo[i]);
     }
  } 
}
