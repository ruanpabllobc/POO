package interfaces.q47;

public class DemoLivroDeBiblioteca {
    public static void main(String[] args) {
        LivroDeBiblioteca livro = new LivroDeBiblioteca("Faisco Adventures", "Faisco", 32, 2032, "Corredor 6", "Neste conto o gato vive aventuras");
        System.out.println(livro.estaEmprestado());
        livro.empresta();
        System.out.println(livro.toString());
        livro.devolve();
        System.out.println(livro.toString());
        System.out.println(livro.qualAutor());
        System.out.println(livro.qualLivro());
        System.out.println(livro.localizacao());
        System.out.println(livro.descricao());
    }
}
