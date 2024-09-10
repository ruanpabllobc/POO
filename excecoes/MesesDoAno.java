package excecoes;

import java.util.Scanner;

public class MesesDoAno {

    public static void main(String[] args) {
        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                          "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 12 para obter o nome do mês correspondente:");
        try {
            int indiceMes = scanner.nextInt();
            if (indiceMes >= 1 && indiceMes <= 12) {
                String nomeMes = meses[indiceMes - 1];
                System.out.println("O mês correspondente ao número " + indiceMes + " é: " + nomeMes);
            } else {
                throw new IllegalArgumentException();
            }
        } catch (Exception e) {
            System.out.println("Erro: Digite um número inteiro válido.");
        } finally {
            scanner.close();
        }
    }
}
