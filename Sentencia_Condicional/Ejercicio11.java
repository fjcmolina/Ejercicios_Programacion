/**
 * Sentencia Condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos),
 *     calcule los segundos que faltan para llegar a medinoche.
 */

public class Ejercicio11{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que introduces una hora y calcula lo que falta para media noche");
    System.out.print("Introduce una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int segundosTranscurridos = (hora * 3600) + (minutos * 60);
    int segundosMediaNoche = (24 * 3600) - segundosTranscurridos;
    
    System.out.printf("Faltan %d segundos hasta media noche", segundosMediaNoche);
    
  }
}
