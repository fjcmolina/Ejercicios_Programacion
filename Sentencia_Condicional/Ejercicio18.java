/**
 * Sentencia Condicional
 *
 * 18. Escribe un programa que diga cual es la primera cifra de un numero
*      entero introducido por teclado. Se permiten de hasta 5 cifras.
 */

public class Ejercicio18{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra la primera cifra de un numero");
    System.out.print("Introduce un numero de cinco cifras : ");
    
    int num = Integer.parseInt(System.console().readLine());
    
    if (num >= 100000){
        System.out.print("El numero introducido tiene mas de 5 digitos");
      }else {
      
        if (num < 10) {
            System.out.print("La primera cifra es " + num);
          }
        if ((num >= 10) && (num < 100)) {
            System.out.print("La primera cifra es " + num/10);
          }
        if ((num >= 100) && (num < 1000)) {
            System.out.print("La primera cifra es " + num/100);
          }
        if ((num >= 1000) && (num < 10000)) {
            System.out.print("La primera cifra es " + num/1000);
          }
        if (num >= 10000) {
            System.out.print("La primera cifra es " + num/10000);
          }
      }
    
  }
}
