/**
 * Sentencia Condicional
 *
 * 23. Escribe un programa que calcule el precio final de un producto segun su
 *     base imponible (precio antes de los impuestos), el tipo de IVA aplicado
 *     (general, reducido y superreducido) y el codigo promocional. Los tipos de
 *     IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
 *     Los codigos promocionales pueden ser nopro, mitad, meno5 o 5porc que
 *     significan respectivamente que no se aplica promocion, el precio se reduce
 *     la mitad, se descuentan 5 euros o se descuenta el 5%. El ejercicio se da 
 *     por bueno si se muestran los valores correctos, aunque los numeros no 
 *     esten tabulados.
 */

public class Ejercicio23{
  public static void main(String[] args) {
    
    double baseImponible;
    String linea;
    
    System.out.println("Vamos a calcular el precio final de un producto");
    System.out.print("Introduce el precio del articulo sin IVA :");
    linea = System.console().readLine();
    baseImponible = Double.parseDouble(linea);
    
    System.out.print("Introduce el tipo de IVA(general, reducido y superreducido) :");
    String tipoIva = System.console().readLine();
    
    System.out.print("Introduce el codigo promocional(nopro, mitad, meno5 o 5porc) :");
    String promo = System.console().readLine();
    
    int ivaValor = 0;
    
    switch (tipoIva){     // Tipo de iva que vamos a utilizar en la factura
      
      case "general":
        ivaValor = 21;
        break;
      case "reducido":
        ivaValor = 10;
        break;
      case "superreducido":
        ivaValor = 4;
        break;
      default:
        System.out.println("El tipo de IVA introducido no es correcto");
      }
      
    double iva = (baseImponible * ivaValor)/100;
    double precioSinDescuento = Double.parseDouble(linea);
      
      
    double descuento = 0;
      
    switch (promo) {    //Tipo de descuento que se vamos aplicar
      case "nopro":
        break;
      case "mitad":
        descuento = precioSinDescuento/2;
        break;
      case "meno5":
        descuento = 5;
        break;
      case "5porc":
        descuento = precioSinDescuento * 0.05;
        break;
      default:
      System.out.println("El tipo de descuento no es correcto");
        }
        
    double total = precioSinDescuento - descuento;
        
    System.out.printf("Base Imponible : %.2f \n", baseImponible);
    System.out.printf("IVA :            %.2f \n",iva);
    System.out.printf("Precio con IVA   %.2f\n",precioSinDescuento);
    System.out.printf("Descuento:       %.2f\n",descuento);
    System.out.println("*********************");
    System.out.printf("Total:           %.2f\n",total);
    
  }
}
