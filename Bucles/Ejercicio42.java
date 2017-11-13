/**
 * Bucles
 *
 * 42. Escribe un programa que pida un número entero positivo por teclado y que
 *     muestre a continuación los 5 números consecutivos a partir del número
 *     introducido. Al lado de cada número se debe indicar si se trata de un primo o
 *     no.
 */ 
 
 public class Ejercicio42{
  public static void main(String[] args) {
    System.out.println("Vamos a realizar un programa que nos muestra los 5 siguientes numero diciendo si son primos");
    System.out.println("Introduce un numero");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    boolean primo = true;
  
      for(int numero =  numeroIntroducido ; numero < (numeroIntroducido + 5); numero++){
        primo =true;
        for(int i = 2; i < numero; i++){
          if(numero % i == 0){
            primo = false;
            }
      }
      
      if(primo){
        System.out.println(numero + " es un numero primo");
        }else{
          System.out.println(numero + " no es un numero primo");
          }
    }
  }
}
