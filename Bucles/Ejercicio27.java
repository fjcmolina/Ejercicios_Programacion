/**
 * Bucles
 *
 * 27. Escribe un programa que muestre, cuente y sume los múltiplos de 3 que hay
 *     entre 1 y un número leído por teclado.
 */ 
 
 public class Ejercicio27{
  public static void main(String[] args) {
    
    System.out.println("Introduce el numero hasta el que quieras que suma los multiplos de 3");
    int numeroIntroducido =  Integer.parseInt(System.console().readLine());
    
    int suma = 0;
    int repeticiones = 0;
    
    for (int i = 1; i < numeroIntroducido;i++){
      if((i % 3) == 0){
        repeticiones++;
        suma += i;
      }
    }
    System.out.print("En el intervalo introducido hay " + repeticiones + " multiplos de 3 ");
    System.out.print(" y la suma de esos numeros es " + suma);
  }
}
