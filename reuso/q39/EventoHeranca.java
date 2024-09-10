package reuso.q39;

public class EventoHeranca extends DataHora{
    private String evento;

    public EventoHeranca(String hora, String dia, String mes, String ano, String evento) {
        super(hora, dia, mes, ano);
        this.evento = evento;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Evento: " + evento + "\n" + "Data: " + super.toString();
    }   
    
}
