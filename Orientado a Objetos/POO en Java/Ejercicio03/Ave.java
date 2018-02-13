/*
 * Clase Ave
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Ave extends Animal {
  
  public Ave() {
    super(Sexo.HEMBRA);
  }
  
  public Ave(Sexo s) {
    super(s);
  }
  
  public void huevo() {
    if (this.getSexo() == Sexo.MACHO) {
      System.out.println("No puedo poner huevos, soy macho");
    } else {
      System.out.print("Ahi llevas un huevoo");
    }
  }
  
  public void vuela() {
    System.out.println("Estoy volando");
  }
  
  public void limpiate() {
    System.out.println("Me estoy limpiando las plumas");
  }
}
