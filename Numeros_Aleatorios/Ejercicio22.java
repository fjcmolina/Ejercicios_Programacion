/**
 * Numeros Aleatorios
 *
 * 22. Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
 *     aleatorio. La cabeza se representará con el carácter @ y se debe colocar
 *     exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
 *     el cuerpo irá serpenteando de la siguiente manera: se generará de forma
 *     aleatoria un valor entre tres posibles que hará que el siguiente carácter se
 *     coloque una posición a la izquierda del anterior, alineado con el anterior o una
 *     posición a la derecha del anterior. La longitud de la serpiente se pedirá por
 *     teclado y se supone que el usuario introducirá un dato correcto.
 */ 
 
 public class Ejercicio22{
  public static void main(String[] args) {
    
    System.out.print("Introduzca la longitud de la serpiente: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    //pintamos la cabeza de la serpiente de forma fija
    System.out.println("            @");
    
    int serpiente = 13;
    
    while(longitud > 1){
      
      serpiente += (int)(Math.random() * 3) - 1;
      
      for(int i = 1; i < serpiente;i++){
        System.out.print(" ");
        }
      
      System.out.println("#");
      longitud--;
      }
  }
}
