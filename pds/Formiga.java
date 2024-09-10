package pds;

public class Formiga extends Animal {

    public Formiga() {
        super(6);
    }

    @Override
    public void come() {
        System.out.println("Açúcar e migalhas.");
    }

    @Override
    public void caminha() {
        System.out.println("Normal");    }

    @Override
    public void brinca() {
        System.out.println("Não brinca");
    }
}
