package LISTA;
import java.util.ArrayList;

public class Clientes {
    int id;
    String nome;
    int idade;
    int telefone;

    public Clientes(int id, String nome, int idade, int telefone){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Clientes id = " + id + ", nome = " + nome + ", idade = " + idade + ", telefone = " + telefone + " ";
    }


    
}
