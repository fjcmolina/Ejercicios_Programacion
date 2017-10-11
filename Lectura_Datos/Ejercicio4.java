/**
 * Lectura de datos desde teclado
 *
 * 4. Escribe un programa que sume, reste, multiplique y divida dos números
 *    introducidos por teclado.
 */

public class Ejercicio4{
  public static void main(String[] args) {
    
    int num1;
    int num2;
    String linea;
    
    System.out.println("Vamos a realizar una calculadora que suma, resta, multiplica y divide ");
    System.out.print ("Introduce el primer numero: ");
    linea = System.console().readLine();
    num1 = Integer.parseInt(linea);
    
    System.out.print ("Introduce el segundo numero: ");
    linea = System.console().readLine();
    num2 = Integer.parseInt(linea);
    
    int suma;
    suma = num1 + num2;
    System.out.println("El resultado de la suma es "+ suma);
    
    int resta;
    resta = num1 - num2;
    System.out.println("El resultado de la resta es "+ resta);
    
    int producto;
    producto = num1 * num2;
    System.out.println("El resultado de la multiplicación es "+ producto);
    
    int division;
    division = num1 / num2;
    System.out.println("El resultado de la división es "+ division);
  }
}
