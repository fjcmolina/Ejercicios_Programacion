/**
 * Sentencia Condicional
 *
 * 7. Realiza un programa que calcule la media de tres notas.
 */

public class Ejercicio7{
  public static void main(String[] args) {
    
    String linea;
    System.out.println("Vamos a calcular la media de tus notas");
    
    double nota1;
    double nota2;
    double nota3;
    
    System.out.print("Introduce la primera nota: ");
    linea = System.console().readLine();
    nota1 =Double.parseDouble( linea );
    
    System.out.print("Introduce la primera nota: ");
    linea = System.console().readLine();
    nota2 = Double.parseDouble( linea );
    
    System.out.print("Introduce la primera nota: ");
    linea = System.console().readLine();
    nota3 = Double.parseDouble( linea );
    
    double media = (nota1 + nota2 + nota3)/3;
    System.out.printf("La media de sus notas es %.2f",media);
    
  
    
  }
}
