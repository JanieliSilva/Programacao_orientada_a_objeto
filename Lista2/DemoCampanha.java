package Lista2;

public class DemoCampanha {
    public static void main(String[] args){
        Prefeiro p1 = new Prefeiro("Izaias", "123.456.789-00", 25, "PT", "Prefeito", "São Miguel");
        Governador g1 = new Governador("Kayc", "987.654.321-00", 22, "PSDB", "Governador", "Rio Grande do Norte");

        System.out.println(p1);
        System.out.println(g1);
    }
}
