package reuso.q41;

public class Pessoa {
    private String nome;
    private String cpf;
    private int idade;
    private double altura;

    public Pessoa(String nome, String cpf, int idade, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + ", altura=" + altura + "]";
    }
    
}