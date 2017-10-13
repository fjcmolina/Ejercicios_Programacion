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
    
    double x1,x2;
    double a, b, c;
    
    System.out.print("Introduce el valor de a: ");
    linea = System.console().readLine();
    a = Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de b: ");
    linea = System.console().readLine();
    b = Double.parseDouble( linea );
    
    System.out.print("Introduce el valor de c: ");
    linea = System.console().readLine();
    c = Double.parseDouble( linea );
    
    double raiz = Math.sqrt((b*b)-(4*a*c));
    
    if ((a == 0) && (b == 0) && (c ==0)){
      System.out.print("La ecuacion tiene infinitas soluciones");
    }
    
    if ((a !=0) && (b !=0) && (c !=0)){
      System.out.print("La ecuacion no tiene solucion");
    }
    
    if ((a != 0) && (b !=0) &&  (c == 0)){
      System.out.println("x1 = 0");
      System.out.println("x2 = " + (-b/a));
    }
    
    if ((a == 0) && (b != 0) && (c != 0)){
      System.out.print("X1 y x2 tiene el mismo valor que es " + (-c / b));
    }
    if ((a !=0) && (b !=0 ) && (c != 0)){
      
      if (raiz <0 ){
      System.out.print("La ecuacion no tiene solucion");
      }
      else{
        System.out.print("x1 = " + (-b + raiz)/(2*a));
        System.out.print("x2 = " + (-b - raiz)/(2*a));
      }
    }
  }
}
