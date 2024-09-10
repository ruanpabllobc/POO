package pds;

public class Demo {
    public static void main(String[] args) {
        Animal formiga = new Formiga();
        Animal cachorro = new Cachorro();
        Animal peixe = new Peixe("Peixonauta");

        System.out.println("Formiga:");
        System.out.println("Quantidade de pernas: " + formiga.quantidadeDePernas);
        formiga.caminha();
        formiga.come();
        System.out.println("Cachorro:");
        System.out.println("Quantidade de pernas: " + cachorro.quantidadeDePernas);
        cachorro.caminha();
        cachorro.come();
        cachorro.brinca();
        System.out.println("Peixe:");
        System.out.println("Quantidade de pernas: " + peixe.quantidadeDePernas);
        peixe.caminha();
        peixe.come();
    }
}