/**
 * Lectura de datos desde teclado
 *
 * 11. Realiza un conversor de Kb a Mb.
 */

public class Ejercicio11{
  public static void main(String[] args) {
    
    int kb;
    String linea;
    
    System.out.println("Vamos a realizar un conversor de Kb  a Mb");
    System.out.print("Introduzca los Kb: ");
    linea = System.console().readLine();
    kb = Integer.parseInt(linea);
    
    double mb;
    mb = kb / 1024;
    System.out.printf(" %d Kb son %.2f Mb", kb, mb);
  }
}
