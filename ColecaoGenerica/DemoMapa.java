package ColecaoGenerica;
import java.util.TreeMap;

public class DemoMapa {
    public static void main (String[] args){
        String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea comodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        String palavras[] = texto.split(" ");
        TreeMap<String, Integer> mapaPalavra = new TreeMap<>();
        for (String palavra : palavras){
            String palavraMinuscula = palavra.toLowerCase();
            if (mapaPalavra.containsKey(palavraMinuscula)){
              int contagem = mapaPalavra.get(palavraMinuscula);
              mapaPalavra.put(palavraMinuscula, contagem + 1);
                
            } else {
               mapaPalavra.put(palavraMinuscula, 1);
            }
           // System.out.println(palavra);
        }
       // System.out.println(mapaPalavra);
        for(String palavra : mapaPalavra.keySet()){
            System.out.println(palavra + ": " + mapaPalavra.get(palavra));
        }
    }
}
