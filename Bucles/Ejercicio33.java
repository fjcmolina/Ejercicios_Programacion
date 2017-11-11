/**
 * Bucles
 *
 * 33. Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
 *     programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
 *     dos asteriscos menos en la base para simular la curvatura de las esquinas
 *     inferiores.
 */ 
 
 public class Ejercicio33{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la U: ");    
    int altura = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int j = 0;
    
    for(i = 1; i <= altura - 1; i++){
      System.out.print("*");
      
      for(j = 2; j <= altura; j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }
    // base de la U
    for(i = 1; i <= altura/2; i++){
      System.out.print(" *");
    }
  }
}
