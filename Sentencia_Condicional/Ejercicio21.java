/**
 * Sentencia Condicional
 *
 * 21. Calcula la nota de un trimestre de la asignatura Programacion. El programa
 *     pedira las dos notas que ha sacado el alumno en los dos primeros controles.
 *     Si la media de los dos controles da un numero mayor o igual a 5, el  alumno
 *     esta aprobado y se mostrara la media. En caso de que la media sea un
 *     numero menor que 5, el alumno habra tenido que hacer el examen de
 *     recuperacion que se califica como apto o no apto, por tanto debe preguntar
 *     al usuario ¿cual ha sido el resultado de la recuperacion? (apto/no apto).
 *     Si el resultado de la recuperacion es apto, la nota sera un 5, en caso
 *     en caso contrario, se mantiene la nota media anterior.
 */

public class Ejercicio21{
  public static void main(String[] args) {
    
    double nota1;
    double nota2;
    String linea;
    
    System.out.println("Vamos a calcular la nota del trimestre de programacion");
    System.out.print("Introduzca la nota de tu primer examen: ");
    linea = System.console().readLine();
    nota1 = Double.parseDouble(linea);
    
    System.out.print("Introduza la nota de tu segundo examen: ");
    linea = System.console().readLine();
    nota2 = Double.parseDouble(linea);
    
    
    double notaFinal;
    notaFinal = ( nota1 + nota2)/2;
    
    if (notaFinal >= 5){
      System.out.println("¡Tienes aprobado el primer trimestre de programacion!");
      System.out.printf("La nota media es %.2f",notaFinal);
      }else{
        System.out.println("Debes realizar el examen de recuperacion");
      }
    System.out.print("¿Cual ha sido el resultado de la recuperacion? (apto/no apto)");
    String recuperacion = System.console().readLine();
    
    if (recuperacion.equals("apto")){
        System.out.print("La nota para el trimestre es de un 5");
      }else{
        System.out.printf("La nota de tu trimestre es %.2f ",notaFinal);
        }
  }
}
