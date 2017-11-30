/**
 * Numeros Aleatorios
 *
 * 24. Escribe un programa que, dado un número introducido por teclado, elija al azar
 *     uno de sus dígitos.
 */
 
 public class Ejercicio24{
  public static void main(String[] args) {
    
    System.out.print("Introduzca un numero: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numero =  numeroIntroducido;
    int longitud = 0;
    do{
      numero /= 10;
      longitud++;
      
    }while(numero > 0);
    
    int digito = (int)(Math.random() * longitud) + 1;
    
    System.out.println((numeroIntroducido / (int)(Math.pow(10, longitud - digito))) % 10);
  }
}
