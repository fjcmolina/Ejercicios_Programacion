/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio15;

import matematicas.Varias;

/**
 *
 * @author Francis
 */
public class Ejercicio15 {
  public static void main(String[] args) {
    
    for(int i = 1; i < 1001;i++){
      if(matematicas.Varias.esPrimo(i)){
        System.out.print(i + " ");
      }
    }
  }
  
}
