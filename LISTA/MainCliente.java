package LISTA;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCliente {
    public static void main(String[] args){
        ArrayList<Clientes> listaClientes = new ArrayList();
        Scanner leitor = new Scanner(System.in);

      while (true){
        System.out.println("Digite o id (Caso queira sair digite -1)");
        int id = leitor.nextInt();
        leitor.nextLine();
      
      if (id <0){
        break;
      }
      System.out.println("Digite seu nome: ");
      String nome = leitor.nextLine();
      System.out.println("Digite sua idade: ");
      int idade = leitor.nextInt();
      System.out.println("Digite seu telefone: ");
      int telefone = leitor.nextInt();
       
      listaClientes.add(new Clientes(id, nome, idade, telefone));
    }

 


     System.out.println("Lista de clientes:");
        for (Clientes c : listaClientes) {
            System.out.println(c);
        }
    }
}

