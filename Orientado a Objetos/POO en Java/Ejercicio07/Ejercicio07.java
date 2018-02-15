/*
 * 7. Queremos gestionar la venta de entradas (no numeradas) de Expocoches
 *    Campanillas que tiene 3 zonas, la sala principal con 1000 entradas disponibles,
 *    la zona de compra-venta con 200 entradas disponibles y la zona vip
 *    con 25 entradas disponibles. Hay que controlar que existen entradas antes de
 *    venderlas.
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio07 {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);

    int opcion = 0;

    while (opcion != 3) {
      System.out.println("1. Mostar numero de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.println();
      System.out.println("Elige una de las anteriores opciones");
      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.println(principal.getEntradasPorVender());
          break;
        case 2:
          System.out.println();
          break;
        default:
      }
    }
  }

}
