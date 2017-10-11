/**
 * Lectura de datos desde teclado
 *
 * 1. Realiza un programa que pida dos números y que luego muestre el resultado
 *    de su multiplicación.
 */

public class Ejercicio1{
  public static void main(String[] args) {
    
    int num1;
    int num2;
    String linea;
    
    System.out.println("Vamos a realizar una multiplicación ");
    System.out.print ("Introduce el primer numero: ");
    linea = System.console().readLine();
    num1 = Integer.parseInt(linea);
    
    System.out.print ("Introduce el segundo numero: ");
    linea = System.console().readLine();
    num2 = Integer.parseInt(linea);
    
    int resultado;
    resultado = num1 * num2;
    System.out.print("El resultado de la multiplicacion es "+ resultado);
  }
}
