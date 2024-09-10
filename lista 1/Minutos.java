import java.util.Scanner;

public class Minutos {
 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um valor em minutos: ");
    int minutos = scan.nextInt();
    int dias = minutos/(24*60);
    int horas = (minutos % (24 * 60)) / 60;
    int minutosRestantes = minutos % 60;
    System.out.println(dias + " dias, " + horas + " horas e " + minutosRestantes + " minutos.");
    scan.close();
 }   
}
