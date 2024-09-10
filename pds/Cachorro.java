package pds;

public class Cachorro extends Animal {

    public Cachorro() {
        super(4);
    }

    @Override
    public void caminha() {
        System.out.println("Caminha");
    }

    @Override
    public void come() {
        System.out.println("Ração");
    }

    @Override
    public void brinca() {
        System.out.println("Pega o graveto");
    }
}
