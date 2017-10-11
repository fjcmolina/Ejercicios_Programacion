/**
 * Lectura de datos desde teclado
 *
 * 10. Realiza un conversor de Mb a Kb.
 */

public class Ejercicio10{
  public static void main(String[] args) {
    
    int mb;
    String linea;
    
    System.out.println("Vamos a realizar un conversor de Mb  a Kb");
    System.out.print("Introduzca los Mb: ");
    linea = System.console().readLine();
    mb = Integer.parseInt(linea);
    
    int kb;
    kb = mb * 1024;
    System.out.printf(" %d Mb son %d Kb", mb, kb);
  }
}
