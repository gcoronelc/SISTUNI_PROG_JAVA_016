package pe.egcc.app.prueba;

import pe.egcc.app.model.Venta;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {

  public static void main(String[] args) {
    
    System.out.println("IGV: " + Venta.igv);
    
    Venta bean1 = new Venta();
    bean1.cliente = "Gustavo";
    bean1.importe = 1000.0;
    bean1.igv = 0.25;
    
    Venta bean2 = new Venta();
    bean2.cliente = "Claudia";
    bean2.importe = 3000.0;
    bean2.igv = 0.30;
    
    reporte(bean1);
    reporte(bean2);
    
  }

  private static void reporte(Venta bean) {
    System.out.println("---------------------");
    System.out.println("Cliente: " + bean.cliente);
    System.out.println("Importe: " + bean.importe);
    System.out.println("IGV: " + bean.igv);
  }
  
}
