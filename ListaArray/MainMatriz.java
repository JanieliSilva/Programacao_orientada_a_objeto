package LISTA;

public class MainMatriz {
   public static void main(String[] args){
    Matriz m1 = new Matriz(2.0f, 3.0f,3.0f,1.0f);
    m1.imprimir();
    System.out.print("A determinante: " + m1.determinante());
   } 
}
