package ColecaoGenerica;
import java.util.PriorityQueue;

public class Prioridade{
    public static void main(String[] args){
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        
        filaPrioridade.add(5);
        filaPrioridade.add(1);
        filaPrioridade.add(3);
        filaPrioridade.add(2);
        filaPrioridade.add(4);
        
        System.out.println("Elementos na fila de prioridade:");
        while(!filaPrioridade.isEmpty()){
            System.out.println(filaPrioridade.poll());
        }
    }
}