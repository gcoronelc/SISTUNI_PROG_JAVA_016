package pe.egcc.genioapp.prueba;

import java.util.Scanner;
import pe.egcc.genioapp.service.GenioService;

public class PruebaFibonaci {

    public static void main(String[] args) {

        imprimirSeries();
    }

    public static void imprimirSeries() {

        /* int feb = 8;
         int[] f = new int[feb];
         f[0] = 0;
         f[1] = 1;
         for (int i = 2; i < feb; i++) {
         f[i] = f[i - 1] + f[i - 2];
         System.out.print(f[i] + " ");
         }
         */
        int feb = 10;
        int[] f = GenioService.fibonacci(feb);
        for (int i = 2; i < feb; i++) {
            f[i] = f[i - 1] + f[i - 2];
            System.out.print(f[i] + " ");
        }
    }
}
