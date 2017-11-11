/**
 * Bucles
 *
 * 34. Escribe un programa que pida dos números por teclado y que luego mezcle en
 *     dos números diferentes los dígitos pares y los impares. Se van comprobando
 *     los dígitos de la siguiente manera: primer dígito del primer número, primer
 *     dígito del segundo número, segundo dígito del primer número, segundo
 *     dígito del segundo número, tercer dígito del primer número… Para facilitar
 *     el ejercicio, podemos suponer que el usuario introducirá dos números de la
 *     misma longitud y que siempre habrá al menos un dígito par y uno impar. Usa
 *     long en lugar de int donde sea necesario para admitir números largos.
 */ 
 
 public class Ejercicio34{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra la suma de los numeros pares introducidos ");
    
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    System.out.print("Introduce otro numero entero positivo: ");
    long numeroIntroducido2 = Long.parseLong(System.console().readLine());
    
    int longitud = 0;
    long numero = numeroIntroducido;
    long numeroReves = 0;
    
    if(numero == 0){
      longitud = 1;
      }
    
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    
    numero = numeroIntroducido2;
    long numeroReves2 = 0;
    
    while (numero > 0) {
      numeroReves2 = (numeroReves2 * 10) + (numero % 10);
      numero /= 10;
    }
    
    int digito;
    long resultadoPar = 0;
    long resultadoImpar = 0;
    
    for(int i = 0;i < longitud;i++){
      digito = (int)(numeroReves % 10);
      if((digito % 2) == 0){
        resultadoPar = (resultadoPar * 10) + digito;
        }else{
          resultadoImpar = (resultadoImpar * 10) + digito;
          }
      numeroReves /= 10;
      
      digito = (int)(numeroReves2 % 10);
      if((digito % 2) == 0){
        resultadoPar = (resultadoPar * 10) + digito;
        }else{
          resultadoImpar = (resultadoImpar * 10) + digito;
          }
      numeroReves2 /= 10;
      }
      
    System.out.println("El numero formado por los digitos pares es: " + resultadoPar);
    System.out.println("El numero formado por los digitos impares es: " + resultadoImpar);
  }
}
