
package pe.egcc.promedioapp.controller;

import pe.egcc.edutec.service.Promedio;

/**
 *
 * @author Gustavo Coronel
 */
public class PromController {
  
  private Promedio service;

  public PromController() {
    service = new Promedio();
  }
  
  public int promediar(int n1, int n2) {
    return service.promediar(n1, n2);
  }
  
}
