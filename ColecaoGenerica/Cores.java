package ColecaoGenerica;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class Cores {
    public static void main(String[] args) {
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        System.out.println("Cores na lista: " + cores);
        Collections.sort(cores);
        System.out.println("Cores ordenadas: " + cores);
    }

        public static void contemString(ArrayList<String> lista, String alvo){
            if(lista.contains(alvo)){
                Collection.binarySearch(lista, alvo);
                System.out.println("A lista contém a cor: " + alvo);
            } else{
                System.out.println("A lista não contém a cor: " + alvo);
            }
         
    
}
}
