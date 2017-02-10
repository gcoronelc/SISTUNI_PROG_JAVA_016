package pe.egcc.genioapp.prueba;

import pe.egcc.genioapp.service.GenioService;

/**
 *
 * @author Gustavo Coronel
 */
public class Prueba02mcmmcd {

    public static void main(String[] args) {
        int n1 = 3, n2 = 9;

        System.out.println("mcd " + GenioService.mcd(n1, n2));
        System.out.println("mcm " + GenioService.mcm(n1, n2));

    }

}
