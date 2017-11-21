/**
 * Numeros Aleatorios
 *
 * 10. Realiza un programa que pinte por pantalla diez líneas formadas por caracteres.
 *     El carácter con el que se pinta cada línea se elige de forma aleatoria
 *     entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
 *     aleatoria entre 1 y 40 caracteres.
 */ 
 
 public class Ejercicio10{
  public static void main(String[] args) {
    
    int longitud;
    String pinta = "";
    
    for(int linea = 1; linea <= 10; linea++){
      
      longitud = (int)(Math.random()*40) +1;
      int caracter = (int)(Math.random()*6) +1;
      
      switch(caracter){
        case 1:
          pinta = "*";
          break;
        case 2:
          pinta = "-";
          break;
        case 3:
          pinta = "=";
          break;
        case 4:
          pinta = ".";
          break;
        case 5:
          pinta = "|";
          break;
        case 6:
          pinta = "@";
          break;
        }
      for(int i = 1; i <= longitud; i++) {
        System.out.print(pinta);
      }
      System.out.println();
    }
  }
}
