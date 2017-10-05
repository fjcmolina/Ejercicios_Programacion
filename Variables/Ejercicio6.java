/**
 * Variables
 *
 * 6. Escribe un programa que calcule el total de una factura a partir de la
 *    base imponible (precio sin IVA). La base imponible estará almacenada
 *    en una variable.
 */

public class Ejercicio6{
  public static void main(String[] args) {
    
    double baseImponible = 13.27;
    
    System.out.printf("Base Imponible : %.2f \n", baseImponible);
    System.out.printf("IVA : %.2f \n", (baseImponible * 0.21));
    System.out.printf("*********\n");
    System.out.printf("Total :  %.2f", (baseImponible * 1.21));
  }
}
