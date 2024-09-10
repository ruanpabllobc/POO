package interfaces.q47;

public class Livro {
    String titulo;
    String autor;
    int numeroDePaginas;
    int anoDeEdicao;

    public Livro(String titulo, String autor, int numeroDePaginas, int anoDeEdicao) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.anoDeEdicao = anoDeEdicao;
    }

    public String qualLivro(){
        return this.titulo;
    }

    public String qualAutor(){
        return this.autor;
    }

    @Override
    public String toString() {
        return "Livro [titulo=" + titulo + ", autor=" + autor + ", numeroDePaginas=" + numeroDePaginas
                + ", anoDeEdicao=" + anoDeEdicao + "]";
    }
    
}
