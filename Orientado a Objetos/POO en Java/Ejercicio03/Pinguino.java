/*
 * Clase Pinguino
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Pinguino extends Ave {

  public Pinguino() {

  }

  public Pinguino(Sexo s) {
    super(s);
  }

  public void vuela() {
    System.out.println("Soy un pinguino, no puedo volar");
  }

  public void nada() {
    System.out.println("Al agua pato!!! A nadar");
  }
}
