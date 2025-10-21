package Lista2;

public class Equipamento {
    private String teclado;
    private String mouse;
    private String monitor;


    public Equipamento(String teclado, String mouse, String monitor) {
        this.teclado = teclado;
        this.mouse = mouse;
        this.monitor = monitor;
    }

    public String getTeclado() { return teclado; }
    public String getMouse() {  return mouse; }
    public String getMonitor() { return monitor; }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Equipamento teclado = " + teclado + ", mouse = " + mouse + ", monitor = " + monitor ;
    }

    

    

    
}


