/**
 * Numeros Aleatorios
 *
 * 21. Realiza un programa que genere una secuencia de cinco monedas de curso
 *     legal lanzadas al aire. Las monedas disponibles son de 1 céntimo, 2 céntimos,
 *     5 céntimos, 10 céntimos, 20 céntimos, 50 céntimos, 1 euro y 2 euros. Las dos
 *     posiciones posibles son cara y cruz.
 */ 
 
 public class Ejercicio21{
  public static void main(String[] args) {
    
    String monedaString = "";
    String posicionString = "";
    
    for(int i = 1; i <= 5;i++){
      int moneda = (int)(Math.random() * 8) + 1;
      switch(moneda){
        
        case 1:
          monedaString = "1 centimo ";
          break;
        case 2:
          monedaString = "2 centimos ";
          break;
        case 3:
          monedaString = "5 centimos ";
          break;
        case 4:
          monedaString = "10 centimos ";
          break;
        case 5:
          monedaString = "20 centimos ";
          break;
        case 6:
          monedaString = "50 centimos ";
          break;
        case 7:
          monedaString = "1 euros ";
          break;
        case 8:
          System.out.print("2 euros ");
          break;
        default:
        }
        
        int posicion = (int)(Math.random() * 2) + 1;
        
        switch(posicion){
          
          case 1:
            posicionString = "Cara";
            break;
          case 2:
            posicionString = "Cruz";
            break;
          default:
          }
      System.out.println(monedaString + " -- " + posicionString);
    }
  } 
}
