/**
 * Salida de datos por pantalla
 *
 * 5. Modifica el programa anterior añadiendo colores. Puedes mostrar cada
 *    asignatura de un color diferente.
 */
 
 
 public class Ejercicio5{
  public static void main(String[] args) {
    
    String rojo = "\033[31m";  //rojo= FOL
    String verde = "\033[32m";   //verde= sistema
    String naranja = "\033[33m";  //naranja=programacion
    String azul = "\033[34m";   //azul= base de datos
    String morado = "\033[35m";   //morado= entorno
    String celeste = "\033[36m";  //celeste= lenguaje
    String blanco = "\033[37m";   
    
    System.out.println( naranja + "Hora\tLunes\tMartes\tMierc\tJueves\tViernes");
    System.out.println(blanco + "******\t******\t******\t******\t******\t******\n");
    System.out.println(blanco +"8:15" + verde + "\tSistem"+ naranja +"\tProg"+ verde +"\tSistem"+ naranja +"\tProg\tProg");
    System.out.println(blanco +"9:15" + verde + "\tSistem"+ naranja+"\tProg"+ verde +"\tSistem"+ naranja+"\tProg\tProg");
    System.out.println(blanco +"10:15"+ verde +"\tSistem"+ naranja +"\tProg"+ verde+"\tSistem"+naranja +"\tProg"+ morado+"\tEntor");
    System.out.println(blanco +"11:15"+ blanco +"\tRecreo\tRecreo\tRecreo\tRecreo\tRecreo");
    System.out.println(blanco +"11:45"+ rojo +"\tFOL"+ azul +"\tBBDD" + morado + "\tEntor"+ azul +"\tBBDD"+ celeste+ "\tLengu");
    System.out.println(blanco +"12:45"+ rojo +"\tFOL"+ azul +"\tBBDD"+ morado + "\tEntor"+ azul +"\tBBDD"+celeste +"\tLengu");
    System.out.println(blanco +"13:45"+ rojo +"\tFOL"+ azul +"\tBBDD"+ celeste +"\tLengu"+ azul +"\tBBDD"+ celeste+"\tLengu");
  }
}

