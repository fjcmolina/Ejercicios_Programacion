/**
 * Sentencia Condicional
 *
 * 8. Amplia el programa anterior para que diga que la nota del boletin 
 *    (insuficiente, suficiente, bien notable o sobresaliente):
 *    
 */

public class Ejercicio8{
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
    System.out.printf("La media de sus notas es %.2f\n",media);
    
    if (media < 5){
      System.out.print("Tienes un Insuficiente");
    }else if (media < 6){
      System.out.print("Tienes un Suficiente");
    }else if (media < 8){
      System.out.print("Tienes un Bien");
    }else if (media < 9){
      System.out.print("Tienes un Notable");
    }else{
      System.out.print("Tienes un Sobresaliente");
    }
  }
}
