
package App.service;

/**
 *
 * @author RAUL
 */
public class Factory {
  public Factory ()
  {
      
  }
  public static final String COMP_DOCENTE = "DOCENTE";
  public static final String COMP_EMPLEADO = "EMPLEADO";
  
  public static Service getComp(String tipo){
    Service comp = null;
    switch(tipo){
      case COMP_DOCENTE:
        comp = new Docente();
        break;
      case COMP_EMPLEADO:
        comp = new Empleado();
        break;
    }
    return comp;
  }
    
}
