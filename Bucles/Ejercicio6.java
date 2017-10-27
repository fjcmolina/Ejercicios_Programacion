/**
 * Bucles
 *
 * 6. Muestra los numeros del 320 al 160, contando de 20 en 20 hacia atras
 *    utilizando un bucle do-while.
 */
 
 public class Ejercicio6{
  public static void main(String[] args) {
    
    System.out.println("Vamos a mostrar una cuenta hacia atras de 20 en 20");
    
    int num = 360;
    
    do{
      System.out.println(num);
      num -= 20;
      }
    while(num >= 160);
  
    }
  }
