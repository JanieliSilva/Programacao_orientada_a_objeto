package ColecaoGenerica;

import java.util.TreeSet;

public class Conunto {
    public static void main(String[] args) {
       TreeSet<String> cores = new TreeSet<>(); 
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Vermelho");
        cores.add("Amarelo");
        cores.add("Roxo");
        System.out.println(cores);

    }

}
