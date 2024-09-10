package interfaces.q47;

public class LivroDeBiblioteca extends Livro implements ItemDeBiblioteca{
    boolean emprestado;
    String localizacao;
    String descricao;

    public LivroDeBiblioteca(String titulo, String autor, int numeroDePaginas, int anoDeEdicao, String localizacao, String descricao) {
        super(titulo, autor, numeroDePaginas, anoDeEdicao);
        this.localizacao = localizacao;
        this.descricao = descricao;
        this.emprestado = false;
    }

    @Override
    public boolean estaEmprestado() {
        if(emprestado){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void empresta() {
        if(!emprestado){
            emprestado = true;
            System.out.println("Sucesso");
        }else{
            System.out.println("Livro indisponivel");
        }
    }

    @Override
    public void devolve() {
        if(emprestado){
            emprestado = false;
            System.out.println("Sucesso");
        }else{
            System.out.println("Voce não tem esse livro");
        }
    }

    @Override
    public String localizacao() {
        return this.localizacao;
    }

    @Override
    public String descricao() {
        return this.descricao;
    }

    @Override
    public String toString() {
        return super.toString() + "LivroDeBiblioteca [emprestado=" + emprestado + ", localizacao=" + localizacao + ", descricao="
                + descricao + "]";
    }   
    
}
