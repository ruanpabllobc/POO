package reuso.q41;

public class Politico extends Pessoa {
    private String partido;

    public Politico(String nome, String cpf, int idade, double altura, String partido) {
        super(nome, cpf, idade, altura);
        this.partido = partido;
    }

    @Override
    public String toString() {
        return super.toString() + "Politico [partido=" + partido + "]";
    }

}