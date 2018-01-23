/*
 *    Arrays Bidimensionales
 *  
 * 6. Modifica el programa anterior de tal forma que no se repita ningún número en
 *    el array.
 */
package ejercicio06;

/**
 *
 * @author Francis
 */
public class Ejercicio06 {
  public static void main(String[] args) {
    
    int[][] num = new int [6][10];
    boolean repetido;
    
    for(int fila = 0; fila < 6; fila++) {
      for(int columna = 0; columna < 10; columna++) {
        do {
          num[fila][columna] = (int)(Math.random() * 1001);

          // Comprueba si el número generado ya está en el array.
          repetido = false;
          for (int i = 0; i < 10 * fila + columna; i++) {
            if (num[fila][columna] == num[i / 10][i % 10]) {
              repetido = true;
            }
          }
        } while (repetido);
      }
    }
    
    int minimo = 9999;
    int filaMinimo = 0;
    int columnaMinimo = 0;
    
    int maximo = 0;
    int filaMaximo = 0;
    int columnaMaximo = 0;
    
    //Introduccion de datos en el array
     for(int fila = 0; fila < 6; fila++) {
      for(int columna = 0; columna < 10; columna++) {
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
   System.out.println("El maximo es " + maximo + " en la fila " +(filaMaximo +1)+ " y la columna "+(columnaMaximo+1));
   System.out.println("El minimo es " + minimo + " en la fila " +(filaMinimo +1)+ " y la columna "+(columnaMinimo + 1));
  }
  
}
