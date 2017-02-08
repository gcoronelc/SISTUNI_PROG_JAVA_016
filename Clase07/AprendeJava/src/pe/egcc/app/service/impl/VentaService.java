package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.NubeSpec;
import pe.egcc.app.service.spec.PrintSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaService implements NubeSpec, PrintSpec{

  @Override
  public void grabar(String data) {
    System.out.println("Comprobante en la nube.");
  }

  @Override
  public void print() {
    System.out.println("Venta impresa.");
  }
  
}
