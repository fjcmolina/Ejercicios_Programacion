/*
 *   En HTML / CSS, un color se puede indicar mediante la palabra en inglés o su código RGB. Crea un
 *   programa que nos ayude en nuestro diseño de páginas web. El programa deberá pedir un color en
 *   español y nos dará el correspondiente color en inglés y el código RGB. Si el color introducido no
 *   existe, se mostrará el mensaje “Lo siento, ese color no existe”.
 *
 *   Ejemplo:
 *   Por favor, introduzca un color: verde
 *   El color verde, en inglés es Green y su código RGB es #008000.
 *
 *   La información se debe guardar en dos HashMap. Uno de ellos tendrá parejas clave-valor del tipo
 *   (color español, color inglés) y otro (color español, código RGB). A continuación se muestra la tabla
 *   de colores:
 */
package colores;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Colores {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    HashMap<String, String> Valor = new HashMap<>();
    HashMap<String, String> Codigo = new HashMap<>();

    Valor.put("Blue", "azul");
    Valor.put("Black", "negro");
    Valor.put("Red", "rojo");
    Valor.put("White", "blanco");
    Valor.put("Green", "verde");
    Valor.put("Purple", "morado");
    Valor.put("Yellow", "amarillo");
    Valor.put("Orange", "naranja");
    Valor.put("Violet", "rosa");

    Codigo.put("Blue", "#000FF");
    Codigo.put("Black", "#00000");
    Codigo.put("Red", "#FF000");
    Codigo.put("White", "#FFFFF");
    Codigo.put("Green", "#00800");
    Codigo.put("Purple", "#80080");
    Codigo.put("Yellow", "#FFFF00");
    Codigo.put("Orange", "#FFA500");
    Codigo.put("Violet", "#EE82EE");
    
    System.out.print("Por favor, introduzca un color: ");
    String color = s.nextLine();
    
    if (Valor.containsKey(color) && Codigo.containsKey(color)) {
      System.out.println("El color " + Valor.get(color) + ", en ingles es " + color + " y su codigo RGB es " + Codigo.get(color));
    } else {
      System.out.println("Lo siento, ese color no existe");
    }
  }

}
