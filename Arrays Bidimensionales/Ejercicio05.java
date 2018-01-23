/*
 *   Arrays Bidimensionales
 *  
 * 6. Realiza un programa que rellene un array de 6 filas por 10 columnas con
 *    números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos).
 *    A continuación, el programa deberá dar la posición tanto del máximo como
 *    del mínimo.
 */
package ejercicio05;

/**
 *
 * @author Francis
 */
public class Ejercicio05 {
  public static void main(String[] args) {
    
    int[][] num = new int [6][10];
    
    int minimo = 9999;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = 0;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    
    //Introduccion de datos en el array
     for(int fila = 0; fila < 6; fila++) {
      for(int columna = 0; columna < 10; columna++) {
          num[fila][columna] = (int)(Math.random() * 1001);
          System.out.printf("%10d ", num[fila][columna]);
          
          if(num[fila][columna] < minimo){
            minimo = num[fila][columna];
            filaMinimo = fila;
            columnaMinimo = columna;
          }
          if(num[fila][columna] > maximo){
            maximo = num[fila][columna];
            filaMaximo = fila;
            columnaMaximo =  columna;
          }
      }
    System.out.println();
    } 
   System.out.println("El maximo es " + maximo + " en la fila " +filaMaximo+ " y la columna "+columnaMaximo);
   System.out.println("El minimo es " + minimo + " en la fila " +filaMinimo+ " y la columna "+columnaMinimo);
  }
  
}
