/*
 *     Arrays Bidiminesionales
 *
 * 3. Modifica el programa anterior de tal forma que los números que se introducen
 *    en el array se generen de forma aleatoria (valores entre 100 y 999).
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Ejercicio03 {
  public static void main(String[] args) {
    
    int[][] num = new int [4][5];
    
     //Introduccion de datos en el array
     for(int fila = 0; fila < 4; fila++) {
      for(int columna = 0; columna < 5; columna++) {
          num[fila][columna] = (int)(Math.random() * 900) + 100;
      }
    System.out.println();
    }
     
    //Sumatorio filas
    for(int fila = 0;fila < 4;fila++){
      int sumaFila = 0;
      for(int columna = 0; columna < 5; columna++) {
        System.out.printf("%10d ", num[fila][columna]);
        sumaFila += num[fila][columna];
      }  
      System.out.printf("| ΣFila%7d\n", sumaFila);
    }
    
    //Pinta linea para separar resultado del array
    for(int columna = 0; columna < 6; columna++) {
      System.out.print("------------");
    }
    
    System.out.println();
    
    //Sumatorio columnas
    int sumaTotal = 0;
    for(int columna = 0;columna < 5;columna++){
      int sumaColumna = 0;
      for(int fila = 0; fila < 4; fila++) {
        sumaColumna += num[fila][columna];
      }
      sumaTotal += sumaColumna;
     System.out.printf("%10d ", sumaColumna);
    }
    System.out.printf("| ΣTotal%7d", sumaTotal);
  }
  
}
