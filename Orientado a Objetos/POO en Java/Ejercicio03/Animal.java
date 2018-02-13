/*
 *  Clase Animal
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Animal {

  private Sexo sexo;

  public Animal() {
    this.sexo = Sexo.MACHO;
  }

  public Animal(Sexo s) {
    this.sexo = s;
  }

  public Sexo getSexo() {
    return sexo;
  }

  public void duerme() {
    System.out.println("ZzZzZzz");
  }

}
