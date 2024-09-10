package lista_array.q33;

public class EntradaEmAgenda {
    String hora;
    String dia;
    String mes;
    String ano;
    String assunto;

    public EntradaEmAgenda(String hora, String dia, String mes, String ano, String assunto){
        this.hora = hora;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.assunto = assunto;
    }

    public boolean ehNoDia(String dia, String mes, String ano){
        if(this.dia.equals(dia) && this.mes.equals(mes) && this.ano.equals(ano)){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "EntradaEmAgenda [hora=" + hora + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", assunto="
                + assunto + "]";
    }

}
