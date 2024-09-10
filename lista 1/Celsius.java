import java.util.Scanner;

public class Celsius {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma temperatura em celsius: ");
        double celsius = scan.nextDouble();
        double fahrenheit = (9.0/5.0)*celsius+32;
        System.out.println("Resultado da conversao para fahrenheit: " + fahrenheit);
        scan.close();
    }
}
