/**
 * Sentencia Condicional
 *
 * 15. Escribe un programa que pinte una piramide rellena con un caracter
 *     introducido por teclado que podra ser una letra, un numero o un simbolo
 *     como *,+,-,$,&,etc. El programa deve permitir al usuario mediante un menu
 *     elegir si el vertice de la piramide esta apuntando hacia arriba, hacia
 *     abajo, hacia la izquierda o hacia la derecha.
 */

public class Ejercicio15{
  public static void main(String[] args) {
    
    System.out.println("Este programa pinta una pirámide.");
    System.out.print("Introduzca un carácter de relleno: ");
    
    String relleno = System.console().readLine();
    
    System.out.println("Elija un tipo de pirámide");
    System.out.println("1. El vértice apunta hacia arriba");
    System.out.println("2. El vértice apunta hacia abajo");
    System.out.println("3. El vértice apunta hacia la izquierda");
    System.out.println("4. El vértice apunta hacia la derecha");
    
    int opcion = Integer.parseInt(System.console().readLine());
    
    switch(opcion) {
      case 1:
        System.out.println("  " + relleno);
        System.out.println(" " + relleno + relleno + relleno);
        System.out.println(relleno + relleno + relleno + relleno + relleno);
        break;
      case 2:
        System.out.println(relleno + relleno + relleno + relleno + relleno);
        System.out.println(" " + relleno + relleno + relleno);
        System.out.println("  " + relleno);
        break;
      case 3:
        System.out.println("    " + relleno);
        System.out.println("  " + relleno + " " + relleno);
        System.out.println(relleno + " " + relleno + " " + relleno);
        System.out.println("  " + relleno + " " + relleno);
        System.out.println("    " + relleno);
        break;
      case 4:
        System.out.println(relleno);
        System.out.println(relleno + " " + relleno);
        System.out.println(relleno + " " + relleno + " " + relleno);
        System.out.println(relleno + " " + relleno);
        System.out.println(relleno);
        break;
      }
  }
}
