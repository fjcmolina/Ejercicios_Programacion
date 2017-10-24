/**
 * Sentencia Condicional
 *
 * 17. Escribe un programa que diga cual es la ultima cifra de un numero entero
 *     introducido por teclado.
 */
public class Ejercicio17{
  public static void main(String[] args) {
    
    System.out.println("Vamos a decirte la ultima cifra del numero introducido");
    
    System.out.print("Introduce un numero ");
    int num = Integer.parseInt(System.console().readLine());
    System.out.println("La última cifra del número introducido es el " + (num % 10));
  }
}
