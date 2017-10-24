/**
 * Sentencia Condicional
 *
 * 19. Realiza un programa que nos diga cuantos digitos tiene un numero entero
 *     que puede ser positivo o negativo. Se permiten numeros de hasta 5 digitos.
 */

public class Ejercicio19{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que cuantos digitos tiene el numero");
    System.out.print("Introduce un numero de cinco cifras : ");
    
    int num = Integer.parseInt(System.console().readLine());
    
    if (num >= 100000){
        System.out.print("El numero introducido tiene mas de 5 digitos");
      }else {
      
        if (num < 10) {
            System.out.print("El numero tiene un digito");
          }
        if ((num >= 10) && (num < 100)) {
            System.out.print("El numero tiene dos digito");
          }
        if ((num >= 100) && (num < 1000)) {
            System.out.print("El numero tiene tres digitos");
          }
        if ((num >= 1000) && (num < 10000)) {
            System.out.print("El numero tiene cuatro digitos");
          }
        if (num >= 10000) {
            System.out.print("El numero tiene cinco digitos");
          }
      }
  }
}
