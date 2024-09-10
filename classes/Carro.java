package classes;

class Carro {
    protected String modelo;
    protected int ano;
    protected String combustivel;

    public Carro(String modelo, int ano, String combustivel) {
        this.modelo = modelo;
        this.ano = ano;
        this.combustivel = combustivel;
    }
}