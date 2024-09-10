package pds;

public abstract class Animal {
    protected int quantidadeDePernas;

    public Animal(int quantidadeDePernas) {
        this.quantidadeDePernas = quantidadeDePernas;
    }

    public abstract void caminha();
    public abstract void come();
    public abstract void brinca();
}
