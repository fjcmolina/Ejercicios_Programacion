/**
 * Sentencia Condicional
 *
 * 2. Realiza un programa que pida una hora por teclado y que muestre luego
 *    buenos dias, buenas tardes o buenas noches segun la hora. Se utilizaran
 *    los tramos de 6 a 12, de 13 a 20 y de 21 a 5, respectivamente. Solo se
 *    se tienen en cuenta las horas, los minutos no se deben introducir por teclado.
 */

public class Ejercicio2{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que introduces una hora y muestra un mensaje");
    System.out.print("Introduce una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    if ((hora >= 6) && (hora <= 12)){
      System.out.print("Buenos dias");
      }
    if ((hora >= 13) && (hora <= 20)) {
      System.out.print("Buenas tardes");
      }
    if (((hora >= 21) && (hora <= 0)) || ((hora >= 0) && (hora <=5))) {
      System.out.print("Buenas noches");
      }
    if ((hora >= 24) || (hora < 0)){
      System.out.print("No existe esta hora");
    }
    
  }
}
