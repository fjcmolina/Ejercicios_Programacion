/**
 * Bucles
 *
 * 22. Muestra por pantalla todos los números primos entre 2 y 100, ambos incluidos
 */ 
 
 public class Ejercicio22{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que nos los numeros primos entre 2 y 100");
    
    boolean primo = true;
    int numero;
    
    for(numero = 2; numero <= 100;numero++){
      primo =true;
      for(int i = 2; i < numero; i++){
        if(numero % i == 0){
          primo = false;
          }
      }
      if(primo){
        System.out.println(numero + " es un numero primo");
        }
    }
  }
}
