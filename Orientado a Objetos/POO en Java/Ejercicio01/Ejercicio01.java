/*
 * 1. Implementa la clase Caballo vista en un ejercicio anterior. Pruébala creando
 *    instancias y aplicándole algunos métodos.
 */
package ejercicio01;

/**
 *
 * @author Francis
 */
public class Ejercicio01 {
  public static void main(String[] args) {
    
    Caballo rocinante = new Caballo("Rocinante");
    Persona pepe = new Persona("Pepe", "Pérez");
    
    rocinante.setRaza("flaco");
    rocinante.setColor("blanco");
    rocinante.setJinete(pepe);
    
    System.out.println(pepe);
    
    pepe.espolea("cariñosa");
    
    System.out.println(rocinante);
  }
  
}
