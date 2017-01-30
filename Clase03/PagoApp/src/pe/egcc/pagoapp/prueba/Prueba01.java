package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.dto.PagoDto;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    // Dato
    PagoDto pagoDto = new PagoDto(8, 25, 30.0);
    
    // Proceso
    PagoService pagoService = new PagoService();
    pagoService.procesarPago(pagoDto);
    
    // Reporte
    System.out.println("Horas por día: " + pagoDto.getHorasDia());
    System.out.println("Días trabajados: " + pagoDto.getDias());
    System.out.println("Pago por hora: " + pagoDto.getPagoHora());
    System.out.println("Ingresos: " + pagoDto.getIngresos());
    System.out.println("Renta: " + pagoDto.getRenta());
    System.out.println("Neto: " + pagoDto.getNeto());
    
    
  }
  
}
