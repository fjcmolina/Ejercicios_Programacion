public class Ejercicio3{
  public static void main(String[] args) {
    
    System.out.print("Introduce la altura(minimo 5): ");    
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce los espacios entre los numeros: ");    
    int espacios = Integer.parseInt(System.console().readLine());
    
    int i = 0;
    int j = 0;
    for(i = 1; i <= altura; i++){
      System.out.print("*");
    
    for(j = 1; j <= espacios;j++){
      System.out.print(" ");
      }
    if((i == 1) || (i == 3) || (i == altura)){
      System.out.print("****");
      }else if (i == 2){
        System.out.print("*   ");
        }else{
          System.out.print("   *");
          }
          
    for(j = 1; j <=espacios;j++){
      System.out.print(" ");
      }
    if((i == 1) || (i == 3) || (i == altura)){
      System.out.print("****");
      }else if (i == 2){
        System.out.print("*   ");
        }else{
          System.out.print("   *");
          }
    System.out.println();
    }
  }  
}
