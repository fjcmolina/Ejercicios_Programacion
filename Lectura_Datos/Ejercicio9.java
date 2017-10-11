/**
 * Lectura de datos desde teclado
 *
 * 9. Escribe un programa que calcule el volumen de un cono según la fórmula
 *    (1/3)*PI*r*r*h.
 */

public class Ejercicio9{
  public static void main(String[] args) {
    
    double radio;
    double altura;
    String linea;
    
    System.out.println("Vamos a calcular el volumen de un cono");
    System.out.print("Introduzca el radio del cono: ");
    linea = System.console().readLine();
    radio = Double.parseDouble(linea);
    
    System.out.print("Introduzca la altura de un cono: ");
    linea = System.console().readLine();
    altura = Double.parseDouble( linea );
    
    double volumen;
    volumen = (3.14 * (radio * radio) * altura) / 3;
    System.out.print("El volumen del cono es " + volumen);
  }
}
