/*
 *  Clase Gato
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Gato extends Mamifero {

  public Gato() {

  }

  public Gato(Sexo s) {
    super(s);
  }

  public void come(String comida) {
    if (comida.equals("pescado")) {
      System.out.println("Hmmm pescado, que rico");
    } else {
      System.out.print("No me gusta otra cosa que no sea pescado");
    }
  }

  public void peleaCon(Gato contrincante) {
    if (contrincante.getSexo() == Sexo.HEMBRA) {
      System.out.println("No peleo contra gatitas");
    } else {
      System.out.println("Ven aquí que te vas a enterar");
    }
  }

  public void maulla() {
    System.out.println("Miau miau miau");
  }

  public void lame() {
    System.out.println("Me estoy lamiendo para limpiarme");
  }
}
