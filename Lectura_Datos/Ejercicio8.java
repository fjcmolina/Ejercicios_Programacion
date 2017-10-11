/**
 * Lectura de datos desde teclado
 *
 * 8. Escribe un programa que calcule el salario semanal de un empleado en base
 *    a las horas trabajadas, a razón de 12 euros la hora.
 */

public class Ejercicio8{
  public static void main(String[] args) {
    
    int horas;
    String linea;
    
    System.out.println("Vamos a calcular el salario semanal de un trabajador");
    System.out.print("Introduzca las horas trabajadas durante la semana: ");
    linea = System.console().readLine();
    horas = Integer.parseInt(linea);
    
    int salario;
    salario = 12 * horas;
    System.out.printf("El salario del trabajador por %d horas sera de %d euros a la semana", horas, salario);
  }
}
