package pe.egcc.ventaapp.service;

import pe.egcc.ventaapp.model.Item;

/**
 *
 * @author Gustavo Coronel
 */
public class BoletaService extends CompAbstract {

  @Override
  public Item[] procesar(double total) {
    // Variables
    double servicio, totalGeneral;
    // Proceso
    servicio = redondear(total * SERVICIO);
    totalGeneral = redondear(total + servicio);
    // Reporte
    Item[] repo = {
      new Item("Total", total),
      new Item("Servicio", servicio),
      new Item("Total General", totalGeneral)
    };
    return repo;
  }

}
