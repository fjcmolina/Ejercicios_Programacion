public class Ejercicio4{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra el numero del digito introducido");
    System.out.println("Introduce un numero: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    int resultado = 0;
    int numeroReves = 0;
    int temporal = numero;
    
    while (temporal > 0){
      numeroReves = (numeroReves * 10) + (temporal % 10);
      temporal /= 10;
    }
    temporal = numero;
    
    while(temporal > 0){
      numeroReves = temporal % 10;
      if((temporal != 0) && (temporal != 8)){
        resultado = (resultado * 10) + numeroReves;
        }
      temporal /= 10;
      }
    
    System.out.print("Despues de haber sido comido por el gusano el numero se queda: " + resultado);
  }
}
