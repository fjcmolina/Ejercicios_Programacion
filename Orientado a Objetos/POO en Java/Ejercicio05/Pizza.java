/*
 * Classe pizza
 */
package ejercicio05;

/**
 *
 * @author Francis
 */
public class Pizza {

  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  private String tamano;
  private String tipo;
  private String estado;

  public Pizza(String tipo, String tamano) {
    this.tipo = tipo;
    this.tamano = tamano;
    this.estado = "Pedida";
    Pizza.totalPedidas++;
  }

  @Override
  public String toString() {
    return "\nPizza:" + "\nTamaño: " + tamano + "\nTipo: " + tipo + "\nEstado: " + estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }

  public void sirve() {
    if (this.estado.equals("Pedida")) {
      this.estado = "Servida";
      Pizza.totalServidas++;
    } else {
      System.out.println("La pizza ya se ha servido");
    }
  }
}
