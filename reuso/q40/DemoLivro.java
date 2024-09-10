package reuso.q40;

public class DemoLivro {
    public static void main(String[] args) {
        LivroBiblioteca livroBiblioteca = new LivroBiblioteca("Lógica de Programação", "Alan Turing", "2000", "UFERSA");
        System.out.println(livroBiblioteca); 
        livroBiblioteca.pegarEmprestado();
        System.out.println(livroBiblioteca); 
        livroBiblioteca.devolverLivro();
        System.out.println(livroBiblioteca); 
        LivroLivraria livroLivraria = new LivroLivraria("C é melhor que java", "Jhoan", "2022", "UFERSA", 29.99f);
        System.out.println(livroLivraria); 
    }
}
