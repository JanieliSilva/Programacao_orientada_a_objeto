package Lista2;

public class Computador extends Equipamento{
    private String processador;
    private int memoria;

    public Computador(String teclado, String mouse, String monitor, String processador, int memoria) {
        super(teclado, mouse, monitor);
        this.processador = processador;
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return super.toString()+ " Computador processador: " + processador + ", memoria:" + memoria + "GB";
    }
    
    
}
