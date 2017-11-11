public class Ejercicio4{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra el numero del digito introducido");
    System.out.println("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int numeroReves = 0;
    int numeroReves2 = 0;
    
    while (numero > 0){
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      if((numeroReves % 10 == 0) || (numeroReves % 10 == 8)){
        numeroReves /= 10;
        }
    }
    while(numeroReves > 0){
      numeroReves2 = ((numeroReves2 * 10) + (numeroReves % 10));
      numeroReves /= 10;
      }
    System.out.print("Despues de haber sido comido por el gusano el numero se queda: " + numeroReves2);
  }
}
