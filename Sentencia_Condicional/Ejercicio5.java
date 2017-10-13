/**
 * Sentencia Condicional
 *
 * 5. Realiza un programa que resuelva una ecuacion de primer grado ( del tipo
 *    ax + b =0).
 */

public class Ejercicio5{
  public static void main(String[] args) {
    
    String linea;
    System.out.println("Vamos a calcular una ecuacion de primer grado");
    
    double a;
    double b;
    
    System.out.print("Introduce el valor de a: ");
    linea = System.console().readLine();
    a =Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de b: ");
    linea = System.console().readLine();
    b = Double.parseDouble( linea );
    
    double x = (-b)/a;
    System.out.printf("El resultado de la ecuacion es x=%.2f",x);
  
    
  }
}
