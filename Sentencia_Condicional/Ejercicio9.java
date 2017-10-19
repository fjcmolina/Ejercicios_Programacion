/**
 * Sentencia Condicional
 *
 * 9. Realiza un programa que resuelva una ecuacion de segundo grado (del tipo
 *    a(x*x) + bx + c = 0
 */

public class Ejercicio9{
  public static void main(String[] args) {
    
    String linea;
    System.out.println("Vamos a calcular una ecuacion de segundo grado");
    
    double x1;
    double x2;
    double a;
    double b; 
    double c;
    
    System.out.print("Introduce el valor de a: ");
    linea = System.console().readLine();
    a = Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de b: ");
    linea = System.console().readLine();
    b = Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de c: ");
    linea = System.console().readLine();
    c = Double.parseDouble( linea );
    
    double discriminante = (b*b)-(4*a*c);
    
    
    
    if (discriminante < 0 ){
      System.out.print("La ecuacion no tiene solucion");
      }else {
        System.out.println("x1 = " + (-b + Math.sqrt(discriminante))/(2 * a));
        System.out.println("x2 = " + (-b - Math.sqrt(discriminante))/(2 * a));
      }
    if ((a != 0) && (b !=0) && (c == 0)){
        System.out.println("x1 = 0");
        System.out.println("x2 = " + (-b/a));
    }else if ((a == 0) && (b != 0) && (c != 0)){
      System.out.print("X1 y x2 tiene el mismo valor que es " + (-c / b));
      }
    else if ((a == 0) && (b == 0) && (c ==0)){
      System.out.print("La ecuacion es una identidad");
      }
    }
  }
  

