/**
 * Bucles
 *
 * 9. Realiza un programa que nos diga cuantos digitos tiene un numero
 *    introducido por teclado.
 */ 
 
 public class Ejercicio9{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que cuantos digitos tiene el numero");
    System.out.print("Introduce un numero : ");
    
    int num = Integer.parseInt(System.console().readLine());
    int contador = 1;
    
    while (num > 10){
      num /= 10;
      contador++;
    }
    
    System.out.printf("El numero introducido tiene tiene %d digitos",contador);
  }
}
