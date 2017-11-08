/**
 * Bucles
 *
 * 26. Realiza un programa que pida primero un número y a continuación un dígito.
 *     El programa nos debe dar la posición (o posiciones) contando de izquierda a
 *     derecha que ocupa ese dígito en el número introducido.
 */ 
 
 public class Ejercicio26{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra el numero del digito introducido");
    System.out.println("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce un digito");
    int digito = Integer.parseInt(System.console().readLine());
  
    int numeroReves = 0;
    int digitoElegido = 0;
    
    while (numero > 0){
      numeroReves= (numeroReves * 10) + (numero % 10);
      numero /= 10;
      }
    for(int i = 1; i <= digito; i++){
      digitoElegido= (((digito * 10) + (numeroReves % 10)) - (digito * 10));
      numeroReves /= 10;
    }

     System.out.println("El numero del digito elegido es " + digitoElegido);
    
  }
}
