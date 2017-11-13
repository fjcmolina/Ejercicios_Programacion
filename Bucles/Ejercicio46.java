/**
 * Bucles
 *
 * 46. Realiza un programa que pinte por pantalla un rectángulo hueco hecho con
 *     asteriscos. Se debe pedir al usuario la anchura y la altura. Hay que comprobar
 *     que tanto la anchura como la altura sean mayores o iguales que 2, en caso
 *     contrario se debe mostrar un mensaje de error.
 */ 
 
 public class Ejercicio46{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura(minimo 2): ");    
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la anchura(minimo 2): ");    
    int ancho = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int espacios = 0;
    
    for(i = 1; i <= ancho; i++){
      System.out.print("*");
    }
    
    for(i = 2; i < altura; i++){
      System.out.print("\n*");
      for(espacios = 2; espacios < ancho;espacios++){
        System.out.print(" ");
        }
      System.out.print("*");
    }
    System.out.println();
    
    for(i = 1; i <= ancho; i++){
      System.out.print("*");
    }
  }
}
