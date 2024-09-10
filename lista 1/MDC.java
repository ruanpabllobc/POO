public class MDC {

    public static int mdc(int m, int n) {
        if (n > m) {
            return mdc(n, m);
        } else if (n == 0) {
            return m;
        } else {
            return mdc(n, m % n);
        }
    }

    public static void main(String[] args) {
        int numero1 = 48;
        int numero2 = 18;
        int resultado = mdc(numero1, numero2);
        System.out.println("O MDC de " + numero1 + " e " + numero2 + " é " + resultado);
    }
}
