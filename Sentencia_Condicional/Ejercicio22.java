/**
 * Sentencia Condicional
 *
 * 22. Realiza un programa que, dado un dia de la semana (de lunes a viernes) y
 *     una hora (horas y minutos), calcule cuantos minutos faltan para el fin
 *     de semana. Se considera que el fin de semana comienza el viernes a las
 *     15:00h. Se da por hecho que el usuario introducira un dia y hora correctos
 *     anterior al viernes a las 15:00h.
 */

public class Ejercicio22{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que introduces una dia " +
    "y una hora para averiguar cuanto queda para el fin de semana");
    
    System.out.print("Introduzca un dia de la semana (Lunes a Viernes): ");
    String semana = System.console().readLine();
    
    int dia = 0;

    switch(semana) {
      case "lunes":
        dia = 0;
        break;
      case "martes":
        dia = 1;
        break;
      case "miércoles":
      case "miercoles":
        dia = 2;
        break;
      case "jueves":
        dia = 3;
        break;
      case "viernes":
        dia = 4;
        break;
      default:
        System.out.print("El día introducido no existe");
    }
    
    System.out.println("Ahora vamos a introducir la hora del dia elegido");
    System.out.print("Introduce una hora: ");
    int hora = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los minutos: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int minutosFinSemana = (4 * 24 * 60) + (15 * 60);
    int minutosActual = (dia * 24 * 60) + (hora * 60) +minutos;
    int resultado = (minutosFinSemana - minutosActual);
    
    System.out.printf("Faltan %d minutos hasta el finde de semana", resultado);
  }
}
