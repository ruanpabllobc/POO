package classes;

public class Time {
    String nome;
    String modalide;
    int jogadores;
    int vitorias;
    int derrotas;
    int empates;

    public Time(String nome, String modalide, int jogadores) {
        this.nome = nome;
        this.modalide = modalide;
        this.jogadores = jogadores;
    }

    public void vitorias(){
        vitorias++;
    }

    public void derrotas(){
        derrotas++;
    }

    public void empates(){
        empates++;
    }

    

    @Override
    public String toString() {
        return "Time [nome=" + nome + ", modalide=" + modalide + ", jogadores=" + jogadores + ", vitorias=" + vitorias
                + ", derrotas=" + derrotas + ", empates=" + empates + "]";
    }

    public static void main(String[] args) {
        Time time1 = new Time("As Malevolas", "Volei", 12);
        time1.vitorias();
        time1.vitorias();
        time1.derrotas();
        time1.empates();
        System.out.println(time1.toString());
    }
    
}
