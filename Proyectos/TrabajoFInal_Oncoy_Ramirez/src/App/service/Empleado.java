
package App.service;

/**
 *
 * @author RAUL
 */
public class Empleado extends Service {
       public static final double SUELDO_COORD = 5000.00 ;//Sueldo coordinador
       public static final double SUELDO_ASIS = 4000.00 ;//Sueldo asistente
       public static final double SUELDO_SECRE = 3000.00 ;//sueldo secretaria
       private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
   // Implementacion de la funcion abstracta 
    @Override
    public void Bonificacion() 
    { if(cargo.equalsIgnoreCase("coordinador"))
       Bonif=SUELDO_COORD*0.7;
      else
      if(cargo.equalsIgnoreCase("asistente"))
       Bonif=SUELDO_ASIS*0.7;
      else
      if(cargo.equalsIgnoreCase("secretaria"))
       Bonif=SUELDO_SECRE*0.7;
    }
    
}
