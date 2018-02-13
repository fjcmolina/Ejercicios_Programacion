/*
 * Clase Perro
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Perro extends Mamifero {

  public Perro() {

  }

  public Perro(Sexo s) {
    super(s);
  }

  public void ladra() {
    System.out.println("Guau Guau Guau!!");
  }

  public void corre() {
    System.out.println("Estoy corriendo");
  }

  public void patita() {
    System.out.print("Toma la patita");
  }
}
