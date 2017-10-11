/**
 * Lectura de datos desde teclado
 *
 * 6. Escribe un programa que calcule el área de un triángulo.
 */

public class Ejercicio6{
  public static void main(String[] args) {
    
    int base;
    int altura;
    String linea;
    
    System.out.println("Vamos a calcular el area de un triángulo ");
    System.out.print ("Introduce la base del triángulo: ");
    linea = System.console().readLine();
    base = Integer.parseInt(linea);
    
    System.out.print ("Introduce el la altura del triángulo: ");
    linea = System.console().readLine();
    altura = Integer.parseInt(linea);
    
    int area;
    area = (base * altura)/ 2;
    System.out.print("El área del triángulo con los datos introducidos es "+ area);
  }
}
