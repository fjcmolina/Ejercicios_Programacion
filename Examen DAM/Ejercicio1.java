/**
 * Examen  DAM
 *
 * 1.Realiza un programa que calcule el máximo, el mínimo y la media de una serie de números enteros
 *   positivos introducidos por teclado. El programa terminará cuando el usuario introduzca un número
 *   primo. Este último número no se tendrá en cuenta en los cálculos. El programa debe indicar también
 *   cuántos números ha introducido el usuario (sin contar el primo que sirve para salir).
 */ 
 
 public class Ejercicio1{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcula una media y cuantos numeros se han introducido");
   
    int numero = 0;
    boolean primo = true;
    int numeroMayor = 0; //busca el numero maximo introducido
    int numeroMenor = 9999; // busca el numero minimo introducido
    int suma = 0;
    int contador = 0;
    
    do{
      System.out.println("Vaya introduciendo números (puede parar introduciendo un número primo):");
      numero =  Integer.parseInt(System.console().readLine());
      primo = true;
      
      for( int i = 2; i < numero;i++){
      if(numero % i == 0){
        primo = false;
        }
      }
      
      if ((numero >= 0) && (!primo)){
        suma += numero;
        contador++;
          if(numero > numeroMayor){
            numeroMayor = numero;
            }
          if(numero < numeroMenor){
            numeroMenor = numero;
            }
        }
      
      }while(!primo);
      
      if(primo && (contador > 0)){
        
        int media = suma /contador;
        System.out.println("Ha introducido " + contador + " no primos");
        System.out.println("El numero mayor introducido es: " + numeroMayor);
        System.out.println("El numero menor introducido es; " + numeroMenor);
        System.out.println("La media de estos numeros es: " + media);
      }else{
        System.out.println("Introduce un numero no primo para realizar el programa");
        }
  }
}
