/**
 * Sentencia Condicional
 *
 * 16. Realiza un programa que nos diga si hay probabilidad de que nuestra
 *     pareja no esta siendo infiel. El programa ira haciendo preguntas que el 
 *     usuario contestara con un verdadero o falso. Cada pregunta contestada
 *     como verdadero sumara 3 puntos. Las oreguntas contestadas con falso no
 *     suman puntos. Utiliza el fichero test_infedelidad.txt para obtener las 
 *     preguntas y las conclusiones del programa.
 */

public class Ejercicio16{
  public static void main(String[] args) {
    
    String respuesta;
    int puntos = 0;
    
    System.out.println("Vamos a realizar un test de fidelidad de tu pareja");

    System.out.print("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("2. Ha aumentado sus gastos de vestuario.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("3. Ha perdido el interés que mostraba anteriormente por ti.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }

    System.out.print("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("5. No te deja que mires la agenda de su teléfono móvil.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
        
    System.out.print("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("9. Has notado que últimamente se perfuma más.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
    System.out.print("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.\n(v)erdadero o (f)also: ");
    respuesta = System.console().readLine();
    if ( respuesta.equals("v") ) {
      puntos += 3;
    }
    
  
    // Mostramos el resultado del test
    
    if ( puntos <= 10 ) {
      System.out.print("Tu pareja te es fiel. Por ahora...");
    }
    
    if ( (puntos > 11 ) && (puntos <= 22) ) {
      System.out.print("Ten cuidado con tu pareja, algo trama y puede que no te este siendo fiel");    
    }
    
    if ( puntos >= 22 ) {
      System.out.print("Lo siento, pero usted esta siendo victima de infidelidad");
    }
  }
  }

