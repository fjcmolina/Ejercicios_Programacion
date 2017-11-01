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
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter que deseas para pintar la piramide");
    String pintar = System.console().readLine();
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    
    while( altura <= alturaIntroducida){
      
      for(int i = 1; i <= espacios; i++){
        System.out.print(" ");
        }
        
      for(int i = 1; i <= altura * 2; i++){
        System.out.print(pintar);
        }
        
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}
