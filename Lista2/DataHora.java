package Lista2;

public class DataHora {
    private int dia;
    private int mes;
    private int ano;
    private int hora;
   
    public DataHora(int dia, int mes, int ano, int hora) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.hora = hora;
    }

    public String toString() {
        return "A data do Aniversario de Tainar é: " + dia + ", mes=" + mes + ", ano=" + ano + ", hora=" + hora + "h";
    }
}


