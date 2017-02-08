package pe.egcc.app.prueba;

import pe.egcc.app.service.impl.AlmacenService;
import pe.egcc.app.service.impl.ClienteService;
import pe.egcc.app.service.impl.ProductoService;
import pe.egcc.app.service.impl.VentaService;
import pe.egcc.app.service.spec.PrintSpec;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {

    ClienteService bean1 = new ClienteService();
    ProductoService bean2 = new ProductoService();
    VentaService bean3 = new VentaService();
    
    AlmacenService bean4 = new AlmacenService();
    
    PrintSpec bean5 = new PrintSpec() {

      @Override
      public void print() {
        System.out.println("Hola Gustavo.");
      }
      
    };

    imprime(bean1);
    imprime(bean2);
    imprime(bean3);
    imprime(bean4);
    imprime(bean5);

  }

  private static void imprime(PrintSpec bean) {
    bean.print();
  }

}
