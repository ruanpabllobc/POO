package classes;

class Caminhao {
    private String placa;
    private int capacidadeCarga;
    private String tipo;

    public Caminhao(String placa, int capacidadeCarga, String tipo) {
        this.placa = placa;
        this.capacidadeCarga = capacidadeCarga;
        this.tipo = tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(int capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}