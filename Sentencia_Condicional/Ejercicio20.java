/**
 * Sentencia Condicional
 *
 * 20. Realiza un programa que diga si un numero entero positivo introducido
 *     por teclado es capicua. Se permiten numeros de hasta 5 cifras.
 */

public class Ejercicio20{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que nos dice si el numero es capicuo");
    System.out.print("Introduce un numero de cinco cifras : ");
    
    int num = Integer.parseInt(System.console().readLine());
    
    if (num >= 100000){
        System.out.print("El numero introducido tiene mas de 5 digitos");
      }else{
        if (num < 10) {
          System.out.print("El numero es capicuo"); //una cifra
          }
        if ((num >= 10) && (num < 100)) {
          if ((num / 10) == (num % 10)){
            System.out.print("El numero es capicuo"); //dos cifras
            }
          }
        if ((num >= 100) && (num < 1000)) {
          if((num / 100) == (num%10)){
            System.out.print("El numero es capicuo"); // tres cifras
            }
          }
        if ((num >= 1000) && (num < 10000)) {
          if(((num / 1000) == (num % 10)) && (((num / 100 ) % 10)== (( num / 10) % 10))){
            System.out.print("El numero es capicuo"); // cuatro cifras
            }
          }
        if (num >= 10000) {
          if(((num / 1000) == (num % 10)) && (((num / 100 ) % 10)== (( num / 10) % 10))){
            System.out.print("El numero es capicuo"); // cinco cifras
            }
          }
        }
  }
}
