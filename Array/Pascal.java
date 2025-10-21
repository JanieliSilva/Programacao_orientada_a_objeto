package Array;
import java.util.Scanner;

public class Pascal {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int linhas;

        System.out.print("Linhas: ");
        linhas = leitor.nextInt(); 

        int[][] pascal = new int[linhas][];

        // inicialização
        for (int i = 0; i < pascal.length; i++) {
            pascal[i] = new int[i + 1];  // cada linha tem i+1 elementos
            pascal[i][0] = 1;            // primeira coluna = 1
            pascal[i][i] = 1;            // última coluna = 1

            // preencher valores internos (se houver)
            for (int j = 1; j < pascal[i].length - 1; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        // imprimir
        for (int i = 0; i < pascal.length; i++) {
            for (int j = 0; j < pascal[i].length; j++) {
                System.out.print(pascal[i][j] + " ");
            }
            System.out.println();
        }

        leitor.close();
    }
}
