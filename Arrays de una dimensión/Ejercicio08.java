/*
 *  Arrays de una dimensión
 *  
 * 8. Realiza un programa que pida la temperatura media que ha hecho en cada mes
 *    de un determinado año y que muestre a continuación un diagrama de barras
 *    horizontales con esos datos. Las barras del diagrama se pueden dibujar a base
 *    de asteriscos o cualquier otro carácter.
 */
package ejercicio08;

/**
 * @author Francis
 */
import java.util.Scanner;

public class Ejercicio08 {
  public static void main(String[] args) {
    
    String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
     "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"} ; // Valores del array mes
    
    double temperatura[] = new double[12];
    Scanner s = new Scanner(System.in);
    
    //Pedimos la temperatura media del mes
    for(int i = 0; i < 12; i++){
      System.out.println("Introduce la temperatura media de " + mes[i] + " :");
      temperatura[i] = s.nextInt(); 
    }
    
    //Mostar valores de la temperatura
    for (int i = 0; i < 12; i++) {
      System.out.printf("%12s │", mes[i]);
      for (int j = 0; j < temperatura[i]; j++) {
        System.out.print("▄");
      }
      System.out.println(" " + temperatura[i] + "ºC" );
    }
  }
}