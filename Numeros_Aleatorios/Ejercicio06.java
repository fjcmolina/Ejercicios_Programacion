/**
 * Numeros Aleatorios
 *
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. El usuario
 *    debe adivinarlo y tiene para ello 5 oportunidades. Después de cada intento
 *    fallido, el programa dirá cuántas oportunidades quedan y si el número introducido
 *    es menor o mayor que el número secreto.
 */ 
 
 public class Ejercicio06{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa para que adivines un numero aleatorio");
    
    int numero = (int)(Math.random()*100) + 1;
    int oportunidades = 5;
    boolean acertado = false;
    
    do{
      System.out.print("Introduce un numero: ");
      int numeroIntroducido = Integer.parseInt(System.console().readLine());
      oportunidades--;
      
      if((numeroIntroducido < numero) && (oportunidades > 0)){
        System.out.println("El numero que intentas adivinar es mayor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " intentos");
        }
      if((numeroIntroducido > numero) && (oportunidades > 0)){
        System.out.println("El numero que intentas adivinar es menor que " + numeroIntroducido);
        System.out.println("Te quedan " + oportunidades + " intentos");
        }
      if((numeroIntroducido == numero) && (oportunidades > 0)){
        acertado =  true;
        System.out.print("Has acertado el numero");
        }
      }while((oportunidades > 0) && (!acertado));
    
    if(!acertado){
      System.out.println("No has acertado el numero aleatorio");
      System.out.print("El numero que intentabas adivinar era: " + numero);
      }
  }
}
