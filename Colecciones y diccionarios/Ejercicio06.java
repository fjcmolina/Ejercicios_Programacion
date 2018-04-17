/*
 *    Colecciones y diccionarios
 *
 * 6. Implementa el control de acceso al área restringida de un programa. Se debe
 *    pedir un nombre de usuario y una contraseña. Si el usuario introduce los
 *    datos correctamente, el programa dirá “Ha accedido al área restringida”. El
 *    usuario tendrá un máximo de 3 intentos. Si se agotan las intentos
 *    el programa dirá “Lo siento, no tiene acceso al área restringida”. Los nombres
 *    de usuario con sus correspondientes contraseñas deben estar almacenados
 *    en una estructura de la clase HashMap.
 */
package ejercicio06;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio06 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    boolean acceso = false;
    int intentos = 3;

    HashMap<String, String> login = new HashMap<>();

    login.put("admin", "admin");
    login.put("usuario", "usuario");
    login.put("francis", "francis");

    do {
      System.out.print("\nIntroduce el nombre de usuario: ");
      String usuario = s.nextLine();

      System.out.print("Introduce la contraseña: ");
      String contraseña = s.nextLine();

      if (login.containsKey(usuario)) {
        if (login.get(usuario).equals(contraseña)) {
          System.out.println("\nHa accedido al área restringida");
          acceso = true;
        } else {
          System.out.println("Contraseña incorrecta");
        }
      } else {
        System.out.println("El usuario no existe");
      }

      intentos--;

      if (!acceso && (intentos > 0)) {
        System.out.println("Le quedan " + (intentos) + " intentos");
      }
    } while ((!acceso) && (intentos > 0));
    
    if (!acceso) {
      System.out.print("Lo siento, puede acceder al area restringida");
    }
  }

}
