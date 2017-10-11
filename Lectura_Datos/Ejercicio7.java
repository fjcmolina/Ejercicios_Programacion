/**
 * Lectura de datos desde teclado
 *
 * 7. Escribe un programa que calcule el total de una factura a partir de la base
 *    imponible.
 */

public class Ejercicio7{
  public static void main(String[] args) {
    
    double baseImponible;
    String linea;
    
    System.out.println("Vamos a calcular una factura");
    System.out.print("Introduce el precio del articulo sin IVA :");
    linea = System.console().readLine();
    baseImponible = Double.parseDouble(linea);
    
    System.out.printf("Base Imponible : %.2f \n", baseImponible);
    System.out.printf("IVA : %.2f \n", (baseImponible * 0.21));
    System.out.printf("*********\n");
    System.out.printf("Total :  %.2f", (baseImponible * 1.21));
  }
}
