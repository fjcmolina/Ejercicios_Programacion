/**
 * Bucles
 *
 * 40. Realiza un programa que pinte por pantalla un rombo hueco hecho con
 *     asteriscos. El programa debe pedir la altura. Se debe comprobar que la altura
 *     sea un número impar mayor o igual a 3, en caso contrario se debe mostrar un
 *     mensaje de error.
 */ 
 
 public class Ejercicio40{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura del rombo(numero impar igual o mayor que 3): ");    
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    int altura = 1;
    int espacios = alturaIntroducida/2;
    int hueco = 0;
    if((alturaIntroducida < 3) || ((alturaIntroducida % 2) == 0)){
      System.out.print("El numero introducido no es correcto");
    }else{
        //parte de arriba
        while( altura <= alturaIntroducida/2 + 1){
          
          for(int i = 1; i <= espacios; i++){
            System.out.print(" ");
            }
            
          System.out.print("*");
          
          for(int i = 1; i < hueco; i++){
            System.out.print(" ");
            }
            
          if(altura > 1){
          System.out.print("*");
            }
          System.out.println();
          
          altura++;
          espacios--;
          hueco += 2;
        }
        
        //parte de abajo
        
        hueco = alturaIntroducida -3;
        espacios = 1;
        altura = 0;
        
        while( altura <alturaIntroducida/2){
          
          for(int i = 1; i <= espacios; i++){
            System.out.print(" ");
            }
            
          System.out.print("*");
          
          for(int i = 1; i < hueco; i++){
            System.out.print(" ");
            }
            
          if(altura < alturaIntroducida/2 -1){ 
            System.out.print("*");
            }
            
          System.out.println();
          
          altura++;
          espacios++;
          hueco -= 2;
        }
      }
  }
}
