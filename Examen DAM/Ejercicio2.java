 public class Ejercicio2{
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.println("Introduce la anchura de la abndera en cm: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Quieres escudo bordado?(s/n)");
    String respuesta = System.console().readLine();
    
    double escudo = 0;
    
    if(respuesta.equals("s")){
      escudo = 2.50;
      }
    if (respuesta.equals("n")){
      escudo = 0;
      }
    int bandera = altura * anchura;
    
    System.out.println("Gracias, aqui tienes el desglose de su compra:");
    System.out.print("La bandera de " + bandera + "cm2 : "+ (bandera/100) +" euros\n");
    System.out.print("Escudo: " + escudo+ " euros\n");
    System.out.print("Gastios de envio:  3,25 euros\n");
    
    
    double total = escudo + (bandera/100) + 3.25;
    System.out.print("Total: " + total + " euros");
  }
}
