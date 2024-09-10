package classes;

public class Elevador {
    private int andarAtual;
    private int andaresPredio;
    private int capacidade;
    private int QuantidadePessoasAtual;

    public Elevador(int andaresPredio, int capacidade) {
        this.andaresPredio = andaresPredio;
        this.capacidade = capacidade;
    }

    public void entra(){
        if (QuantidadePessoasAtual == capacidade) {
            System.out.println("Capacidade máxima atingida");
        }else{
            QuantidadePessoasAtual++;
        }
    }

    public void sai(){
        if (QuantidadePessoasAtual == 0) {
            System.out.println("Nenhuma pessoa no elevador");
        }else{
            QuantidadePessoasAtual--;
        }
    }

    public void sobe(){
        if (andarAtual == andaresPredio) {
            System.out.println("Este é o último andar");
        }else{
            System.out.println("Subindo");
            andarAtual++;
        }
    }

    public void desce(){
        if (andarAtual == 0) {
            System.out.println("Este é o térreo");
        }else{
            System.out.println("Descendo");
            andarAtual--;
        }
    }

    public static void main(String[] args) {
        Elevador elevador = new Elevador(5, 6);
        elevador.andarAtual = 3;
        System.out.println(elevador.andarAtual);
        elevador.sobe();
        elevador.desce();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        elevador.entra();
        System.out.println(elevador.QuantidadePessoasAtual);
    }
}
