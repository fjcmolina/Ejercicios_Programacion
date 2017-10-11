/**
 * Lectura de datos desde teclado
 *
 * 3. Realiza un conversor de pesetas a euros. La cantidad de pesetas que se quiere
 *    convertir debe ser introducida por teclado.
 */

public class Ejercicio3{
  public static void main(String[] args) {
    
    int num;
    String linea;
    
    System.out.println("Vamos a realizar una conversor de pesetas a euros");
    System.out.print ("Introduce la cantidad en pesetas:  ");
    linea = System.console().readLine();
    num = Integer.parseInt(linea);

    
    double resultado;
    resultado = num / 166.386;
    
    System.out.printf("%d pesetas son %.2f euros", num, resultado);
  }
}
