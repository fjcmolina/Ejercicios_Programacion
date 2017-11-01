/**
 * Bucles
 *
 * 16. Escribe un programa que diga si un número introducido por teclado es o no
 *     primo. Un número primo es aquel que sólo es divisible entre él mismo y la
 *     unidad.
 */ 
 
 public class Ejercicio16{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que nos dice si el numero introducido es primo");
    
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    
    boolean primo = true;
    
    for( int i = 2; i < numero;i++){
      if(numero % i == 0){
        primo = false;
        }
      }
      
    if(primo){
      System.out.println("El numero introducido es primo");
      }else{
        System.out.println("El numero introducido no es primo");
        }
  
    
  }
}
