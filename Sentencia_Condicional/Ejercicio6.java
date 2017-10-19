/**
 * Sentencia Condicional
 *
 * 6. Realiza un programa que calcule el tiempo que tardara en caer un objeto
 *    desde una altura h. Aplica la formula t = √(2*h/g) siendo g = 9.81 m/(s*s)
 */

public class Ejercicio6{
  public static void main(String[] args) {
    
    String linea;
    System.out.println("Vamos a calcular el tiempo que tarda en caer un objeto");
    
    double h;
    final double g = 9.81;
    
    System.out.print("Introduce desde que altura va a caer el objeto: ");
    linea = System.console().readLine();
    h =Double.parseDouble( linea );
    double t = Math.sqrt((2*h)/g);
    
    if (h <= 0){
      System.out.print("La altura debe ser mayor que 0");
    }else{
      System.out.printf("El tiempo que tardara es %.2f segundos",t);
    }
    
  }
}
