/*
 * 7. Mejora el juego “Busca el tesoro” de tal forma que si hay una mina a una casilla
 *    de distancia, el programa avise diciendo ¡Cuidado! ¡Hay una mina cerca!
 */
package ejercicio07;

import java.util.Scanner;

/**
 *
 * @author Francis
 */
public class Ejercicio07 {
  public static void main(String[] args) {
    
    final char TESORO = 'T';
    final char MINA = 'X';
    final char VACIO = 'O';
    
    final String RESET = "\u001B[0m";
    final String RED = "\033[31m";
    final String GREEN = "\033[32m";
    final String PURPLE = "\033[35m";
    final String YELLOW = "\033[0;33m";
    
    Scanner s = new Scanner(System.in);
    
    char[][] tablero = new char[5][5];
    int x = (int) (Math.random() * 5);
    int y = (int) (Math.random() * 5);
    
    //Tablero
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 5; j++) {
        tablero[i][j] = VACIO;
      }
    }
    //Tesoro
    tablero[x][y] = TESORO;
    //Mina
    int mx;
    int my;
    do {
      mx = (int) (Math.random() * 5);
      my = (int) (Math.random() * 5);
    } while (mx == x || my == y);
    tablero[mx][my] = MINA;
    int intentos = 10;
    int cont;
    boolean encontrado = false;
    System.out.println("  0 1 2 3 4");
    System.out.println("-┼─────────");
    cont = 0;
    for (char[] tab : tablero) {
      System.out.print(cont + "│");
      cont++;
      for (char c : tab) {
        System.out.print("O ");
      }
      System.out.println();
    }
    //INICIO
    do {
      do {
        System.out.print("\nIntentos restantes: " + intentos);
        System.out.print("\nIntroduzca una coordenada válida entre [0,0] y [4,4]. \nElija la coordenada x: ");
        y = s.nextInt();
        System.out.print("Elija la coordenada y: ");
        x = s.nextInt();
      } while (x > 4 || x < 0 || y > 4 || y < 0);

      switch (tablero[x][y]) {
        case 'T':
          System.out.println(GREEN + "¡Enhorabuena, has encontrado el tesoro!\n");
          encontrado = true;
          break;
        case 'X':
          System.out.println(RED + "Mala suerte... has pisado una mina y has reventado\n");
          encontrado = true;
          break;
        case '-':
          System.out.println(PURPLE + "Ya habías buscado en esa posición antes" + RESET);
          break;
        default:
          intentos--;
          for (int i = y - 1; i < y + 2; i++) {
            for (int j = x - 1; j < x + 2; j++) {
              if (i >= 0 && i < 5 && j >= 0 && j < 5 && tablero[j][i] == 'X') { //ver las casillas colindantes DENTRO del tablero
                System.out.println(YELLOW + "¡Cuidado! Hay una mina cerca." + RESET);
              }
            }
          }
          tablero[x][y] = '-';
          System.out.println("  0 1 2 3 4");
          System.out.println("-┼─────────");
          cont = 0;
          for (char[] tab : tablero) {
            System.out.print(cont + "│");
            cont++;
            for (char c : tab) {
              if (c == '-') {
                System.out.print(c + " ");
              } else {
                System.out.print("O ");
              }
            }
            System.out.println();
          }
      }

    } while (intentos > 0 && !encontrado);

    if (intentos == 0) {
      System.out.println("Te has quedado sin intentos. Aquí está el mapa:\n");
    }
    System.out.println("Aquí está el mapa descubierto:\n");
    System.out.println("  0 1 2 3 4");
    System.out.println("-┼─────────");
    cont = 0;
    for (char[] tab : tablero) {
      System.out.print(cont + "│");
      cont++;
      for (char c : tab) {
        System.out.print(c + " ");
      }
      System.out.println();
    }
  }

}
