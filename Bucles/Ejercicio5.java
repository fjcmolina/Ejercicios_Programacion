/**
 * Sentencia Condicional
 *
 * 5. Muestra los numeros del 320 al 160, contando de 20 en 20 hacia atras
 *    utilizando un bucle while.
 */
 
 public class Ejercicio5{
  public static void main(String[] args) {
    
    System.out.println("Vamos a mostrar una cuenta hacia atras de 20 en 20");
    
    int num = 320;
    
    while(num >= 160){
      System.out.println(num);
      num -= 20;
      
    }
  }
}

