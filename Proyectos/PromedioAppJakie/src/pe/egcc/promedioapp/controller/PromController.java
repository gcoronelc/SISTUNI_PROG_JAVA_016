package pe.egcc.promedioapp.controller;

import pe.egcc.edutec.service.Promedio;

/**
 *
 * @author Gustavo Coronel
 */
public class PromController {

    private Promedio service;

    public PromController() {
        service = new Promedio();
    }

    public int promediar(int n1, int n2) {
        return service.promediar(n1, n2);
    }

    public int promediar(int n1, int n2, int n3) {
        return service.promediar(n1, n2, n3);
    }

    public int promediar(int n1, int n2, int n3, int n4) {
        return service.promediar(n1, n2, n3, n4);
    }
public int promediar(int n1, int n2, int n3, int n4, int n5) {
        return service.promediar(n1, n2, n3, n4, n5);
    }
}
