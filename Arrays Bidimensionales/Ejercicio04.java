/*
 *   Arrays Bidimensionales
 *
 * 4. Modifica el programa anterior de tal forma que las sumas parciales y la suma
 *    total aparezcan en la pantalla con un pequeño retardo, dando la impresión de
 *    que el ordenador se queda “pensando” antes de mostrar los números.
 */
package ejercicio04;

/**
 *
 * @author Francis
 */
public class Ejercicio04 {
  public static void main(String[] args) throws InterruptedException {
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
        Thread.sleep(100);
      }  
      System.out.printf("| ΣFila%7d\n", sumaFila);
      Thread.sleep(100);
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
        Thread.sleep(100);
      }
      sumaTotal += sumaColumna;
     System.out.printf("%10d ", sumaColumna);
     Thread.sleep(100);
    }
    Thread.sleep(1500);
    System.out.printf("| ΣTotal%7d", sumaTotal);
  }
  
}
