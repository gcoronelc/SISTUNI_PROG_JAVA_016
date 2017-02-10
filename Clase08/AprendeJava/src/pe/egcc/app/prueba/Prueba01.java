package pe.egcc.app.prueba;

import pe.egcc.app.util.EurekaUtil;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    int[] notas = new int[5];
    
    EurekaUtil.print(notas);
    
    notas[0] = 20;
    notas[3] = 18;
    
    EurekaUtil.print(notas);
    
  }
  
  
}
