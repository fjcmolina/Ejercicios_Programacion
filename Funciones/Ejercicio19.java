/*
 *  Funciones
 *
 * 19. Une y amplía los dos programas anteriores de tal forma que se permita
 *     convertir un número entre cualquiera de las siguientes bases: decimal, binario,
 *     hexadecimal y octal.
 */
package ejercicio19;

import matematicas.Varias;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio19 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    
    System.out.println("---===============================================---");
    System.out.println("---==== PROGRAMA CONVERSOR A BASE 2,8,10 Y 16 ====---");
    System.out.println("---===============================================---");
    System.out.println();
    System.out.printf("%-30s %-30s %-30s", "1.Decimal a Binario", "2.Decimal a Octal", "3.Decimal a Hexadecimal");
    System.out.println();
    System.out.printf("%-30s %-30s %-30s", "4.Binario a Decimal", "5.Binario a Octal", "6.Binario a HexaDecimal");
    System.out.println();
    System.out.printf("%-30s %-30s %-30s", "7.Octal a Decimal", "8.Octal a Binario", "9.Octal a Hexadecima");
    System.out.println();
    System.out.printf("%-30s %-30s %-30s", "10.Hexadecimal a Decimal", "11.Hexadecimal a Binario", "12.Hexadecimal a Octal");
    
    System.out.print("\n\nElige un método de conversión: ");
    String op = s.nextLine();
    System.out.print("\nIntroduce un número: ");
    String hex = "";
    long n = 0;
    switch (op) {
      case "10":
      case "11":
      case "12":
        hex = s.nextLine().toUpperCase();
        break;
      default:
        n = s.nextLong();
    }

    switch (op) {
      case "1":
        System.out.println(n + " en Decimal es " + decimalBinario(n) + " en binario.");
        break;
      case "2":
        System.out.println(n + " en Decimal es " + binarioOctal(decimalBinario(n)) + " en octal.");
        break;
      case "3":
        System.out.println(n + " en Decimal es " + binarioHexadecimal(decimalBinario(n)) + " en Hexadecimal.");
        break;
      case "4":
        System.out.println(n + " en Binario es " + binarioDecimal(n) + " en Decimal.");
        break;
      case "5":
        System.out.println(n + " en Binario es " + binarioOctal(n) + " en Octal.");
        break;
      case "6":
        System.out.println(n + " en Binario es " + binarioHexadecimal(n) + " en Hexadecimal.");
        break;
      case "7":
        System.out.println(n + " en Octal es " + binarioDecimal(octalBinario(n)) + " en Decimal.");
        break;
      case "8":
        System.out.println(n + " en Octal es " + octalBinario(n) + " en Binario.");
        break;
      case "9":
        System.out.println(n + " en Octal es " + binarioHexadecimal(octalBinario(n)) + " en Hexadecimal.");
        break;
      case "10":
        System.out.println(hex + " en Hexadecimal es " + (binarioDecimal(hexadecimalBinario(hex))) + " en Decimal.");
        break;
      case "11":
        System.out.println(hex + " en Hexadecimal es " + hexadecimalBinario(hex) + " en Binario.");
        break;
      case "12":
        System.out.println(hex + " en Hexadecimal es " + (binarioOctal(hexadecimalBinario(hex))) + " en Octal.");
        break;
      default:
        System.out.println("No se seleccionó una opción válida para convertir.");
    }
  }

  public static long binarioDecimal(long n) {
    long dec = 0;
    for (int i = 0; i < Varias.digitos(n); i++) {
      dec += Varias.potencia(2, i) * Varias.digitoN(n, Varias.digitos(n) - i - 1); //para que tome la posición i=0 como la última cifra del número
    }
    return dec;
  }

  public static String binarioHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int) binarioDecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    }
    return hexadecimal;
  }

  public static long binarioOctal(long binario) {
    long octal = 1;
    while (binario > 0) {
      octal = octal * 10 + (binarioDecimal(binario % 1000));
      binario = binario / 1000;
    }
    octal = Varias.pegaPorDetras(octal, 1);
    octal = Varias.voltea(octal);
    octal = Varias.quitaPorDetras(octal, 1);
    octal = Varias.quitaPorDelante(octal, 1);
    return octal;
  }

  public static long decimalBinario(long decimal) {
    if (decimal == 0) {
      return 0;
    }

    long binario = 1;
    
    //evitamos los 0 mal leidos en los extremos 
    while (decimal > 1) {
      binario = Varias.pegaPorDetras(binario, (int)decimal % 2)
      decimal = decimal / 2;
    }
    binario = matematicas.Varias.pegaPorDetras(binario, 1);
    binario = matematicas.Varias.voltea(binario);
    binario = matematicas.Varias.quitaPorDetras(binario, 1);

    return binario;
  }

  public static long octalBinario(long octal) {
    long binario = 0;
    for (int i = 0; i < Varias.digitos(octal); i++) {
      binario = binario * 1000 + decimalBinario(Varias.digitoN(octal, i));
    }
    return binario;
  }

  public static long hexadecimalBinario(String hex) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
    for (int i = 0; i < hex.length(); i++) {
      binario = binario * 10000 + decimalBinario(digitosHexa.indexOf(hex.charAt(i)));
    }
    return binario;
  }

}
