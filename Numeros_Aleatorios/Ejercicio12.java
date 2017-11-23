/**
 * Numeros Aleatorios
 *
 * 12. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
 *     con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
 *     convertir un entero en un carácter.
 */ 
 
 public class Ejercicio12{
  public static void main(String[] args)throws InterruptedException {
    
    System.out.print("\033[32m");
    for(long i = 0; i < 60000000; i++){
      
      int num = (int)(Math.random()*94) + 32;
      System.out.print((char)(num));
      Thread.sleep(1);
      }
    
  }
}
