/**
 * Bucles
 *
 * 24. Escribe un programa que lea un número n e imprima una pirámide de números
 *     con n filas como en la siguiente figura:
 */ 
 
 public class Ejercicio24{
  public static void main(String[] args) {
    
    System.out.println("Vamos a relaizar un programa que pinta una piramide de numeros");
    
    System.out.println("Introduce la altura de la piramide");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int i = 0;
    
    while( altura <= alturaIntroducida){
      
      for(i = 1; i <= espacios; i++){
        System.out.print(" ");
        }
        
      for(i = 1; i <= altura  - 1; i++){
        System.out.print(i);
        }
      for(i = altura; i > 0; i--){
        System.out.print(i);
        }
        
      System.out.println();
      
      altura++;
      espacios--;
    }
  }
}
