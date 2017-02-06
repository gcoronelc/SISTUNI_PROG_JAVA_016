package pe.egcc.ventaapp.service;

/**
 *
 * @author Gustavo Coronel
 */
public final class CompFactory {

  private CompFactory() {
  }

  public static final String FACTURA = "Factura";
  public static final String BOLETA = "Boleta";
  
  public static final String[] getTipos(){
    String[] tipos = {FACTURA, BOLETA};
    return tipos;
  }
  
  public static final CompAbstract crear(String tipo){
    // Variable
    CompAbstract bean = null;
    // Proceso
    switch(tipo){
      case FACTURA:
        bean = new FacturaService();
        break;
      case BOLETA:
        bean = new BoletaService();
        break;
    }
    // Reporte
    return bean;
  }
  
  
  
}
