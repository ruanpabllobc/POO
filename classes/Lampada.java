package classes;

public class Lampada {
    boolean estadoDaLampada;
    int clicks;

    public Lampada() {
        this.estadoDaLampada = false;
    }

    public void acende(){
        this.estadoDaLampada = true;
        clicks++;
    }

    public void apaga(){
        this.estadoDaLampada = false;
    }

    public void mostraEstado(){
        if (estadoDaLampada) {
            System.out.println("Está acesa");
        }else{
            System.out.println("Está apagada");
        }
    }

    public boolean estaLigada(){
        if (estadoDaLampada) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        lampada.acende();
        lampada.mostraEstado();
        lampada.apaga();
        lampada.mostraEstado();
        System.out.println(lampada.estaLigada());
    }
    
}
