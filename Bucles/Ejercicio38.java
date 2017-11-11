/**
 * Bucles
 *
 * 38. Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos. El
 *     programa debe pedir la altura. Se debe comprobar que la altura sea un número
 *     impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje de
 *     error.
 */ 
 
 public class Ejercicio38{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la X(numero impar igual o mayor que 3): ");    
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int asteriscos = alturaIntroducida;
    int espacios = 0;
    int i = 0;
    
    while(altura < (alturaIntroducida/2 + 1)){
    
      for(i = 1; i <= espacios; i++){
        System.out.print(" ");
      }
      for(i = 0; i <= asteriscos; i++){
        System.out.print("*");
      }
      
      System.out.println();
      altura++;
      espacios++;
      asteriscos -= 2;
    }
    
    espacios = alturaIntroducida/2;
    altura = 1;
    
    while(altura <= (alturaIntroducida/2 + 1 )){
    
      for(i = 1; i <= espacios; i++){
        System.out.print(" ");
      }
      for(i = 0; i <= asteriscos; i++){
        System.out.print("*");
      }
      
      System.out.println();
      altura++;
      espacios--;
      asteriscos += 2;
    }
  }
}
