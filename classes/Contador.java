package classes;

public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public void zerar(){
        this.valor = 0;
    }

    public void incrementar(){
        this.valor++;
    }

    @Override
    public String toString() {
        return "Contador [valor=" + valor + "]";
    }

    public static void main(String[] args) {
        Contador contador = new Contador(5);
        System.out.println(contador.toString());
        contador.incrementar();
        System.out.println(contador.toString());
        contador.zerar();
        System.out.println(contador.toString());
    }
}
