/*
 * 4. Crea la clase Fracción. Los atributos serán numerador y denominador. Y algunos de
 *    los métodos pueden ser invierte, simplifica, multiplica, divide, etc.
 */
package ejercicio04;

/**
 *
 * @author Francis
 */
public class Ejercicio04 {

  public static void main(String[] args) {

    Fraccion f1 = new Fraccion(-7, 14);
    System.out.println(f1 + " x 5 = " + f1.multiplica(5));
    System.out.println(f1 + " invertida igual a " + f1.invierte());
    System.out.println();

    Fraccion f2 = new Fraccion(3, 9);
    System.out.println(f1 + " x " + f2 + " = " + f1.multiplica(f2));
    System.out.println(f1 + " / " + f2 + " = " + f1.divide(f2));
    System.out.println();

    Fraccion f3 = new Fraccion(580, 320);
    System.out.println(f3 + " = " + f3.simplifica());
  }

}
