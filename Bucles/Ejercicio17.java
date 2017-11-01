/**
 * Bucles
 *
 * 17. Realiza un programa que sume los 100 números siguientes a un número entero
 *     y positivo introducido por teclado. Se debe comprobar que el dato introducido
 *     es correcto (que es un número positivo).
 */ 
 
 public class Ejercicio17{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que suma los 100 números siguientes del numero introducido");
    System.out.println("Introduce un numero");
    int numero = Integer.parseInt(System.console().readLine());
    
    if(numero < 0){
      System.out.println("Lo siento, debe introducir un nuemero positivo");
      }else{
        int suma = 0;
        for(int i = 0; i < numero+100;i++){
          suma += i;
          }
        System.out.println("La suma es " + suma);
        }
      
    
      
  }
}
