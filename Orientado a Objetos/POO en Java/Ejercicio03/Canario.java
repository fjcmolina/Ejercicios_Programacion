/*
 * Clase Canario
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Canario extends Ave {

  public Canario() {

  }

  public Canario(Sexo s) {
    super(s);
  }

  public void vuela() {
    System.out.println("Volando voy!!! Volando Vengo, vengo!!");
  }

  public void canta() {
    System.out.println("Tralarararaaa !!");
  }

  public void pia() {
    System.out.println("Pio pio pioo");
  }

}
