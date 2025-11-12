package ColecaoGenerica;
import java.util.TreeMap;

public class RevisandoMapa {
 /*    public static void main (String[] args){
        String texto ="Ola mamae como você esta, espero que esteja bem";
        TreeMap <Character, Integer> mapaLetra = new TreeMap<>();
        texto = texto.toLowerCase();
         
        for (char c : texto.toCharArray()) {
            // ignora espaços e pontuação
            if (Character.isLetter(c)) {
                if (mapaLetra.containsKey(c)) {
                    int contagem = mapaLetra.get(c);
                    mapaLetra.put(c, contagem + 1);
                } else {
                    mapaLetra.put(c, 1);
                }
            }
        }

        // exibe o resultado
        for (char c : mapaLetra.keySet()) {
            System.out.println(c + ": " + mapaLetra.get(c));
        }
    }
} */
public static void main(String[] args ){
    String texto = "HELLOTHERE";
    TreeMap <Character, Integer> mapaLetra = new TreeMap<>();
    texto = texto.toLowerCase();
for(char c : texto.toCharArray()){
    if(Character.isLetter(c)){
        if(mapaLetra.containsKey(c)){
            int contagem = mapaLetra.get(c);
            mapaLetra.put(c, contagem +1);
        } else{
            mapaLetra.put(c, 1);
        }
    }
}
for(char c : mapaLetra.keySet()){
    System.out.println(c + ": " + mapaLetra.get(c));
}
}
}