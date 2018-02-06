/*
 * Clase Persona
 */
package ejercicio01;

/**
 *
 * @author Francis
 */
public class Persona {
  String nombre;
  String apellidos;
  double peso;

  public Persona() {
  }

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public Persona(String nombre, String apellidos, double peso) {
    this.nombre = nombre;
    this.apellidos = apellidos;
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return "Persona\n-------\n" + "Nombre: " + nombre + "\nApellidos: " + apellidos + "\nPeso: " + peso + " kg";
  }

  public void espolea(String actitud) {
    switch (actitud) {
      case "agresiva":
        System.out.println("Ghiaaa!!");
        break;
      case "cariñosa":
        System.out.println("Corre Caballito");
        break;
      default:
        System.out.println("Arre Arre");
    }
  }
}
