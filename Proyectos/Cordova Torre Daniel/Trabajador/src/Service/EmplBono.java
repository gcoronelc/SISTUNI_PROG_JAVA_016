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
public class EmplBono extends EmpleAbstract{
    @Override
    public Empleado Bonificacion(Empleado empl) {
    String descrip;
    descrip=empl.getDescripcion();
    switch(descrip){
        case "Coordinador":{
              empl.setSueldo(5000.00);break;
            }
        case "Asistente":{
              empl.setSueldo(4000.00);break;
            }
        case "Secretaria":{
              empl.setSueldo(3000.00);break;
            }
    }
    double bono;
    bono=empl.getSueldo()*EMPLEADO;
    empl.setBono(bono);
    return empl;
    }
    
}
