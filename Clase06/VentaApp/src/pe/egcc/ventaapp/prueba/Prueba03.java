package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Item;
import pe.egcc.ventaapp.service.CompAbstract;
import pe.egcc.ventaapp.service.CompFactory;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    // Dato
    double total = 3459.45;
    String tipo = CompFactory.BOLETA;
    // Proceso
    CompAbstract comp = CompFactory.crear(tipo);
    Item[] repo = comp.procesar(total);
    // Reporte
    for(Item bean: repo){
      System.out.println(bean.getConcepto() + "\t" + bean.getValor());
    }
  }
  
}
