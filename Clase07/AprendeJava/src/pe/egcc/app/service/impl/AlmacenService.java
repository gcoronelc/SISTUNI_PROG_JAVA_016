package pe.egcc.app.service.impl;

import pe.egcc.app.service.spec.PrintSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class AlmacenService implements PrintSpec{

  @Override
  public void print() {
    System.out.println("Almacen impreso.");
  }
  
}
