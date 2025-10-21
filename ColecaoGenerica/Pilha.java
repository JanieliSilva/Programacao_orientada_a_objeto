package ColecaoGenerica;

import java.util.Iterator;
import java.util.Stack;

public class Pilha {
    public static void main(String[] args){
        Stack<Number> pilha = new Stack<>();
        
        pilha.push(2);
        System.out.println(pilha);
        
        pilha.push(9.85F);
        System.out.println(pilha);
        
        pilha.push(4.53);
        System.out.println(pilha);

        Iterator<Number> itera = pilha.iterator();
        
        System.out.println("\nIterando:");
        while(itera.hasNext()){
            System.out.println(itera.next());
        }
    }
}