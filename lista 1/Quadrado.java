import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        float lado;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor do lado: ");
        lado = scan.nextFloat();
        System.out.println("Area do quadrado: " + lado*lado);
        scan.close();
    }
}
