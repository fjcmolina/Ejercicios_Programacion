/*
 *  Funciones
 *
 * 18. Escribe un programa que pase de decimal a binario.
 */
package ejercicio18;

import matematicas.Varias;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio18 {

  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);

    System.out.print("Introduzca un número decimal para pasarlo a binario: ");
    int decimal = s.nextInt();

    System.out.println("El resultado en binario es " + decimalBinario(decimal));

  } 

  /**
   * Pasa un número decimal (en base 10) a binario (base 2).
   *
   * @param decimal número entero en base 10
   * @return número inicial pasado a binario
   */
  public static long decimalBinario(int decimal) {

    if (decimal == 0) {
      return 0;
    }

    long binario = 1;
    
    //evitamos los 0 mal leidos en los extremos 
    while (decimal > 1) {
      binario = matematicas.Varias.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);

    return binario;
  }

}
