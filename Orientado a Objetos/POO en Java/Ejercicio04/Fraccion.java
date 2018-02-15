/*
 * Clase fraccion
 */
package ejercicio04;

/**
 *
 * @author Francis
 */
public class Fraccion {

  //atributos
  private int numerador;
  private int denominador;
  private int signo;

  public Fraccion(int n, int d) {
    if (d == 0) {
      System.out.println("No puede tener el denominador con el valor 0");
    } else {
      if (n * d < 0) {
        this.signo = -1;
      } else {
        this.signo = 1;
      }
      this.numerador = Math.abs(n);
      this.denominador = Math.abs(d);
    }
  }

  public int getNumerador() {
    return this.numerador;
  }

  public int getDenominador() {
    return this.denominador;
  }

  @Override
  public String toString() {
    if (signo == -1) {
      return "-" + this.numerador + "/" + this.denominador;
    } else {
      return this.numerador + "/" + this.denominador;
    }
  }

  //metodos
  public Fraccion invierte() {
    return new Fraccion(this.signo * this.denominador, this.numerador);
  }

  public Fraccion simplifica() {
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;

    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }

    return new Fraccion(s * n, d);
  }

  public Fraccion multiplica(int n) {
    return new Fraccion(this.signo * this.numerador * n, this.denominador);
  }

  public Fraccion multiplica(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getNumerador(), this.denominador * f.getDenominador());
  }

  public Fraccion divide(int n) {
    return new Fraccion(this.signo * this.numerador, this.denominador * n);
  }

  public Fraccion divide(Fraccion f) {
    return new Fraccion(this.signo * this.numerador * f.getDenominador(), denominador * f.getNumerador());
  }
}
