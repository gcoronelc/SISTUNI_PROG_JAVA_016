package pe.egcc.genioapp.service;

/**
 *
 * @author alarcon
 */
public final class GenioService {

    private GenioService() {
    }

    public static long factorial(int n) {
        long f = 1;
        for (; n > 1;) {
            f *= n--;
        }
        return f;
    }

    public static int mcd(int n1, int n2) {
        int mcd = 0, min;
        if (n1 < n2) {
            min = n1;
        } else {
            min = n2;
        }
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                mcd = i;
            }
        }
        return mcd;
    }

    public static int mcm(int n1, int n2) {
        int mcm = 1;
        if (n1 < n2) {
            mcm = n2;
            n2 = n1;
            n1 = mcm;
            mcm = (n1 / mcd(n1, n2)) * n2;
        } else {
            mcm = 0;
        }
        return mcm;
    }

    public static int[] fibonacci(int n) {
        int[] f = new int[n];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i < f.length; i++) {

            f[i] = f[i - 1] + f[i - 2];
            if (i == n) {
                System.out.println(f[i] + " ");
            }

        }
        return f;
    }

    public static boolean esPrimo(int n) {
        boolean primo = true;
        int divisor = 2;
        while ((primo) && (divisor != n)) {
            if (n % divisor == 0) {
                primo = false;
            } else {
                divisor++;
            }
        }
        return primo;
    }

}
