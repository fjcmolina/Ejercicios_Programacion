/**
 * Salida de datos por pantalla
 *
 * 9. Escribe un programa que pinte por pantalla alguna escena - el campo, la 
 *    habitación de una casa, un aula,etc. - o algun objeto animado o inanimado
 *    - un coche, un gato, una taza de café, etc. Ten en cuneta que puedes
 *    utilizar caracteres como *, +, <, etc. ¡Echale imaginacion!
 */


public class Ejercicio9{
  public static void main(String[] args) {
    
    String rojo = "\033[31m", verde = "\033[32m", naranja = "\033[33m";
    String azul = "\033[34m", morado = "\033[35m", blanco = "\033[37m";

    System.out.println(rojo);
    System.out.println("                          ██          ██");
    System.out.println("                            ██      ██");
    System.out.println("                          ██████████████  ");
    System.out.println("                        ████  ██████  ████  ");
    System.out.println("                      ██████████████████████");
    System.out.println("                      ██  ██████████████  ██");
    System.out.println("                      ██  ██          ██  ██");
    System.out.println("                            ████  ████");
    
    System.out.println("             ");
    System.out.println("             ");
    
    System.out.println(naranja);
    System.out.println(azul +"     ████   █████  ██   ██ █████  "+ verde +"  ████  ██  ██ █████ █████");
    System.out.println(azul +"    ██     ██   ██ ███ ███ ██     "+ verde +" ██  ██ ██  ██ ██    ██  ██");
    System.out.println(azul +"    ██ ███ ██   ██ ██ █ ██ ████   "+ verde +" ██  ██ ██  ██ ████  █████");
    System.out.println(azul +"    ██  ██ ███████ ██   ██ ██     "+ verde +" ██  ██  ████  ██    ██  ██");
    System.out.println(azul +"     ████  ██   ██ ██   ██ █████  "+ verde +"  ████    ██   █████ ██  ██");
    
    System.out.println("             ");
    System.out.println("             ");
    System.out.println("             ");
    System.out.println("             ");
    
    System.out.println(azul);
    
    System.out.println("    ██                   ███                   ███                                ███");
    System.out.println("     ████              ███                       ███                            ███");
    System.out.println("        ███████████████                            ██████████████████████████████");
    
    
    
    System.out.println("             ");
    System.out.println("             ");
    
    System.out.println(rojo +"               ███████████           "+ naranja +"              ████████        "); 
    System.out.println(rojo +"              █████████████          "+ naranja +"            ████████████      ");
    System.out.println(rojo +"             ███████████████         "+ naranja +"          █████████████████   ");
    System.out.println(rojo +"            ████"+ blanco +"███"+ rojo +"███"+blanco +"███"+ rojo +"████        "+ naranja +"             ███████████████  ");
    System.out.println(rojo +"            ████"+ blanco +"███"+ rojo +"███"+blanco +"███"+ rojo +"████        "+ naranja +"                ████████████  ");
    System.out.println(rojo +"           ██████████████████        "+ naranja +"                    ████████  ");
    System.out.println(rojo +"           ███████████████████       "+ naranja +"                ████████████  ");
    System.out.println(rojo +"           ███████████████████       "+ naranja +"             ██████████████   ");
    System.out.println(rojo +"           ███████████████████       "+ naranja +"          ███████████████     ");
    System.out.println(rojo +"           █████  █████  █████       "+ naranja +"            ████████████      ");
    System.out.println(rojo +"            ███    ███    ███        "+ naranja +"              ████████        ");
    
    System.out.println("             ");
    System.out.println("             ");
    
    System.out.println(azul);
    
    System.out.println("        ██████████████████████████████                          ██████████████████████████████");
    System.out.println("     ████                            ███                      ███                            ███");
    System.out.println("    ██                                ███                   ███                                ███");
    
  }
}
