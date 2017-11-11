/**
 * Bucles
 *
 * 32. Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 *     suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
 *     izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
 *     números largos.
 */ 
 
 public class Ejercicio32{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra la suma de los numeros pares introducidos ");
    
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
    long numeroReves = 0;
    int longitud = 0;
    
     while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      longitud++;
    }
    
    int digito;
    int suma = 0;
    
    System.out.print("Los numeros pares son : " );
    
    for(int i = 0;i < longitud;i++){
      digito = (int)(numeroReves % 10);
      if((digito % 2) == 0){
        System.out.print(digito + " ");
        suma += digito;
        }
      numeroReves /= 10;
      }
     System.out.print("\nLa suma de los numeros pares es : " + suma );
  }
}
