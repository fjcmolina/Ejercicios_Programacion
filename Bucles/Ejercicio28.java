/**
 * Bucles
 *
 * 28. Escribe un programa que calcule el factorial de un número entero leído por
 *     teclado.
 */ 
 
 public class Ejercicio28{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcula el factorial del numero introducido");
    System.out.println("Introduce un numero:");
    int numero= Integer.parseInt( System.console().readLine());
    
    int factorial = 1;
    
    for (int i = 1 ; i <= numero ; i ++) {
        factorial *= i;
      }
    System.out.println("El factorial de " + numero + " es " + factorial);
  }
}
