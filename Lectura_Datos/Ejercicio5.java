/**
 * Lectura de datos desde teclado
 *
 * 5. Escribe un programa que calcule el área de un rectángulo.
 */

public class Ejercicio5{
  public static void main(String[] args) {
    
    int base;
    int altura;
    String linea;
    
    System.out.println("Vamos a calcular el area de un rectángulo ");
    System.out.print ("Introduce la base del rectángulo: ");
    linea = System.console().readLine();
    base = Integer.parseInt(linea);
    
    System.out.print ("Introduce el la altura del rectángulo: ");
    linea = System.console().readLine();
    altura = Integer.parseInt(linea);
    
    int area;
    area = (base * altura);
    System.out.print("El área del rectángulo con los datos introducidos es "+ area);
  }
}
