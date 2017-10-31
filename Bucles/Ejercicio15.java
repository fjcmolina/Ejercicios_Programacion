/**
 * Bucles
 *
 * 15. Escribe un programa que dados dos números, uno real (base) y un entero
 *     positivo (exponente), saque por pantalla todas las potencias con base el
 *     numero dado y exponentes entre uno y el exponente introducido. No se deben
 *     utilizar funciones de exponenciación. Por ejemplo, si introducimos el 2 y el 5,
 *     se deberán mostrar 21, 22, 23, 24 y 25
 */ 
 
 public class Ejercicio15{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcule las potencias entre los numeros introducidos ");
    System.out.print("Introduzca ls base de la potencia: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el exponente de la potencia: ");
    int exponenteFinal = Integer.parseInt(System.console().readLine());

    int potencia;
    int exponente;
        
    for (int i = 1; i <= exponenteFinal; i++) {
        
      potencia = 1;
      exponente = i;
      
    for (int j = 0; j < exponente; j++) {
        potencia *= base;
      }
    System.out.println(base + " elevado a " + exponente + " es igual a " + potencia);
    }
  }
}
