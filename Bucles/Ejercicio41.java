/**
 * Bucles
 *
 * 41. Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
 *     hay dentro de un número. Se recomienda usar long en lugar de int ya que el
 *     primero admite números más largos.
 */ 

 public class Ejercicio41{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra la suma de los numeros pares introducidos ");
    
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
    long numeroReves = 0;
    int contadorPar = 0;
    int contadorImpar = 0;
    
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
  
      int digito;

      digito = (int)(numeroReves % 10);
      if((digito % 2) == 0){
      contadorPar++;
        }else{
          contadorImpar++;
          }
      numeroReves /= 10;
      }
      
     System.out.print("\n Hay " +contadorPar + " numeros pares");
     System.out.print("\n Hay " +contadorImpar + " numeros impares");
  }
}
