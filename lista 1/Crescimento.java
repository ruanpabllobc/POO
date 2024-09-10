public class Crescimento {

    public static void main(String[] args) {
        int populacaoA = 7000;
        int populacaoB = 20000;
        double crescimentoA = 0.035;
        double crescimentoB = 0.01;
        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += (int) (populacaoA * crescimentoA);
            populacaoB += (int) (populacaoB * crescimentoB);
            anos++;
        }

        System.out.println("População da cidade A: " + populacaoA + " habitantes");
        System.out.println("População da cidade B: " + populacaoB + " habitantes");
        System.out.println("Quantidade de anos necessária para a população de A ser maior ou igual à de B: " + anos + " anos");
    }
}
