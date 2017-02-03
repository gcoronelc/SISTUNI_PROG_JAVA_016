/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.EGCC.promedioapp.ClasePrincipal;

import pe.egcc.edutec.service.Promedio;

/**
 *
 * @author Alumno
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Promedio prom =new Promedio();
        System.out.println("15 y 18 :"+prom.promediar(15, 18));
    }
    
}
