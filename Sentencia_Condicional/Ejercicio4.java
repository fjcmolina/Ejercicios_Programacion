/**
 * Sentencia Condicional
 *
 * 4. Vamos a ampliar uno de los ejercicios de la relacion anterior para considerar
 *    las horas extras. Escribe un programa que calcule el salario semanal de un
 *    teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo)
 *    se pagan a 12 euros la hora. A partir de 41, se pagan a 16 euros la hora.
 */

public class Ejercicio4{
  public static void main(String[] args) {
   
    System.out.println("Vamos a calcular el salario semanal de un trabajador");
    System.out.print("Introduzca las horas trabajadas durante la semana:");
    
    double horas = Double.parseDouble(System.console().readLine());
    String linea =  System.console().readLine();
    double salario = 12 * horas;
    
    if (horas > 40){
      double horasExtra = (horas - 40);
      System.out.println("El sueldo de la semana es  " + (salario + (horasExtra * 16)) + " euros");
    }
    if (horas <= 40){
      System.out.printf("El sueldo semana es de %.2f euros",salario);
    }
  }
}
