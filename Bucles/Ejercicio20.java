/**
 * Bucles
 *
 * 20. Igual que el ejercicio anterior pero esta vez se debe pintar una pirámide hueca.
 */ 
 
 public class Ejercicio20{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa para que pinte una piramide");
    System.out.println("Introduce la altura de la piramide");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el caracter que deseas para pintar la piramide");
    String pintar = System.console().readLine();
    
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int hueco = 0;
    
    while( altura <= alturaIntroducida -1){
      
      for(int i = 1; i <= espacios; i++){
        System.out.print(" ");
        }
        
      System.out.print(pintar);
      
      for(int i = 1; i < hueco; i++){
        System.out.print(" ");
        }
        
      if(altura > 1){
      System.out.print(pintar);
        } 
      System.out.println();
      
      altura++;
      espacios--;
      hueco += 2;
    }
    for(int i = 1; i <= (altura * 2) - 1; i++){
        System.out.print(pintar);
        }
  }
}
