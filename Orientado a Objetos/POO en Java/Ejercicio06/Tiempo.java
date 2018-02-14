/*
 * Clase tiempo
 */
package ejercicio06;

/**
 *
 * @author Francis
 */
public class Tiempo {

  private int segundos;
  private int minutos;
  private int horas;

  //constructor
  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
//setter

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public void setHoras(int horas) {
    this.horas = horas;
  }
  //getter

  public int getSegundos() {
    return segundos;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getHoras() {
    return horas;
  }

  @Override
  public String toString() {
    return horas + " horas " + minutos + " minutos " + segundos + " segundos";
  }

  public Tiempo suma(int h, int m, int s) {
    int resultadoHoras = this.horas + h;
    int resultadoMinutos = this.minutos + m;
    int resultadoSegundos = this.segundos + s;

    if (this.segundos + s >= 60) {
      resultadoMinutos += (this.segundos + s) / 60;
      resultadoSegundos = (this.segundos + s) - (60 * resultadoMinutos);
    }

    if (this.minutos + m >= 60) {
      resultadoMinutos += (this.minutos + m) - (60 * resultadoHoras);
      resultadoHoras = resultadoHoras + (this.minutos + m) / 60;
    }

    return new Tiempo(resultadoHoras, resultadoMinutos, resultadoSegundos);
  }

  public Tiempo resta(int h, int m, int s) {
    int resultadoSegundos = (h * 3600) + (m * 60) + s;
    
    int resultadoHoras = resultadoSegundos / 3600;
    resultadoSegundos -= resultadoHoras * 3600;
    
    int resultadoMinutos = resultadoSegundos / 60;
    resultadoSegundos -= resultadoMinutos * 60;
    
    return new Tiempo(resultadoHoras, resultadoMinutos, resultadoSegundos);
  }

}
