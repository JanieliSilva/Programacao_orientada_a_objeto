package Lista2;

public class EventoDelegação {
    private DataHora dataHora;
    private String local;

    public EventoDelegação(DataHora dataHora, String local) {
        this.dataHora = dataHora;
        this.local = local;
    }

    public String toString() {
        return "EventoDelegação [dataHora=" + dataHora + ", local=" + local + "]";
    }
 
    
}
