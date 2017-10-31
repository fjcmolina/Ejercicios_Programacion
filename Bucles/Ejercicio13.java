/**
 * Bucles
 *
 * 13. Escribe un programa que lea una lista de diez números y determine cuántos
 *     son positivos, y cuántos son negativos.
 */ 
 
 public class Ejercicio13{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que dice si es positivo o negativo el numero");
    System.out.println("Introduce 10 numeros enteros");
    
    int negativo = 0;
    int positivo = 0;
    
    
    for (int i = 0; i < 10; i++){

      if (Integer.parseInt(System.console().readLine()) < 0){
        negativo++;
      }else{
        positivo++;
      }
   
    }
    System.out.println("Ha introducido " + positivo + " numeros positivos y " + negativo + " negativos");
    
  }
}
