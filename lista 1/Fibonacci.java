import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor de n (n > 0): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("O valor de n deve ser maior que zero.");
            scanner.close();
            return;
        }

        System.out.println("Série de Fibonacci até o " + n + "-ésimo termo:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
