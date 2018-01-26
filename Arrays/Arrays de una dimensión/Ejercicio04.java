/*
 *  Arrays de una dimensión
 *  
 * 4. Define tres arrays de 20 números enteros cada una, con nombres numero,
 *    cuadrado y cubo. Carga el array numero con valores aleatorios entre 0 y 100. En el
 *    array cuadrado se deben almacenar los cuadrados de los valores que hay en el
 *    array numero. En el array cubo se deben almacenar los cubos de los valores que
 *    hay en numero. A continuación, muestra el contenido de los tres arrays dispuesto
 *    en tres columnas.
 */
package ejercicio04;

/**
 * @author Francis
 */
public class Ejercicio04 {
  public static void main(String[] args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    
    for (int i = 0; i < 20; i++) {
      numero[i] = (int)( Math.random() * 101); // Para el numero
      cuadrado[i] = (numero[i] * numero[i]);   // El cuadrado del numero anterior
      cubo[i] = (cuadrado[i] * numero[i]);    //El cubo del numero incial
     }
    System.out.println("Numero Cuadrado   Cubo");
    
    for (int i = 0; i < 20; i++){
    System.out.printf("\n%4d %8d %9d", numero[i],cuadrado[i],cubo[i]);
    }
  } 
}
