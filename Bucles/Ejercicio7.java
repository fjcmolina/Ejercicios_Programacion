/**
 * Bucles
 *
 * 7. Realiza el control de acceso a una caja fuerte. La combinacion sera un
 *    numero de 4 cifras. El programa nos pedira la combinacion para abrirla.
 *    Si no acertamos, se nos mostrara el mensaje "Lo siento, esa no es la
 *    combinacion" y si acertamos se nos dira "La caja fuerte se ha abierto
 *    satisfactoriamente".Tendremos cuatro oportunidades para abrir la caja fuerte
 */
 
 public class Ejercicio7{
  public static void main(String[] args) {
    
    int intentos = 4;
    int clave;
    boolean correcta = false;
    
    do{
      System.out.println("Introduzca la clave de la caja fuerte");
      clave = Integer.parseInt(System.console().readLine());
      
      if (clave == 2797){
        correcta = true;
        System.out.println("La clave es correcta");
        }else{
          System.out.println("La clave es incorrecta");
          }
          
      intentos--;
    }
    while((intentos > 0) && (intentos <= 4) );
    
    if (correcta){
      System.out.println("La caja fuerte se ha abierto");
      }else{
        System.out.println("Lo siento, has agotado los 4 intentos para abrir la caja fuerte");
        }
  }
}
