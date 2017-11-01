/**
 * Bucles
 *
 * 23. Escribe un programa que permita ir introduciendo una serie indeterminada
 *     de números mientras su suma no supere el valor 10000. Cuando esto último
 *     ocurra, se debe mostrar el total acumulado, el contador de los números
 *     introducidos y la media.
 */ 
 
 public class Ejercicio23{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcula una media mientras la suma no supere 10000");

    int numero = 0;
    int contador = 0;
    int suma = 0;
    
    do{
      
      System.out.println("Introduce un numero");
      numero = Integer.parseInt(System.console().readLine());
      contador++;
      suma += numero;
   
      
    }while (suma <= 10000);
    
    double media = suma/contador;
    System.out.printf("La media de los números introducidos es %.2f\n",media);
    System.out.println("El total de la suma acumulado es : " + suma);
    System.out.println("Se han introducido " + contador + " numeros");
  }
}
