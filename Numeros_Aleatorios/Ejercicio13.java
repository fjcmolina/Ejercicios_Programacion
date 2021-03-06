/**
 * Numeros Aleatorios
 *
 * 13. Escribe un programa que simule la tirada de dos dados. El programa deberá
 *     continuar tirando los dados una y otra vez hasta que en alguna tirada los dos
 *     dados tengan el mismo valor.
 */ 
 
 public class Ejercicio13{
  public static void main(String[] args) {
    
    int tirada1 = 0;
    int tirada2 = 0;
    
    do{
      for(int i = 0; i < 2; i++) {
        tirada1 = (int)(Math.random() * 6) + 1;
        
        switch(tirada1) {
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
        
        tirada2 = (int)(Math.random() * 6) + 1;
        switch(tirada2) {
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
    }while(tirada1 != tirada2);
  }
}
