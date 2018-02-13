/*
 * Clase lagarto
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Lagarto extends Animal {

  public Lagarto() {

  }

  public Lagarto(Sexo s) {
    super(s);
  }

  public void sol() {
    System.out.println("Estoy tomando el solecito");
  }

  public void escondete() {
    System.out.println("Estoy escondido, ahora no me puedes ver!!");
  }
}
