package reuso.q38;

public class Equipamento {
    private String modelo;
    private double preco;
    
    public Equipamento(String modelo, double preco) {
        this.modelo = modelo;
        this.preco = preco;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Equipamento [modelo=" + modelo + ", preco=" + preco + "]";
    }

}
