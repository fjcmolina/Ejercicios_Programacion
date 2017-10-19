/**
 * Sentencia Condicional
 *
 * 12. Realiza un minucuestionario de 10 preguntas tipo test sobre las asignaturas
 *     que se imparten en este curso. Cada pregunta acertada sumara un punto.
 *     El programa mostrara al final la calificacion obtenida. Pasale el
 *     minucuestionario a tus compañeros y pideles que lo hagan a ver que tal
 *     andan de conocimientos en las diferentes asignaturas del curso.
 */

public class Ejercicio12{
  public static void main(String[] args) {
    
    int puntos = 0;
    String respuesta;
        
    System.out.println("Vamos a realizar un cuestionario sobre las asignaturas de DAW");
        
    System.out.println("1. ¿Cuál de los siguientes tipos de datos de Java no es numerico?");
    System.out.println("a) int\nb) string\nc) float"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("b")) {
        puntos++;
        }

    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos");
    System.out.println("a) XML\nb) SELECT\nc) SQL"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("c")) {
        puntos++;
        }

    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a) href\nb) a\nc) link"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("b")) {
          puntos++;
        }
        
    System.out.println("4. ¿Que comando se utiliza para copiar en la archivos o directorios en Linux?");
    System.out.println("a)cp\nb)rm\nc)ls"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("a")) {
        puntos++;
        }
        
    System.out.println("5. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM");
    respuesta = System.console().readLine();  
      if (respuesta.equals("a")) {
        puntos++;
        }
        
    System.out.println("6. ¿Que tipo de licencia pddemos acceder al codigo fuente del software?");
    System.out.println("a) Propietario\nb) Libre\nc) Creative Commons"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("b")) {
        puntos++;
        }
    System.out.println("7. ¿Que tipo de traductor es Java?");
    System.out.println("a) Interprete\nb) Tipo especial\nc) Compilado"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("b")) {
        puntos++;
        }
    System.out.println("8. ¿Que sistema numerico tiene de base 8?");
    System.out.println("a) Binario\nb) Hexadecimal\nc) Octal"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("c")) {
        puntos++;
        }
    System.out.println("9. ¿Que comando se utiliza en la consola de Linux para situarte en un directorio?");
    System.out.println("a) cd\nb) ls\nc) mv"); 
    respuesta = System.console().readLine();  
      if (respuesta.equals("a")) {
        puntos++;
        }
        
        System.out.println("\nHas obtenido " + puntos + " puntos sobre 5");    
      }
}
