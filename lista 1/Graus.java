import java.util.Scanner;

public class Graus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor em graus: ");
        double graus = scan.nextDouble();
        double rad = Math.toRadians(graus);
        double seno = Math.sin(rad);
        double cosseno = Math.cos(rad);
        double tangente = seno/cosseno;
        double cossecante = 1/seno;
        double secante = 1/cosseno;
        double cotangente = 1/tangente;
        System.out.println("Em radiano: " + rad + " seno: " + seno + " cosseno: " + cosseno + " tangente: " + tangente + " cossecante: " + cossecante + " secante: " + secante + " cotangente: " + cotangente);
        scan.close();
    }
}
