public class Mega {
    public static void main(String[] args) {
        int[][] cartao = new int[6][10];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                cartao[i][j] = (int) (Math.random() * 60) + 1;
            }
        }
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%2d ", cartao[i][j]);
            }
            System.out.println();
        }
    }
}
