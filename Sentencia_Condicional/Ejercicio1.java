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
    String dia = System.console().readLine().toLowerCase();
    
    String hora;
    
    switch (dia) {
      case "lunes":
        hora = "Sistemas";
        break;
      case "martes":
        hora = "Programación";
        break;
      case "miércoles":
      case "miercoles":
        hora = "Sistemas";
        break;
      case "jueves":
        hora = "Programación";
        break;
      case "viernes":
        hora = "Programación";
        break;
      case "sábado":
      case "sabado":
        hora = "No hay clase";
        break;
      case "domingo":
        hora = "No hay clase";
        break;

      default:
        hora = "No existe ese día";
    }

    System.out.println("Día " + dia + ": " + hora);
  }

  }
