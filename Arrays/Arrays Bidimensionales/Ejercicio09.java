/*
 *    Arrays Bidimensionales
 *
 * 9. Realiza un programa que sea capaz de rotar todos los elementos de una
 *    matriz cuadrada una posición en el sentido de las agujas del reloj. La matriz
 *    debe tener 12 filas por 12 columnas y debe contener números generados al
 *    azar entre 0 y 100. Se debe mostrar tanto la matriz original como la matriz
 *    resultado, ambas con los números convenientemente alineados.
 */
package ejercicio09;

/**
 *
 * @author Francis
 */
public class Ejercicio09 {
  public static void main(String[] args) {
    
    int[][] matriz = new int[12][12];
    
    System.out.println("Matriz original: ");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        matriz[i][j] = (int) (Math.random() * 101);
        System.out.printf("%5d", matriz[i][j]);
      }
      System.out.println();
    }
    int[][] aux = new int[12][12];
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        aux[j][11 - i] = matriz[i][j];
      }
    }
    System.out.println();
    System.out.println("Matriz rotada: ");
    for (int i = 0; i < 12; i++) {
      for (int j = 0; j < 12; j++) {
        System.out.printf("%5d", aux[i][j]);
      }
      System.out.println();
    }
  }

}
