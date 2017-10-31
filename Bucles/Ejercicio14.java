/**
 * Bucles
 *
 * 14. Escribe un programa que pida una base y un exponente (entero positivo) y
 *     que calcule la potencia.
 */ 
 
 public class Ejercicio14{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcule potencias");
    
    System.out.println("Introduce la base de la potencia: ");
    int base = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce el exponente de la potencia: ");
    int exponente = Integer.parseInt(System.console().readLine());
    
    int potencia = 1;
    
    if (exponente == 0){
      System.out.println("El resultado de la potencia es 1 ");
      }
      
    if (exponente > 0){
      for(int i = 0; i < exponente; i++){
        potencia = base * potencia;
        }
      }
     System.out.println("El resultado de la potencia es " + potencia);
    
    
   
  }
}
