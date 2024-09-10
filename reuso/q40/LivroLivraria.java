package reuso.q40;

public class LivroLivraria extends Livro{
    private double preco;

    public LivroLivraria(String titulo, String autor, String ano, String editora, double preco) {
        super(titulo, autor, ano, editora);
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() + "LivroLivraria [preco=" + preco + "]";
    }
    
}
