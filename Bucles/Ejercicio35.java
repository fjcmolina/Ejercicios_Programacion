/**
 * Bucles
 *
 * 35. Realiza un programa que pinte una X hecha de asteriscos. El programa debe
 *     pedir la altura. Se debe comprobar que la altura sea un número impar mayor
 *     igual a 3, en caso contrario se debe mostrar un mensaje de error.
 */ 
 
 public class Ejercicio35{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura de la X(numero impar igual o mayor que 3): ");    
    int altura = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int j = 0;
    
    for(i = 1; i <= altura ; i++){
      for(j = 1; j <= altura; j++){
        if((i == j) || (j == ((altura - i)+1))){
        System.out.print("*");
        }else{
          System.out.print(" ");
          }
      }
      System.out.println();
    }
  }
}
