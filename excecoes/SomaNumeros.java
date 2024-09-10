package excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SomaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeiroNumero = obterIntValido(scanner, "Digite o primeiro número inteiro:");
        int segundoNumero = obterIntValido(scanner, "Digite o segundo número inteiro:");
        scanner.close();

        int resultado = primeiroNumero + segundoNumero;
        System.out.println("A soma dos números é: " + resultado);
    }

    public static int obterIntValido(Scanner scanner, String mensagem) {
        int numero = 0;
        boolean valido = false;

        while (!valido) {
            System.out.println(mensagem);
            try {
                numero = scanner.nextInt();
                valido = true; // Se o próximo token for um inteiro, marca como válido e sai do loop
            } catch (InputMismatchException e) {
                System.out.println("Erro: Por favor, digite um número inteiro válido.");
                scanner.next(); // Limpa o buffer do scanner para aceitar novo input
            }
        }
        return numero;
    }
}
