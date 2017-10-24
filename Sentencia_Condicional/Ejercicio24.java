/**
 * Sentencia Condicional
 *
 * 24. Escribe un programa que genere la nomina (bien desglosada) de un empleado
 *     segun las siguientes condiciones:
 * 
 *      •Se pregunta el cargo del empleado ( 1. Programador Junior, 2. Programador
 *       Senior, 3. Jefe de Proyecto), los dias que ha estado de viaje visitando
 *       clientes durante el mes y su estado civil (1. Soltero, 2. Casado)
 *      •El sueldo base segun el cargo es de 950, 1200 y 1600 euros segun si se
 *       trata de programador junior, programdor senior o un jefe de proyecto
 *       respectivamente.
 *      •Por cada dia de viaje visitando clientes se pagan 30 euros extra en
 *       concepto de dietas. Al sueldo neto hay que restarle el IRPF, que sera
 *       de un 25% en caso de estar soltero y un 20% en caso de estar casado.
 */

public class Ejercicio24{
  public static void main(String[] args) {
    
    System.out.println("Vamos a genrar la nomina de un empleado");
    System.out.print("¿Que cargo ocupa el empleado?(Programador Junior, 2. Programador Senior, 3. Jefe de Proyecto) ");
    String cargo = System.console().readLine();
    
    System.out.print("¿Cuantos dias ha estado de viaje visitando clientes? ");
    String linea = System.console().readLine();
    int dias = Integer.parseInt(linea);
    
    
    System.out.print("Estado civil(Soltero/Casado):");
    String estado = System.console().readLine();
    
    double sueldo = 0;
    
    switch(cargo) {
      
      case "Programador Junior":
        sueldo = 950;
        break;
      case "Programador Senior":
        sueldo = 1200;
        break;
      case "Jefe de Proyecto":
        sueldo = 1600;
        break;
      default:
        System.out.println("El cargo introducido no es correcto\n");
        
      }
      
    double sueldoCargo = sueldo + (dias * 30);
    System.out.printf("El sueldo del cargo con las horas extras es de  %.2f euros\n",sueldoCargo);
      
    double irpf = 0;
    
    switch (estado) {
      
      case "Soltero":
        irpf = sueldo * 0.25;
        break;
      case "Casado":
        irpf = sueldo * 0.20;
        break;
      default:
        System.out.println("El estado civil no es correcto\n");
      }
      
    double sueldoTotal = sueldoCargo - irpf;
    System.out.printf("El sueldo total del empleado es %.2f euros\n",sueldoTotal);
      
    
    
    
  }
}
