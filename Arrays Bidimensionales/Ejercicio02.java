/*
 *    Arrays Bidimensionales
 *
 * Escribe un programa que pida 20 números enteros. Estos números se deben
 * introducir en un array de 4 filas por 5 columnas. El programa mostrará las
 * sumas parciales de filas y columnas igual que si de una hoja de cálculo se
 * tratara. La suma total debe aparecer en la esquina inferior derecha.
 */
package ejercicio02;

/**
 *
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio02 {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     int[][] num = new int [4][5];
     
     //Introduccion de datos en el array
     for(int fila = 0; fila < 4; fila++) {
      for(int columna = 0; columna < 5; columna++) {
        System.out.print("Fila " + fila + ", columna " + columna + ": ");
        num[fila][columna] = s.nextInt();
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