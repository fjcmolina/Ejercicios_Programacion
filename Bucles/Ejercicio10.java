/**
 * Bucles
 *
 * 10. Escribe un programa que calcule la media de un conjunto de números positivos
 *     introducidos por teclado. A priori, el programa no sabe cuántos números se
 *     introducirán. El usuario indicará que ha terminado de introducir los datos
 *     cuando meta un número negativo.
 */ 
 
 public class Ejercicio10{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcula una media");
    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");

    double numero = 0;
    double contador = 0;
    double suma = 0;
    
    do{
      
      numero = Double.parseDouble(System.console().readLine());
      contador++;
      suma += numero;
   
      
    }while (numero >= 0);
    
    double media = (suma - numero)/ (contador - 1);
    System.out.printf("La media de los números introducidos es %.2f",media );

      
  }
}
