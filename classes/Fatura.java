package classes;

public class Fatura {
    int numeroIdentificacao;
    String descricao;
    int quantidade;
    double preco;

    public Fatura(int numeroIdentificacao, String descricao, int quantidade, double preco) {
        this.numeroIdentificacao = numeroIdentificacao;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
        if(quantidade<0){
            quantidade=0;
        }
        if (preco<0) {
            preco=0;
        }
    }

    public double calculaTotal(){
        return quantidade * preco;
    }

    @Override
    public String toString() {
        return "Fatura [numeroIdentificacao=" + numeroIdentificacao + ", descricao=" + descricao + ", quantidade=" + quantidade + ", preco=" + preco + ", total=" + calculaTotal() + "]";
    }

    public static void main(String[] args) {
        Fatura fatura = new Fatura(32, "Mousepad", 2, 57.60);
        System.out.println(fatura.toString());
    }
}
