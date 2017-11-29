/**
 * Numeros Aleatorios
 *
 * 18. Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
 *     sustituir el color blanco por colores más alegres. Realiza un programa que
 *     genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
 *     cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
 *     que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
 *     violeta y naranja.
 */ 
 
 public class Ejercicio18{
  public static void main(String[] args) {
    
    int c1 = 0;
    int c2 = 0;
    int c3 = 0;
    
    String color1 = "";
    String color2 = "";
    String color3 = "";
    
    do {
      c1 = (int)(Math.random() * 6);
      c2 = (int)(Math.random() * 6);
      c3 = (int)(Math.random() * 6);
    } while ((c1 == c2) || (c1 == c3) || (c2 == c3));
    
     for(int i = 1; i <= 3; i++){
       String colorString = "";
       int color = 1;
       
       switch(i) {
        case 0:
          color = c1;
          break;
        case 1:
          color = c2;
          break;
        case 2:
          color = c3;
          break;
        default:
      }
       
       switch(color){
        case 1:
          colorString = "Rojo ";
          break;
        case 2:
          colorString = "Azul ";
          break;
        case 3:
          colorString = "Verde ";
          break;
        case 4:
          colorString = "Amarillo ";
          break;
        case 5:
          colorString = "Violeta ";
          break;
        case 6:
          colorString = "Naranja ";
          break;
        default:
        }
      
      switch(i){
        
        case 1:
          color1 = colorString;
          break;
        case 2: 
          color2 = colorString;
          break;
        case 3:
          color3 = colorString;
          break;
        default:
        }
     }
    System.out.print(color1 + color2 + color3);
  }
}
