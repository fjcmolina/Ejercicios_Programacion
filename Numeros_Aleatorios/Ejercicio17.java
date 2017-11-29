/**
 * Numeros Aleatorios
 *
 * 17. Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
 *     Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
 *     serán de 4 unidades. No hay que comprobar que los datos se introducen
 *     correctamente; podemos suponer que el usuario los introduce bien. Dentro
 *     de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
 *     situado en cualquiera de las posiciones que quedan en el hueco que forma el
 *     rectángulo.
 */ 
 
 public class Ejercicio17{
  public static void main(String[] args) {
    
    System.out.println("Vamos a dibujar una pecera");
    
    System.out.print("Introduce la altura(minimo 4): ");    
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce la anchura(minimo 4): ");    
    int ancho = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int espacios = 0;
    int posicionPez = 0;
    int posicion = (int)Math.random();
    
    // Se pinta el cuadrado de la pecera
    for(i = 1; i <= ancho; i++){
      System.out.print("*");
    }
    
    for(i = 2; i < altura; i++){
      System.out.print("\n*");
      for(espacios = 2; espacios < ancho;espacios++){
        // pintar pez if que pinte pez else espacio
       if (posicion == posicionPez) {
          System.out.print("&");
        } else {
          System.out.print(" ");
        }
        posicion++;
        }
      System.out.print("*");
    }
    System.out.println();
    
    for(i = 1; i <= ancho; i++){
      System.out.print("*");
    }
  }
}
