/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Model.Empleado;

/**
 *
 * @author Alumno
 */
public class DocenteBono extends EmpleAbstract{

    @Override
    public Empleado Bonificacion(Empleado empl) {
       Double sueldo,bono;
        sueldo=empl.getHoras()*SUELDO;
        bono=sueldo*DOCENTE;
        empl.setBono(bono);
        return empl;
    }

   
    
   
    
  
    
    
}
