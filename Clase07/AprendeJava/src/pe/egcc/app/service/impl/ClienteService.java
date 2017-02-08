package pe.egcc.app.service.impl;

import java.util.List;
import pe.egcc.app.model.Cliente;
import pe.egcc.app.service.spec.CrudSpec;
import pe.egcc.app.service.spec.PrintSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class ClienteService implements CrudSpec<Cliente>, PrintSpec{

  @Override
  public void insertar(Cliente bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void actualizar(Cliente bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void eliminar(int id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public Cliente read(int id) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Cliente> read(Cliente bean) {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public List<Cliente> readAll() {
    throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  }

  @Override
  public void print() {
    System.out.println("Cliente impreso.");
  }

  
}
