/*
 *     Este ejercicio consiste en realizar una mejora del ejercicio del capítulo 10
 *     que permite gestionar una colección de discos. Ahora cada disco contiene
 *     canciones. Deberás crear la clase Cancion con los atributos y métodos que
 *     estimes oportunos. Añade el atributo canciones a la clase Disco. Este atributo
 *     canciones debe ser un array de objetos de la clase Cancion.
 *
 *     Fíjate bien que Cancion NO ES una subclase de Disco sino que ahora cada
 *     disco puede tener muchas canciones, que están almacenadas en el atributo
 *     canciones.
 *
 *     Modifica convenientemente el método toString para que al mostrarse los datos
 *     de un disco, se muestre también la información sobre las canciones que
 *     contiene.
 *
 *     La aplicación debe permitir añadir, borrar y modificar las canciones de los
 *     discos.
 */
package ejercicio2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio2 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    ArrayList<Disco> a = new ArrayList<>();

    int i;
    String codigo;
    String autor;
    String titulo;
    String genero;
    String duracionString;

    int opcion;
    int opcionListado;
    int duracion;
    int limiteInferior;
    int limiteSuperior;

    //  DISCOS
    a.add(new Disco("GASA41", "Rels B", "Flakk Daniels LP", "Rap", 5));
    a.add(new Disco("FGHQ64", "Kidd Keo", "The Giant", "Trap", 3));
    a.add(new Disco("TYUI89", "Bob Marley", "Babylon by Bus", "reggae", 4));

    //  MENU
    do {
      System.out.println("\n\nCOLECCIÓN DE DISCOS");
      System.out.println("===================");
      System.out.println("1. Listado");
      System.out.println("2. Nuevo disco");
      System.out.println("3. Modificar");
      System.out.println("4. Borrar");
      System.out.println("5. Salir");
      System.out.print("Introduzca una opción: ");
      opcion = Integer.parseInt(s.nextLine());

      switch (opcion) {

        //  LISTADO
        case 1:
          do {
            System.out.println("\n\nLISTADO");
            System.out.println("=======");
            System.out.println("1. Completo");
            System.out.println("2. Por autor");
            System.out.println("3. Por género");
            System.out.println("4. En un rango de duración");
            System.out.println("5. Menú principal");
            System.out.print("Introduzca una opción: ");
            opcionListado = Integer.parseInt(s.nextLine());

            switch (opcionListado) {

              case 1: // LISTADO COMPLETO
                for (Disco d : a) {
                  System.out.println(d);
                }
                break;

              case 2: // LISTADO DE AUTORES

                System.out.print("Introduzca el autor: ");
                autor = s.nextLine();

                for (Disco d : a) {
                  if (d.getAutor().equals(autor)) {
                    System.out.println(d);
                  }
                }
                break;

              case 3: // LISTADO POR GENEREOS

                System.out.print("Introduzca el género: ");
                genero = s.nextLine();

                for (Disco d : a) {
                  if (d.getGenero().equals(genero)) {
                    System.out.println(d);
                  }
                }
                break;

              case 4: // LISTADOR POR DURACION DE DISCO

                System.out.println("Introduce el intervalo para la duración");

                System.out.print("Introduzca la duración minima en minutos: ");
                limiteInferior = Integer.parseInt(s.nextLine());

                System.out.print("Introduzca la duracion maxima en minutos: ");
                limiteSuperior = Integer.parseInt(s.nextLine());

                for (Disco d : a) {
                  if ((d.getDuracion() <= limiteSuperior) && (d.getDuracion() >= limiteInferior)) {
                    System.out.println(d);
                  }
                }
            }
          } while (opcionListado != 5);

          break;

        //  NUEVO DISCO
        case 2:
          System.out.println("\n\nNUEVO DISCO");
          System.out.println("===========");

          System.out.println("Introduzca los datos del disco:");
          System.out.print("Código: ");
          codigo = s.nextLine();

          while (a.contains(new Disco(codigo, "", "", "", 0))) {
            System.out.println("Ese código ya existe en la base de datos.");
            System.out.print("Introduzca otro código: ");
            codigo = s.nextLine();
          }

          System.out.print("Autor: ");
          autor = s.nextLine();
          System.out.print("Título: ");
          titulo = s.nextLine();
          System.out.print("Género: ");
          genero = s.nextLine();
          System.out.print("Duración: ");
          duracion = Integer.parseInt(s.nextLine());

          a.add(new Disco(codigo, autor, titulo, genero, duracion));

          break;

        //  MODIFICAR 
        case 3:
          System.out.println("\n\nMODIFICAR");
          System.out.println("===========");

          System.out.print("Introduzca el código del disco cuyos datos desea cambiar: ");
          codigo = s.nextLine();

          while (!a.contains(new Disco(codigo, "", "", "", 0))) {
            System.out.print("Ese código no existe, introduzca otro código: ");
            codigo = s.nextLine();
          }
          i = a.indexOf(new Disco(codigo, "", "", "", 0));

          System.out.println("Introduzca los nuevos datos del disco o INTRO para dejarlos igual.");

          System.out.println("Código: " + a.get(i).getCodigo());
          System.out.print("Nuevo código: ");
          codigo = s.nextLine();
          if (!codigo.equals("")) {
            a.get(i).setCodigo(codigo);
          }

          System.out.println("Autor: " + a.get(i).getAutor());
          System.out.print("Nuevo autor: ");
          autor = s.nextLine();
          if (!autor.equals("")) {
            a.get(i).setAutor(autor);
          }

          System.out.println("Título: " + a.get(i).getTitulo());
          System.out.print("Nuevo título: ");
          titulo = s.nextLine();
          if (!titulo.equals("")) {
            a.get(i).setTitulo(titulo);
          }

          System.out.println("Género: " + a.get(i).getGenero());
          System.out.print("Nuevo género: ");
          genero = s.nextLine();
          if (!genero.equals("")) {
            a.get(i).setGenero(genero);
          }

          System.out.println("Duración: " + a.get(i).getDuracion());
          System.out.print("Duración: ");
          duracionString = s.nextLine();
          if (!duracionString.equals("")) {
            a.get(i).setDuracion(Integer.parseInt(duracionString));
          }
          break;

        //  BORRAR
        case 4:
          System.out.println("\n\nBORRAR");
          System.out.println("======");

          System.out.print("Introduzca el código del disco que desea borrar: ");
          codigo = s.nextLine();

          if (!a.contains(new Disco(codigo, "", "", "", 0))) {
            System.out.println("Lo siento, el código introducido no existe");
          } else {
            a.remove(a.indexOf(new Disco(codigo, "", "", "", 0)));
            System.out.println("Album borrado");
          }
      }
    } while (opcion != 5);
  }

}
