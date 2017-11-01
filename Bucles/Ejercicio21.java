/**
 * Bucles
 *
 * 21. Realiza un programa que vaya pidiendo números hasta que se introduzca un
 *     numero negativo y nos diga cuantos números se han introducido, la media de
 *     los impares y el mayor de los pares. El número negativo sólo se utiliza para
 *     indicar el final de la introducción de datos pero no se incluye en el cómputo.
 */ 
 
 public class Ejercicio21{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que calcula una media y cuantos numeros se han introducido");
    System.out.println("Vaya introduciendo números (puede parar introduciendo un número negativo):");

    double numero = 0;
    double contadorImpar = 0;
    int contador = 0;
    double sumaImpar = 0;
    double mayorPar = 0;
    
    while (numero >= 0){
      
      numero = Double.parseDouble(System.console().readLine());
      
      if ((numero % 2) != 0) {
        sumaImpar += numero;
        contadorImpar++;
        }else{
          if(numero > mayorPar){
            mayorPar = numero;
              }
            }
      contador++;
    }
    
      double media = (sumaImpar + mayorPar)/ (contadorImpar);
      System.out.printf("La media de los números introducidos es %.2f\n",media );
      System.out.printf("Se ha introducido " + contador + " numeros\n");
  }
}
