/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.EGCC.promedioapp.controller;

import pe.egcc.edutec.service.Promedio;

/**
 *
 * @author Alumno
 */
public class PromController {
    private Promedio service;
    
    public PromController(){
        service = new Promedio();
    }
    
    public int promediar(int n1,int n2){
        return service.promediar(n1, n2);
    }
    
    public int promediar(int n1,int n2,int n3){
        return service.promediar(n1, n2, n3);
    }
    public int promediar(int n1,int n2,int n3,int n4){
        return service.promediar(n1, n2, n3, n4);
    }
    public int promediar(int n1,int n2,int n3 ,int n4,int n5){
        return service.promediar(n1, n2, n3, n4, n5);
    }
    
}
