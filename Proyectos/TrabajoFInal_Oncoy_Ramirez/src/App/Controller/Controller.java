package App.Controller;
import App.service.Factory;
import App.service.Service;

public class Controller {
  
  public String[] getTipos(){
    String[] tipos = {Factory.COMP_DOCENTE, Factory.COMP_EMPLEADO};
    return tipos;
  }
  

}
