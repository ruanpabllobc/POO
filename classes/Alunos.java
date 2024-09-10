package classes;

public class Alunos {
    int matricula;
    String nome;
    double p1;
    double p2;
    double trabalho;

    public Alunos(int matricula, String nome, double p1, double p2, double trabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.p1 = p1;
        this.p2 = p2;
        this.trabalho = trabalho;
    }

    public double mediaParcial() {
        return ((2.5 * p1) + (2.5 * p2) + (2 * trabalho)) / 7;
    }

    public double provaFinal(double EF) {
        double MP = mediaParcial();
        if (MP < 3 || MP >= 7) {
            return 0;
        }
        double MF = (MP * 6 + EF * 4) / 10;
        return MF;
    }

    public String situacaoFinal(double EF) {
        double MF = provaFinal(EF);
        if (MF >= 5) {
            return "Aluno aprovado";
        } else {
            return "Aluno reprovado";
        }
    }

    public static void main(String[] args) {
        Alunos aluno1 = new Alunos(12345, "João", 7.5, 4.0, 8.5);
        double EF = 5.0;
        System.out.println("Média Parcial: " + aluno1.mediaParcial());
        System.out.println("Nota necessária no Exame Final: " + aluno1.provaFinal(EF));
        System.out.println("Situação Final: " + aluno1.situacaoFinal(EF));
    }
}
