/**
 * Numeros Aleatorios
 *
 * 3. Igual que el ejercicio anterior pero con la baraja española. Se utilizará la baraja
 *    de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 */ 
 
 public class Ejercicio03{
  public static void main(String[] args) {
    
    String carta = "";
    String palo = "";
    
    int numeroPalo = (int)(Math.random()*4) + 1;
    switch(numeroPalo){
      case 1: 
        palo = "oro";
        break;
      case 2: 
        palo = "copa";
        break;
      case 3: 
        palo = "basto";
        break;
      case 4: 
        palo = "espadas";
        break;
      }
      
    int numeroCarta = (int)(Math.random()*11) + 1;
    switch(numeroPalo){
      case 1: 
        carta = "AS";
        break;
      case 11: 
        carta = "Sota";
        break;
      case 12: 
        carta = "Caballo";
        break;
      case 13: 
        carta = "Rey";
        break;
      default:
        carta = String.valueOf(numeroCarta);
      }
    System.out.print(carta + " de " + palo);
  }
}
