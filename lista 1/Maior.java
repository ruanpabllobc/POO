import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        System.out.println("Digite tres valores: ");
        Scanner scan = new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int n3=scan.nextInt();
        if (n1 <= n2 && n1 <= n3) {
            System.out.println(n1);
        }else if (n2 <= n1 && n2 <= n3) {
            System.out.println(n2);
        } else {
            System.out.println(n3);
        }
        scan.close();
    }
}
