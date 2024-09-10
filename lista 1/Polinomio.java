import java.util.Scanner;

public class Polinomio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = scanner.nextInt();

        double[] coeficientes = new double[n + 1];
        for (int i = 0; i <= n; i++) {
            System.out.print("Digite o coeficiente a" + i + ": ");
            coeficientes[i] = scanner.nextDouble();
        }

        System.out.print("Digite o valor de x: ");
        double x = scanner.nextDouble();

        double resultado = calcularPolinomio(coeficientes, n, x);
        System.out.println("O valor do polinômio Pn(x) é: " + resultado);

        scanner.close();
    }

    public static double calcularPolinomio(double[] coeficientes, int n, double x) {
        double resultado = 0;
        for (int i = 0; i <= n; i++) {
            resultado += coeficientes[i] * Math.pow(x, n - i);
        }
        return resultado;
    }
}
