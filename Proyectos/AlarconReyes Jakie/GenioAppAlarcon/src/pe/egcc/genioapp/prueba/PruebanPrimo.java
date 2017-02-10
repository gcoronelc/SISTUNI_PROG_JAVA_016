package pe.egcc.genioapp.prueba;

import pe.egcc.genioapp.service.GenioService;

/**
 *
 * @author alarcon
 */
public class PruebanPrimo {

    public static void main(String[] args) {
        int n1 = 6;
        boolean primo;
        primo = GenioService.esPrimo(n1);
        if (primo) {
            System.out.println(n1 + " es primo ");
        } else {
            System.out.println(n1 + " no es primo ");
        }

    }

}
