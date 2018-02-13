/*
 *  1. Crea las clases Animal, Mamifero, Ave, Gato, Perro, Canario, Pinguino y Lagarto. Crea,
 *     al menos, tres métodos específicos de cada clase y redefne el/los método/s
 *     instancien objetos y se les apliquen métodos.
 */
package ejercicio03;

/**
 *
 * @author Francis
 */
public class Ejercicio03 {

  public static void main(String[] args) {
    Pinguino pingu = new Pinguino(Sexo.MACHO);

    pingu.vuela();
    pingu.huevo();

    System.out.println();

    Gato misifu = new Gato(Sexo.HEMBRA);
    Gato garfield = new Gato(Sexo.MACHO);
    
    garfield.peleaCon(misifu);
    misifu.amamanta();
    misifu.come("lasaña");
    
    System.out.println();
    System.out.println();
    Lagarto mushu = new Lagarto();

    mushu.sol();
  }

}
