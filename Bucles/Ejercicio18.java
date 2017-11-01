/**
 * Bucles
 *
 * 18.  Escribe un programa que obtenga los números enteros comprendidos entre
 *      dos números introducidos por teclado y validados como distintos, el programa
 *      debe empezar por el menor de los enteros introducidos e ir incrementando de
 *      7 en 7.
 */ 
 
 public class Ejercicio18{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que obtenga los números enteros comprendidos entre dos números introducidoos e incrementados en 7");
    
    int num1;
    int num2;
    
    do{
      System.out.println("Introduce un numero");
      num1 = Integer.parseInt(System.console().readLine());
      
      System.out.println("Introduce un numero");
      num2 = Integer.parseInt(System.console().readLine());
      
      if(num1 == num2) {
        System.out.println("El numero introducido no es valido, deben ser distintos.");
      }
    } while (num1 == num2);
    
    if (num1 > num2) {
      int aux = num1;
      num1 = num2;
      num2 = aux;
    }
    for(int i = num1; i <= num2; i += 7) {
      System.out.print(i);
    }
  }
}
