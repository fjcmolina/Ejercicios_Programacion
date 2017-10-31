/**
 * Bucles
 *
 * 11. Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de
 *     los 5 primeros números enteros a partir de uno que se introduce por teclado
 */ 
 
 public class Ejercicio11{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar el cuadrado y el cubo del numero introducido");
    System.out.println("Introduce un numero:");
    int numero = Integer.parseInt(System.console().readLine());
    
    for (int i = numero; i < numero + 5; i++) {
      System.out.printf("%4d %6d %8d\n", i, i * i, i * i * i);
    }
   
  }
}
