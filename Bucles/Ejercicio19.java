/**
 * Bucles
 *
 * 19. Realiza un programa que pinte una pirámide por pantalla. La altura se debe
 *     pedir por teclado. El carácter con el que se pinta la pirámide también se debe
 *     pedir por teclado.
 */ 
 
 public class Ejercicio19{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa para que pinte una piramide");
    System.out.println("Introduce la altura de la piramide");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter que deseas para pintar la piramide");
    String pintar = System.console().readLine();
  
  }
}
