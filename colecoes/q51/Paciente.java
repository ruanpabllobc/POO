package colecoes.q51;

import java.util.Random;

public class Paciente {
    private String RG;
    private int idade;
    private static final Random RANDOM = new Random();

    public Paciente() {
        this.RG = gerarRG();
        this.idade = RANDOM.nextInt(100) + 1; // Gera idade entre 1 e 100
    }

    private String gerarRG() {
        StringBuilder rg = new StringBuilder();
        for (int i = 0; i < 9; i++) {
            rg.append(RANDOM.nextInt(10)); // Adiciona dígitos de 0 a 9
        }
        return rg.toString();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Paciente [RG=" + RG + ", idade=" + idade + "]";
    }
}

