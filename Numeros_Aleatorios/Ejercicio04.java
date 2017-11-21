/**
 * Numeros Aleatorios
 *
 * 4. Muestra 20 números enteros aleatorios entre 0 y 10 (ambos incluidos) separados
 *    por espacios
 */ 
 
 public class Ejercicio04{
  public static void main(String[] args) {
    
    int numero = 0;
    
    for(int i = 0; i < 20; i++) {
      numero = (int)(Math.random() * 11);
      System.out.print(numero + " ");
    }
  }
}
