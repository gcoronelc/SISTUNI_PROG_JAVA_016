package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.ClienteService;
import pe.egcc.app.service.spec.CrudSpec;
import pe.egcc.app.service.spec.PrintSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba05 {

  public static void main(String[] args) {
    
    PrintSpec o1 = new ClienteService();
    ClienteService o2 = (ClienteService) o1;
    CrudSpec o3 = o2;
    PrintSpec o4 = o2;
    
    System.out.println("ok");
    
  }
}
