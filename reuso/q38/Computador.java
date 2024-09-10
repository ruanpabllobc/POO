package reuso.q38;

public class Computador extends Equipamento{
    private String processador;
    private int memoriaRAM;

    public Computador(String modelo, double preco, String processador, int memoriaRAM) {
        super(modelo, preco);
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public String toString() {
        return super.toString() + "Computador [processador=" + processador + ", memoriaRAM=" + memoriaRAM + "]";
    }

}
