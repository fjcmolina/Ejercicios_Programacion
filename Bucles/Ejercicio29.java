/**
 * Bucles
 *
 * 29. Escribe un programa que muestre por pantalla todos los números enteros
 *     positivos menores a uno leído por teclado que no sean divisibles entre otro
 *     también leído de igual forma.
 */ 
 
 public class Ejercicio29{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra los numeros positivos menores divisibles entre otro numero");
    System.out.println("Introduce el numero positivo mayor: ");
    int numeroMayor= Integer.parseInt( System.console().readLine());
    
    System.out.println("Introduce un numero menor que el anterior: ");
    int numeroMenor= Integer.parseInt( System.console().readLine());
    
    System.out.println("Los siguientes numeros menores que " + numeroMayor+
    " no son divisibles entre " + numeroMenor);
    
    for(int i = 1; i < numeroMayor;i++){
      if((i % numeroMenor)!= 0){
        System.out.println(i);
        }
      }
  }
}
