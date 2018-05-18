/*
 * Clase Cancion
 */
package ejercicio2;

/**
 *
 * @author Francis
 */
public class Cancion {
  
  String codigo;
  String titulo;

  public Cancion(String codigo, String titulo) {
    this.codigo = codigo;
    this.titulo = titulo;
  }

  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  @Override
  public String toString() {
    return "Cancion{" + "codigo=" + codigo + ", titulo=" + titulo + '}';
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
  }
  
  
}
