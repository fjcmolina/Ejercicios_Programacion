/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import matematicas.Varias;
import java.util.Scanner;
/**
 *
 * @author Francis
 */
public class Ejercicio01al014 {
   public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     int numero;
     
    // Ejercicio 1: numero capicuo
    System.out.println("Introduzca un numero para saber si es capicua: ");
    numero = s.nextInt();

    if (matematicas.Varias.esCapicua(numero)) {
      System.out.println("El " + numero + "  es capicúa");
    }else {
      System.out.println("El " + numero + " no es capicúa");
    }
    System.out.println();
    
    
    // Ejercicio 2 : numero primo
    System.out.println("Introduzca un numero para saber si es primo: ");
    numero = s.nextInt();
    
    if (matematicas.Varias.esPrimo(numero)) {
      System.out.println("El " + numero + " es primo");
    }else{
      System.out.println("El " + numero + " no es primo");
    }
    System.out.println();

    // Ejercicio 3 : siguiente numero primo
    
    System.out.println("Introduzca un numero para saber el siguiente numero primo a ese numero: ");
    numero = s.nextInt();
    
    int siguiente = matematicas.Varias.siguientePrimo(numero);
    System.out.println("El siguiente primo mayor a " + numero + " es el " + siguiente);
    
    System.out.println();
    
    // Ejercicio 4: se muestra la potencia de un numero

    System.out.print("Introduce una base: ");
    int base = s.nextInt();
          
    System.out.print("Ahora Introduce un exponente: ");
    int exponente = s.nextInt();
          
    double potencia = matematicas.Varias.potencia(base, exponente);
    System.out.println("La potencia de " + base + " elevado a " + exponente + " es " + potencia);
    
    System.out.println();
    
    // Ejercicio 5 : cuenta digitos

    System.out.print("Introduce un número y te diré cuantos dígitos tiene: ");
    numero = s.nextInt();
           
    int cuentaDigito = matematicas.Varias.digitos(numero);
           
    System.out.println("El " + numero + " tiene " + cuentaDigito + " dígitos");
    System.out.println();
    
    
    // Ejercicio 6 : voltea un numero

    System.out.print("Introducé un número para voltearlo: ");
    numero = s.nextInt();
           
    int volteado = matematicas.Varias.voltea(numero);
           
    System.out.println("El numero " + numero + " volteado queda de esta manera " + volteado);
    System.out.println();
    
    
    // Ejercicio 7 : muestra el numero de una posicion

    System.out.print("Introduce un número: ");
    numero= s.nextInt();
           
    System.out.print("Introduce un numero y te dire el digito de esa posicion: ");
    int posicion = s.nextInt();
           
    int posicionDelDigito = matematicas.Varias.digitoN(numero, posicion);
           
    System.out.println("En la posicion " +posicion + " está el " + posicionDelDigito);
    System.out.println();
    
    
    // Ejercicio 8 : ocurrencia de un numero

    System.out.print("Introduce un número: ");
    numero = s.nextInt();
           
    System.out.print("Ahora introduce un número de 1 cifra: ");
    int cifra = s.nextInt();
           
    int ocurrencia = matematicas.Varias.posicionDeDigito(numero, cifra);
           
    if(ocurrencia == -1){
      System.out.println("El número " + cifra + " no se encuentra " + ocurrencia);
      } else {
        System.out.println("El número " + cifra + " aparece primero en la posición " + ocurrencia);
     System.out.println();

    // Ejercicio 9 : quita digitos a un numero por detras

    System.out.print("Introduce un número: ");
     numero = s.nextInt();
           
    System.out.print("¿Cuántos dígitos le quieres quitar al número por detrás?: ");
    int quitarDetras = s.nextInt();
           
    int resultadoDetras = matematicas.Varias.quitaPorDetras(numero, quitarDetras);
           
    System.out.println("Numero recortado por detras " + resultadoDetras);
    System.out.println();

    // Ejercicio 10 : quita digitos a un numero por delante

    System.out.print("Introduce un número: ");
    numero = s.nextInt();
           
    System.out.print("¿Cuántos dígitos le quieres quitar al número por delante?: ");
    int quitarDelante = s.nextInt();
           
    int resultadoDelante = matematicas.Varias.quitaPorDelante(numero, quitarDelante);
           
    System.out.println("Numero recortado por delante " + resultadoDelante);
    System.out.println();

    // Ejercicio 11 : añande un digito a un numero por detras

     System.out.print("Introduce un número: ");
     numero = s.nextInt();
           
    System.out.print("Escribe un dígito para pegarselo por detrás al número: ");
    int pegarDetras = s.nextInt();
           
    int resultadoPegaDetras = matematicas.Varias.pegaPorDetras(numero, pegarDetras);
           
    System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDetras);
    System.out.println();
    
    
    // Ejercicio 12 : añande un digito a un numeor por delante

    System.out.print("Introduce un número: ");
    numero  = s.nextInt();
           
    System.out.print("Escribe un dígito para pegarselo por delante al número: ");
    int pegarDelante = s.nextInt();
           
    int resultadoPegaDelante = matematicas.Varias.pegaPorDelante(numero, pegarDelante);
           
    System.out.println("Este es tu número con el dígito añadido: " + resultadoPegaDelante);
    System.out.println();

    // Ejercicio 13 : trozea un numero

    System.out.print("Introduce un numero: ");
    int i = s.nextInt();
    System.out.print("Introduce el inicio: ");
    int e = s.nextInt();
    
    System.out.print("Introduce el inicio: ");
    int j = s.nextInt();
    
    int x = matematicas.Varias.voltea(i);
    
    do {
      x = x / 10;
    } while ( x % 10 != e);
   
    System.out.println(x);
    int x2 = matematicas.Varias.voltea(x);
    do {
      x2 = x2 / 10;
    } while ( x2 % 10 != j);
    
    System.out.println();
    
    
    // Ejercicio 14 : pega dos numeros para formar uno

     System.out.print("Introduce un número: ");
     numero = s.nextInt();
           
    System.out.print("Escribe otro numero para pergaselo al anterior introducido: ");
    int pegarNumeros = s.nextInt();
           
    int resultadoPegaNumero = matematicas.Varias.juntaNumeros(numero, pegarNumeros);
           
    System.out.println("Este es tu número pegado: " + resultadoPegaNumero);
    }
  }
}   
