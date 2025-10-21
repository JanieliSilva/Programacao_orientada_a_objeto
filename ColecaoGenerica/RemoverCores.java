package ColecaoGenerica;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class RemoverCores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        cores.add("Roxo");
        cores.add("Laranja");
        System.out.println("Cores antes da remoção: " + cores);
        LinkedList<String> coresParaRemover = new LinkedList<String>();
        coresParaRemover.add("Verde");
        coresParaRemover.add("Roxo");
        System.out.println("Cores a serem removidas: " + coresParaRemover);
    }
        
    }
       
         
    



