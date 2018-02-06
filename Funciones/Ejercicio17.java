/*
 *  Funciones
 *
 * 17. Escribe un programa que pase de binario a decimal.
 */
package ejercicio17;

import matematicas.Varias;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio17 {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    long decimal = 0;

    System.out.print("Introduzca un número binario: ");
    long binario = s.nextLong();

    int bits = matematicas.Varias.digitos(binario);

    for (int i = 0; i < bits; i++) {
      decimal += matematicas.Varias.digitoN(binario, bits - i - 1) * matematicas.Varias.potencia(2, i);
    }

    System.out.println(binario + " en decimal es " +  decimal);
  }

}
