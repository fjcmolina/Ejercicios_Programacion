/**
 * Bucles
 *
 * 25. Realiza un programa que pida un número por teclado y que luego muestre ese
 *     número al revés.
 */ 
 
 public class Ejercicio25{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra un numero al reves");
    System.out.println("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int numeroReves = 0;
    
    while (numero > 0){
      numeroReves= (numeroReves * 10) + (numero % 10);
      numero /= 10;
      }
    System.out.print(numeroReves);
  }
}
