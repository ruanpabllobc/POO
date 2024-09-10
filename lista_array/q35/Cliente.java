package lista_array.q35;

public class Cliente {
    int id;
    String nome;
    int idade;
    String telefone;

    public Cliente(int id, String nome, int idade, String telefone) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", idade=" + idade + ", telefone=" + telefone + "]";
    }
    
}
