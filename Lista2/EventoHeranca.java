package Lista2;

public class EventoHeranca extends DataHora {
    private String tema;

    public EventoHeranca(int dia, int mes, int ano, int hora, String tema) {
        super(dia, mes, ano, hora);
        this.tema = tema;
    }
    @Override

    public String toString() {
        return super.toString() + " Com o tema: " + tema ;
    }
  
    
}
