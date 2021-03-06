/**
 * Numeros Aleatorios
 *
 * 7. Escribe un programa que muestre tres apuestas de la quiniela en tres columnas
 *    para los 14 partidos y el pleno al quince (15 filas).
 */ 
 
 public class Ejercicio07{
  public static void main(String[] args) {
    
    int columnas = 3;
    
    for(int fila = 1; fila <= 15; fila++){
      System.out.printf("%4d) ", fila);
      
      if(fila==15){
        columnas = 1;
        }
      for(int apuesta = 1; apuesta <= columnas; apuesta++){
        int resultado = (int)(Math.random()*3) + 1;
        switch(resultado){
          case 1:
            System.out.print(" 1 |");
            break;
          case 2:
            System.out.print(" X |");
            break;
          case 3:
            System.out.print(" 2 |");
            break;
          }
      }
      System.out.println();
    }
  }
}
