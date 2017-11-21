/**
 * Numeros Aleatorios
 *
 * 1. Escribe un programa que muestre la tirada de tres dados. Se debe mostrar
 *     también la suma total (los puntos que suman entre los tres dados).
 */ 
 
 public class Ejercicio01{
  public static void main(String[] args) {
    
    int tirada = 0;
    int suma = 0;
    
    for(int i = 0; i < 3; i++) {
      tirada = (int)(Math.random() * 6) + 1;
      suma += tirada;
      
      switch(tirada) {
      case 1:
        System.out.println("⚀");
        break;
      case 2:
        System.out.println("⚁");
        break;
      case 3:
        System.out.println("⚂");
        break;
      case 4:
        System.out.println("⚃");
        break;
      case 5:
        System.out.println("⚄");
        break;
      case 6:
        System.out.println("⚅");
        break;
      default:
      
      }
    }
    System.out.print("Suma: " + suma);
  }
}
