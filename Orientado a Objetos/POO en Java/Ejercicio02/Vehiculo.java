/*
 * Clase Vehiculo
 */
package ejercicio02;

/**
 *
 * @author Francis
 */
public class Vehiculo {

  //atributos de clase
  private static int kilometrosTotales = 0;
  private static int vehiculosCreados = 0;

  //atributo de instantcia
  private int kilometrosRecorridos;

  public Vehiculo() {
    this.kilometrosRecorridos = 0;
  }

  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }

  public void recorre(int kilometros){
    this.kilometrosRecorridos += kilometros;
    Vehiculo.kilometrosTotales += kilometros;
  }
}
