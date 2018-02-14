/*
 * 2. Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 *    la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreadosy
 *    kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 *    también algún método específico para cada una de las subclases. Prueba las
 *    clases creadas mediante un programa con un menú como el que se muestra
 *    a continuación:
 */
package ejercicio02;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio02 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    int opcion = 0;
    int km;

    Bicicleta cube = new Bicicleta();
    Coche fiat = new Coche();

    while (opcion != 8) {
      System.out.println("\nVEHICULOS");
      System.out.println("==========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema ruedas con el coche");
      System.out.println("5. Kilometraje de la bicicleta");
      System.out.println("6. Kilometraje del coche");
      System.out.println("7. Kilometraje total");
      System.out.println("8. Salir");
      System.out.println();
      System.out.println("Elige una de las anteriores opciones");
      opcion = s.nextInt();

      switch (opcion) {
        case 1:
          System.out.println("¿Cuantos kilometros vamos a andar con la bicicleta?");
          km = s.nextInt();
          cube.recorre(km);
          break;
        case 2:
          cube.caballito();
          break;
        case 3:
          System.out.println("¿Cuantos kilometros vamos a recorrer en coche?");
          km = s.nextInt();
          fiat.recorre(km);
          break;
        case 4:
          fiat.quemaRueda();
          break;
        case 5:
          System.out.println("La bicicleta lleva recorridos " + cube.getKilometrosRecorridos() + " km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos " + fiat.getKilometrosRecorridos() + " km");
          break;
        case 7:
          System.out.println("El kilometraje total de los vehiculos es " + Vehiculo.getKilometrosTotales() + " km");
          break;
      }
    }
  }

}
