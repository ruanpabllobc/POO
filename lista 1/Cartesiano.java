import java.util.Scanner;

public class Cartesiano {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite as coordenadas do primeiro ponto (x1 e y1):");
        double x1 = scan.nextDouble();
        double y1 = scan.nextDouble();

        System.out.println("Digite as coordenadas do segundo ponto (x2 e y2):");
        double x2 = scan.nextDouble();
        double y2 = scan.nextDouble();

        if (x2 > x1) {
            System.out.println("O segundo ponto está à direita do primeiro ponto.");
        } else if (x2 < x1) {
            System.out.println("O segundo ponto está à esquerda do primeiro ponto.");
        } else {
            System.out.println("O segundo ponto está na mesma posição horizontal do primeiro ponto.");
        }

        if (y2 > y1) {
            System.out.println("O segundo ponto está acima do primeiro ponto.");
        } else if (y2 < y1) {
            System.out.println("O segundo ponto está abaixo do primeiro ponto.");
        } else {
            System.out.println("O segundo ponto está na mesma posição vertical do primeiro ponto.");
        }
        scan.close();
    }
}
