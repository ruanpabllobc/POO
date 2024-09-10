package reuso.q41;

public class Governador extends Politico {
    private String estado;

    public Governador(String nome, String cpf, int idade, double altura, String partido, String estado) {
        super(nome, cpf, idade, altura, partido);
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + "Governador [estado=" + estado + "]";
    }

}
