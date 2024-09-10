package pds;

public class Peixe extends Animal {
    public String nome;

    public Peixe(String nome) {
        super(0);
        this.nome = nome;
    }

    @Override
    public void caminha() {
        System.out.println("Nada");
    }

    @Override
    public void come() {
        System.out.println("Algas.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void brinca() {
        System.out.println("Não brinca");
    }
   
}

