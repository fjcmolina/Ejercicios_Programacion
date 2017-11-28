/**
 * Numeros Aleatorios
 *
 * 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
 *     aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
 *     final aparecerá el número de suspensos, el número de suficientes, el número
 *     de bienes, etc.
 */ 
 
 public class Ejercicio11{
  public static void main(String[] args) {
    
    System.out.print("Vamos a realizar un programa que muestra 20 notas generadas al azar");
    
    int contadorSuspenso = 0;
    int contadorSuficiente = 0;
    int contadorBien = 0;
    int contadorNotable = 0;
    int contadorSobresaliente = 0;
    
    for(int i = 0; i < 20; i++){
      int numero = (int)(Math.random() * 5);
      
      
      switch(numero){
        
        case 0:
          System.out.print("Suspenso");
          contadorSuspenso++;
          break;
        case 1:
          System.out.print("Suficiente");
          contadorBien++;
          break;
        case 2:
          System.out.print("Bien");
          contadorBien++;
          break;
        case 3:
          System.out.print("Notable");
          contadorNotable++;
          break;
        case 4:
          System.out.print("Sobresaliente");
          contadorSobresaliente++;
          break;
        }
      
      System.out.println();
    }
    System.out.println("\nNumero de suspensos: " + contadorSuspenso);
    System.out.println("Numero de suficientes: " + contadorSuficiente);
    System.out.println("Numero de bienes: " + contadorBien);
    System.out.println("Numero de notables: " + contadorNotable);
    System.out.println("Numero de sobresalientes: " + contadorSobresaliente);
  }
}
