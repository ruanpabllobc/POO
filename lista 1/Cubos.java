public class Cubos {

    public static void main(String[] args) {
        System.out.println("Números de 3 algarismos cuja soma dos cubos de seus algarismos é igual ao próprio número:");
        for (int numero = 100; numero < 1000; numero++) {
            int soma = 0;
            int temp = numero;
            while (temp > 0) {
                int digito = temp % 10;
                soma += Math.pow(digito, 3);
                temp /= 10;
            }
            if (soma == numero) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();
    }
}
