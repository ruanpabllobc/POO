import java.util.Scanner;

public class Loja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o código da loja: ");
        int codigo = scan.nextInt();

        if (codigo == 111 || codigo == 222) {
            System.out.println("Digite o valor do produto: ");
            double valor = scan.nextDouble();

            if (codigo == 222 && valor > 500) {
                valor *= 0.90;
            } else if (codigo == 111) {
                if (valor > 100) {
                    valor *= 0.60;
                } else if (valor > 50) {
                    valor *= 0.80; 
                } else if (valor < 50) {
                    valor *= 0.90; 
                }
            }

            System.out.println("Valor final de sua compra é: " + valor);
        } else {
            System.out.println("Setor inválido.");
        }

        scan.close();
    }
}
