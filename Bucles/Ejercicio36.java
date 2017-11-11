/**
 * Bucles
 *
 * 36. Escribe un programa que diga si un número introducido por teclado es o no
 *     capicúa. Los números capicúa se leen igual hacia delante y hacia atrás. El
 *     programa debe aceptar números de cualquier longitud siempre que lo permita
 *     el tipo, en caso contrario el ejercicio no se dará por bueno. Se recomienda usar
 *     long en lugar de int ya que el primero admite números más largos.
 */ 
 
 public class Ejercicio36{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que nos diga si es capicua el numero introducido ");
    
    System.out.print("Introduce un numero entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());
    
    long numero = numeroIntroducido;
    long numeroReves = 0;
    
     while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
    }
    
    if(numeroIntroducido == numeroReves){
      System.out.print("El numero es capicua ");
      }else{
        System.out.print("El numero no es capicua");
        }
    
  }
}
    
