/**
 * Bucles
 *
 * 31. Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
 *     programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
 *     mitad (división entera entre 2) de la altura más uno.
 */ 
 
 public class Ejercicio31{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la L: ");    
    int altura = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    
    for(i = 1; i < altura; i++){
      System.out.println("*");
      }
    for(i = 0; i < altura/ 2 ;i++){
      System.out.print("*");
      }
  }
}
