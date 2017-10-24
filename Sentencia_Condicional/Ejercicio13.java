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
    int num1 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el segundo numero:");
    int num2 = Integer.parseInt(System.console().readLine());
    System.out.println("Introduce el tercer numero:");
    int num3 = Integer.parseInt(System.console().readLine());
    
    if (num1 > num2) {
      aux = num1;
      num1 = num2;
      num2 = aux;
    }else if (num2 > num3) {
      aux = num2;
      num2 = num3;
      num3 = aux;
    }else if (num1 > num2) {
      aux = num1;
      num1= num2;
      num2 = aux;
    }
        
    System.out.println("Los números introducidos ordenados de menor num1mayor son " + num1+ ", " + num2 + " y " + num3 ); 
  }
}

