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
public abstract class EmpleAbstract {
       protected final double DOCENTE=0.7;
       protected final double EMPLEADO = 1.0;
       protected final double SUELDO=120.0;
       public abstract Empleado Bonificacion(Empleado empl);
       
}
