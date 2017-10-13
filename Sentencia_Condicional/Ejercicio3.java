/**
 * Sentencia Condicional
 *
 * 3. Escribe un programa en que dado un numero del 1 a 7 escriba el 
 *    correspondiente nombre del dia de la semana.
 */

public class Ejercicio3{
  public static void main(String[] args) {
    
    System.out.println("Vamos a realizar un programa que muestra un dia de la semana");
    System.out.print("Introduce una numero del 1 al 7: ");
    
    int semana = Integer.parseInt(System.console().readLine());
    String dia;
    
    switch(semana) {
      
     case 1:
     dia = "Lunes";
     break; 
     
     case 2:
     dia = "Martes";
     break;
     
     case 3:
     dia = "Miercoles";
     break;
     
     case 4:
     dia = "Jueves";
     break;
     
     case 5:
     dia = "Viernes";
     break;
     
     case 6:
     dia = "Sabado";
     break;
     
     case 7:
     dia = "Domingo";
     break;
     
     default:
     dia = "No existe el dia de la semana";
    }
    System.out.print("El dia del numero introducido es " + dia);
  }
}
