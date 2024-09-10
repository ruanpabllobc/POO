import java.util.Scanner;

public class Semana {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número de 1 a 28 representando um dia de fevereiro de 2015:");
        int dia = scan.nextInt();
        int diaInicio = 0;
        int diaSemana = (dia + diaInicio - 1) % 7;
        String nomeDiaSemana = "dia";
        switch (diaSemana) {
            case 0:
                nomeDiaSemana = "domingo";
                break;
            case 1:
                nomeDiaSemana = "segunda-feira";
                break;
            case 2:
                nomeDiaSemana = "terça-feira";
                break;
            case 3:
                nomeDiaSemana = "quarta-feira";
                break;
            case 4:
                nomeDiaSemana = "quinta-feira";
                break;
            case 5:
                nomeDiaSemana = "sexta-feira";
                break;
            case 6:
                nomeDiaSemana = "sábado";
                break;
            default:
                System.out.println("Dia inválido.");
                System.exit(0);
        }

        System.out.println("O dia " + dia + " será " + nomeDiaSemana + ".");
        scan.close();
    }
}
