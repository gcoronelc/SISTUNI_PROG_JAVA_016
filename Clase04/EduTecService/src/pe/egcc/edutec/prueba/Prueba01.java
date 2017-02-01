package pe.egcc.edutec.prueba;

import pe.egcc.edutec.service.Promedio;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    Promedio bean = new Promedio();
    System.out.println("15 y 18: " + bean.promediar(15, 18));
  }
    
}
