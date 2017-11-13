/**
 * Bucles
 *
 * 37. Realiza un conversor del sistema decimal al sistema de “palotes”.
 */ 
 
 public class Ejercicio37{
  public static void main(String[] args) {
    
    System.out.print("Introduce un numero entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    int numero = numeroIntroducido;
    int numeroReves = 0;
    int digito = 0;
    
    while (numero > 0) {
      numeroReves = (numeroReves * 10) + (numero % 10);
      numero /= 10;
      digito++;
    }
    
    int cifra = 0;
    
    for(int i = 0; i < digito; i++){
      cifra = (numeroReves % 10);
      numeroReves /= 10;
      
      for(int j = 0; j < cifra; j++){
        System.out.print("|");
        }
        
      if(i < digito-1){
        System.out.print("-");
        }
    }
  }
}
