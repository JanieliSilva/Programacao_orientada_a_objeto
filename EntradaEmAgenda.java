package LISTA;

public class EntradaEmAgenda{
    int dia;
    int mes;
    int ano;
    int hora;
    String assunto;

public EntradaEmAgenda(int dia, int mes, int ano,int hora, String assunto){
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
    this.hora = hora;
    this.assunto = assunto;
}

public String toString(){
    return String.format("[%02d/%02d/%d @%02d:00] %s", this.dia, this.mes, this.ano, this.assunto);
}

public boolean ehNoDia(int dia, int mes, int ano){
    return (this.dia == dia && this.mes == mes && this.ano == ano);
}
}