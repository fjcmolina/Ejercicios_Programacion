/**
 * Numeros Aleatorios
 *
 * 5. Muestra 50 números enteros aleatorios entre 100 y 199 (ambos incluidos)
 *    separados por espacios. Muestra también el máximo, el mínimo y la media
 *    de esos números.
 */ 
 
 public class Ejercicio05{
  public static void main(String[] args) {
    
    int numero = 0;
    int maximo = 100;
    int minimo = 199;
    int suma = 0;
    
    for(int i = 0; i < 50; i++) {
      numero = ((int)(Math.random() * 100) +100);
      System.out.print(numero + " ");
      suma += numero;
      
      if(numero < minimo){
        minimo = numero;
        }
      if(numero > maximo){
        maximo = numero;
        }
    }
    int media = suma / 50;
    System.out.print("\nMinimo: " +  minimo);
    System.out.print("\nMaximo: " +  maximo);
    System.out.print("\nLa media de esos numeros es: " + media);
  }
}
