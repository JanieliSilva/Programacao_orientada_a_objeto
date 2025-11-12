package ColecaoGenerica;

import java.util.Stack;

public class VerificaParenteses {
    public static void main(String[] args) {
        
        // Expressão definida diretamente no código
        String expressao = "(()((())()))";
        
        Stack<Character> pilha = new Stack<>();
        boolean balanceada = true; // assume que está balanceada até provar o contrário
        
        // Percorre cada caractere da string
        for (char c : expressao.toCharArray()) {
            if (c == '(') {
                pilha.push(c); // empilha '('
            } else if (c == ')') {
                if (pilha.isEmpty()) {
                    balanceada = false; // fecha sem abrir → erro
                    break;
                }
                pilha.pop(); // desempilha '(' correspondente
            } else {
                balanceada = false; // caractere inválido
                break;
            }
        }
        
        // Se ao final ainda sobrar '(' na pilha, não está balanceada
        if (!pilha.isEmpty()) {
            balanceada = false;
        }
        
        // Exibe o resultado final
        if (balanceada) {
            System.out.println("A expressão \"" + expressao + "\" está balanceada!");
        } else {
            System.out.println("A expressão \"" + expressao + "\" NÃO está balanceada!");
        }
    }
}
