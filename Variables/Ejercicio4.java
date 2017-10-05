/**
 * Variables
 *
 * 4. Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
 *    convertir deberá estar almacenada en una varible.
 */

public class Ejercicio4{
  public static void main(String[] args) {
    
    double euros = 20;
    int pesetas = (int)(euros * 166.386);
    
    System.out.print("20 euros son "+ pesetas + " pesetas");
  }
}
