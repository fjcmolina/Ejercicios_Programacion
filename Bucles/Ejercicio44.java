/**
 * Bucles
 *
 * 44. Escribe un programa que sea capaz de insertar un dígito dentro de un número
 *     indicando la posición. El nuevo dígito se colocará en la posición indicada y el
 *     resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
 *     izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
 *     correctamente los datos. Se recomienda usar long en lugar de int ya que el
 *     primero admite números más largos.
 */ 
 
 public class Ejercicio44{
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero positivo: ");
    long numeroIntroducido = Long.parseLong(System.console().readLine());

    System.out.print("Introduce la posición donde quiere insertar: ");
    long posicion = Long.parseLong(System.console().readLine());

    System.out.print("Introduce el dígito que quiere insertar: ");
    long digito = Long.parseLong(System.console().readLine());

    long numero = numeroIntroducido;

    
    int longitud = 0;
    
    do {
      numero /= 10;
      longitud++;
    } while (numero > 0);
    
    // parte izquierda
    long parteIzquierda = numeroIntroducido / (long)(Math.pow(10, longitud - posicion + 1));
    parteIzquierda = parteIzquierda * 10 + digito;
    
    // parte derecha
    long parteDerecha = numeroIntroducido % (long)(Math.pow(10, longitud - posicion + 1));

    // resultado
    numero = parteIzquierda * (long)(Math.pow(10, longitud - posicion + 1)) + parteDerecha;
    System.out.print("El número es " + numero);
  }
}
