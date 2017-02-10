/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Empleado;
import Service.EmplFactory;

/**
 *
 * @author Alumno
 */
public class Controlador {
    
    public String[] getTipos(){
        return EmplFactory.getTipos();
    }
    
    public Empleado procesar(String tipo,Empleado empl){
      return EmplFactory.crear(tipo).Bonificacion(empl);
    }

}
