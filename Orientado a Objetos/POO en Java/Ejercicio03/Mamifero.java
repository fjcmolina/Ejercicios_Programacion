/*
 * Clase Mamifero
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Mamifero extends Animal {

  public Mamifero() {
    super();
  }

  public Mamifero(Sexo s) {
    super(s);
  }

  public void amamanta() {
    if(this.getSexo() == Sexo.MACHO){
      System.out.println("No puedo amamantar, soy macho");
    }else{
      System.out.println("Toma el pechoo");
    }
  }

  public void crias() {
    System.out.println("Estoy cuidando a mis crias");
  }

  public void anda() {
    System.out.println("Me estoy dando un paseo andando");
  }
}
