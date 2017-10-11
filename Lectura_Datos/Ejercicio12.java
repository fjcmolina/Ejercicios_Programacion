/**
 * Lectura de datos desde teclado
 *
 * 12. Realiza un programa que calcule la nota que hace falta sacar en el segundo
 *     examen de la asignatura Programación para obtener la media deseada. Hay
 *     que tener en cuenta que la nota del primer examen cuenta el 40% y la del
 *     segundo examen un 60%.
 */

public class Ejercicio12{
  public static void main(String[] args) {
    
    double nota1;
    double notaFinal;
    String linea;
    
    System.out.println("Vamos a calcular la nota que necesitas en el segundo examen para la nota deseada");
    System.out.print("Introduzca la nota de tu primer examen: ");
    linea = System.console().readLine();
    nota1 = Double.parseDouble(linea);
    
    System.out.print("Introduza la nota final que deseas: ");
    linea = System.console().readLine();
    notaFinal = Double.parseDouble(linea);
    
    
    double nota2;
    nota2 = ((notaFinal * 100) - (nota1 * 40)) / 60;
    System.out.printf("La nota que necesitas es %.2f",nota2);
    
  }
}
