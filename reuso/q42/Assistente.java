package reuso.q42;

public class Assistente extends Funcionario {
    private int numMatricula;

    public Assistente(String nome, double salario, int numMatricula) {
        super(nome, salario);
        this.numMatricula = numMatricula;
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return super.toString() + "Assistente [numMatricula=" + numMatricula + "]";
    }    
}
