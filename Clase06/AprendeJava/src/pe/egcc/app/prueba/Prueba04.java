package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase2;
import pe.egcc.app.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba04 {

  public static void main(String[] args) {
    // Datos
    int n1 = 8, n2 = 6;
    // Proceso
    Clase1 bean = new Clase2();
    int su = bean.sumar(n1, n2);
    // Reporte
    System.out.println("n1: " + n1);
    System.out.println("n2: " + n2);
    System.out.println("su: " + su);

    if(Clase4.class.isInstance(bean)){
      Clase4 obj = (Clase4) bean;
      System.out.println("8 * 7 = " + obj.multiplicar(8, 7));
    } else {
      System.err.println("No hay compativilidad.");
    }
        
  }

}
