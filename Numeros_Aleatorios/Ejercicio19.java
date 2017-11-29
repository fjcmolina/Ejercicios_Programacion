/**
 * Numeros Aleatorios
 *
 * 19. Escribe un programa que muestre 50 números enteros aleatorios comprendidos
 *     entre el -100 y el 200 ambos incluidos y separados por espacios. Muestra
 *     luego el máximo de los pares el mínimo de los impares y la media de todos los
 *     números generados.
 */ 
 
 public class Ejercicio19{
  public static void main(String[] args) {
    
    int maximoPar = -100;
    int minimoImpar = 200;
    int suma = 0;
    
    for(int i = 1; i <= 50; i++){
      
      int numero = (int)(Math.random() * 301) - 100;
      System.out.print(numero + " ");
      
      if(numero % 2 == 0){    // numero par
        if(numero > maximoPar){
          numero = maximoPar;
        }
      }else{    // numero impar
          if(numero < minimoImpar){
            numero = minimoImpar;
          }
        }
      suma += numero;
    }
    System.out.println("\nNumero maximo par: " + maximoPar);
    System.out.println("Numero minimo impar: " + minimoImpar);
    System.out.println("Media de los 50 numeros: " + suma/50);
  }
}
