
package App.service;

/**
 *
 * @author RAUL
 */
public class Docente extends Service  {
  //Constructor por defecto
  public Docente()
  {
      
  }  
  
 //Datos
    public static final int PAGO_HORA = 120 ;
    private int nhoras;
    private int Sueldo;

    public int getNhoras() {
        return nhoras;
    }

    public void setNhoras(int nhoras) {
        this.nhoras = nhoras;
    }

    
   public void CalculoSueldo()
   {
       this.Sueldo=PAGO_HORA*nhoras;
   }
    //Implementacion de la funcion abstracta
    @Override
    public void Bonificacion() {
        Bonif = 1*Sueldo;
    }
    
  
    
    
    
    
}
