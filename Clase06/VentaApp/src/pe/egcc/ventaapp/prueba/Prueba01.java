package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    double total = 1045.39;
    // Proceso
    CompAbstract comp = new FacturaService();
    Item[] repo = comp.procesar(total);
    // Reporte
    for(Item bean: repo){
      System.out.println(bean.getConcepto() + "\t" + bean.getValor());
    }
  }
  
}
