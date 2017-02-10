/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainClass;

import Controller.Controlador;
import Model.Empleado;
import Service.DocenteBono;
import Service.EmplBono;
import static Service.EmplFactory.DOCENTE;
import static Service.EmplFactory.EMPLEADO;

/**
 *
 * @author Alumno
 */
public class Trabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Empleado pedro=new Empleado();
        EmplBono bean= new EmplBono();
        Controlador p=new Controlador();
        DocenteBono bean1=new DocenteBono();
        pedro.setHoras(13.5);
        //pedro.setDescripcion("Coordinador");
        pedro.setNombre("pedro");
        bean.Bonificacion(pedro);
        //bean1.Bonificacion(pedro);
        p.procesar(DOCENTE, pedro);
        System.out.println("bono : "+pedro.getBono());
       
    }
    
}
