/**
 * Sentencia Condicional
 *
 * 1. Escribe un programa que pida por teclado un dia de la semana y que diga
 *    que asignatura toca a primera hora ese dia.
 */

public class Ejercicio1{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que introduces el" 
    + " dia de la semana y sabemos la primera asignatura del dia");
    System.out.print("Introduce el dia de la semana: ");
    String dia = System.console().readLine();
    
    if (dia.equals("Lunes")) {
      System.out.print("Sistemas Informaticos");
      }
    
    if (dia.equals("Martes")) {
      System.out.print("Programacion");
      }
      
    if (dia.equals("Miercoles")) {
    System.out.print("Sistemas Informaticos");
      }
      
    if (dia.equals("Jueves")) {
    System.out.print("Programacion");
      }
    if (dia.equals("Viernes")) {
      System.out.print("Programacion");
      }
    else {
      System.out.print("En este dia no tienes clases");
      }
  }
}
