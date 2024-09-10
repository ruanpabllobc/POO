import java.util.Scanner;

public class UCD {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um valor de 3 digitos: ");
        int valor = scan.nextInt();
        int centena = valor/100;
        int dezena = (valor % 100) / 10;
        int unidade = valor%10;
        int numero = unidade * 100 + centena*10 + dezena;
        System.out.println(numero);
        scan.close();
    }
}
