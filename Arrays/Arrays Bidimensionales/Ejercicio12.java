/*
 *    Arrays Bidimensionales
 *
 * 12. Realiza un programa que muestre por pantalla un array de 9 filas por 9
 *     columnas relleno con números aleatorios entre 500 y 900. A continuación, el
 *     programa debe mostrar los números de la diagonal que va desde la esquina
 *     inferior izquierda a la esquina superior derecha, así como el máximo, el mínimo
 *     y la media de los números que hay en esa diagonal.
 */
package ejercicio12;

/**
 *
 * @author Francis
 */
public class Ejercicio12 {

  public static void main(String[] args) {

    int[][] array = new int[9][9];

    System.out.println("Array: ");
    for (int i = 0; i < 9; i++) {
      for (int j = 0; j < 9; j++) {
        array[i][j] = (int) (Math.random() * 401) + 500;
        System.out.printf("%5d", array[i][j]);
      }
      System.out.println();
    }

    int auxX = 8;
    int auxY = 0;
    int indiceDiagonal = 0;
    int[] diagonal = new int[9];

    for (int x = 0; x < 9; x++) {
      diagonal[indiceDiagonal] = array[auxX][auxY];
      indiceDiagonal++;
      auxX--;
      auxY++;
    }

    System.out.println();
    System.out.println("Los numeros de la linea diagonal son:");

    int mayor = 0;
    int menor = 999;
    int suma = 0;

    for (int i = 0; i < 9; i++) {
      System.out.print(diagonal[i] + " ");
      if (diagonal[i] > mayor) {
        mayor = diagonal[i];
      } else if (diagonal[i] < menor) {
        menor = diagonal[i];
      }
      suma += diagonal[i];
    }

    System.out.println();
    System.out.println();

    System.out.println("El numero mayor es: " + mayor);
    System.out.println("El numero menor es: " + menor);
    System.out.println("Y la media de esos numeros es: " + ((double) suma / 10));
  }

}
