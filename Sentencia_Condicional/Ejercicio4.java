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
    
    int horas = Integer.parseInt(System.console().readLine());
    String linea =  System.console().readLine();
    int salario = 12 * horas;
    
    if (horas <= 40){
      System.out.printf("El salario del trabajador por %d horas sera de %d euros a la semana", horas, salario);
    }
    
    else{
      salario = salario + ((horas - 40) *16);
      System.out.printf("El salario del trabajador por %d horas sera de %d euros a la semana", horas, salario);
    }
  }
}
