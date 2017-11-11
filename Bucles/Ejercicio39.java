/**
 * Bucles
 *
 * 39. Escribe un programa que pida un número entero positivo por teclado y que
 *     muestre a continuación los números desde el 1 al número introducido junto
 *     con su factorial.
 */ 
 
 public class Ejercicio39{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcula el factorial hasta el numero introducido");
    System.out.println("Introduce un numero:");
    int numero= Integer.parseInt( System.console().readLine());
    
    for(int n = 1; n <= numero;n++){
      int factorial = n;
      for (int i = 1 ; i < n ; i++) {
          factorial *= i;
        }
    System.out.println("El factorial de " + n + " es " + factorial);
    }
  }
}
