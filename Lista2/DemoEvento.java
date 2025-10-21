package Lista2;

public class DemoEvento {
    public static void main(String[] args){
        DataHora dh1 = new DataHora(02, 9, 2025, 19);
        EventoHeranca eh1 = new EventoHeranca(02, 9, 2025, 19, "Forro dos véi");
        EventoDelegação ed1 = new EventoDelegação(dh1, "Sao Miguel");

        System.out.println(dh1);
        System.out.println(eh1);
        System.out.println(ed1);
    }
}
