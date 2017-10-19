/**
 * Sentencia Condicional
 *
 * 13. Escribe un programa que ordene tres numeros enteros introducidos por teclado.
 */

public class Ejercicio13{
  public static void main(String[] args) {
    
    int aux;
        
    System.out.println("Este programa ordena tres números ");
    System.out.println("Introduce el primer numero:");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero:");
    int b = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el tercer numero:");
    int c = Integer.parseInt(System.console().readLine());
    
    if (a > b) {
      aux = a;
      a = b;
      b = aux;
    }else if (b > c) {
      aux = b;
      b = c;
      c = aux;
    }else if (a > c) {
      aux = a;
      a = b;
      c = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor a mayor son " + a + ", " + b + " y " + c ); 
  }
}

