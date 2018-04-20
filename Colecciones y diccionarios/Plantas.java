/*
 *  Nos han encargado realizar una aplicación sobre remedios naturales y empezaremos guardando
 *  información sobre algunas plantas de tal forma que podamos saber su nombre común, su nombre
 *  científico y sus propiedades. Crea un programa que pida al usuario el nombre común de una planta y
 *  que, a continuación, nos muestre el nombre científico y sus propiedades curativas. Si la planta
 *  introducida no existe, se mostrará el mensaje “Lo siento, esa planta no existe”.
 *
 *   Ejemplo:
 *   Por favor, introduzca el nombre de una planta: romero
 *   Nombre científico: rosmarinus officinalis
 *   Propiedades: Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades
 *   respiratorias y del aparato digestivo.
 *
 *   La información se debe guardar en dos diccionarios (dos HashMap). Uno de ellos tendrá parejas
 *   clave-valor del tipo (nombre común, nombre científico) y otro (nombre común, propiedades). El
 *   programa no se dará por válido si no utiliza los dos HashMap indicados, aunque funcione bien. A
 *   continuación se muestra la información en una tabla:
 */
package plantas;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Plantas {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    HashMap<String, String> NombreComunCientifico = new HashMap<>();
    HashMap<String, String> NombrePropiedades = new HashMap<>();

    NombreComunCientifico.put("ortiga", "urtica dioica");
    NombreComunCientifico.put("romero", "rosmarinus officinalis");
    NombreComunCientifico.put("aloe vera", "aloe barbadensis miller");
    NombreComunCientifico.put("ayahuasca", "banisteriopsis caapi");

    NombrePropiedades.put("ortiga", "Es diurética y depurativa. Baja los niveles de colesterol.");
    NombrePropiedades.put("romero", "Tiene efectos estimulantes y tónicos, favorece en la recuperación de las enfermedades respiratorias y del aparato digestivo.");
    NombrePropiedades.put("aloe vera", "Regenera las células de la piel e incluso las de tejidos internos. Elimina hongos y virus. Protege el sistema inmunitario.");
    NombrePropiedades.put("ayahuasca", "Se usa en el tratamiento de la depresión y la ansiedad así como en los problemas de personalidad y esquizofrenia.");

    System.out.print("Por favor, introduzca el nombre de una planta: ");
    String nombre = s.nextLine();

    if (NombreComunCientifico.containsKey(nombre) && NombrePropiedades.containsKey(nombre)) {
      System.out.println("Nombre Cientifico: " + NombreComunCientifico.get(nombre));
      System.out.println("Propiedades: " + NombrePropiedades.get(nombre));
    } else {
      System.out.println("Lo siento, esa planta no existe");
    }
  }
}
