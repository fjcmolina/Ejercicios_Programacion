/**
 * Lectura de datos desde teclado
 *
 * 2. Realiza un conversor de euros a pesetas. La cantidad de euros que se quiere
 *    convertir debe ser introducida por teclado.
 */
public class Ejercicio2{
  public static void main(String[] args) {
    
    double num;
    String linea;
    
    System.out.println("Vamos a realizar una conversor de euros a pesetas");
    System.out.print ("Introduce la cantidad en euros:  ");
    linea = System.console().readLine();
    num = Integer.parseInt(linea);

    
    int resultado;
    resultado = (int)(num * 166.386);
    
    System.out.printf("%.2f euros son %d pesetas",num,resultado);
  }
}
