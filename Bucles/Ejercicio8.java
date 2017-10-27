/**
 * Bucles
 *
 * 8. Muestra la tabla de multiplicar de un numero introducido por teclado
 */ 
 
 public class Ejercicio8{
  public static void main(String[] args) {
    
    System.out.println("Vamos a mostrar la tabla de multiplicar del numero introducido");
    
    System.out.println("Introduce el numero para realizar su tabla de multiplicar");
    int num = Integer.parseInt(System.console().readLine());
    
    for( int i = 0; i <= 10; i++){
      System.out.println(num + " x " + i + " = " + num * i);
      }
  
    }
  }
