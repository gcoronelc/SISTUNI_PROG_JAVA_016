/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

/**
 *
 * @author Alumno
 */
public class EmplFactory {
    private EmplFactory(){
    }
    public static final String EMPLEADO="Empleado";
    public static final String DOCENTE="Docente";
    public static final String[] getTipos(){
        String[] tipos={EMPLEADO,DOCENTE};
        return tipos;
    }
     public static final EmpleAbstract crear(String tipo){
       //variable
        EmpleAbstract bean=null;
        //Proceso
        switch(tipo){
            case EMPLEADO:
                bean=new EmplBono();
                break;
            case DOCENTE:
                bean=new DocenteBono();
                break;
        }
        //reporte
        return bean;
    }
}
