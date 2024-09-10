public class Fatorial {

    public static int fatorial(int n) {
        if (n == 0) {
            System.out.println("0! = 1");
            return 1;
        } else {
            int resultado = n * fatorial(n - 1);
            System.out.println(tabulacao(n) + n + "! = " + resultado);
            return resultado;
        }
    }

    public static String tabulacao(int nivel) {
        StringBuilder tabs = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            tabs.append("\t");
        }
        return tabs.toString();
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("Calculando fatorial de " + numero);
        int resultado = fatorial(numero);
        System.out.println("Resultado: " + resultado);
    }
}
