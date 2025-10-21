package Lista2;

public class Biblioteca extends Livro{
    private boolean emprestado;

 public Biblioteca(String titulo, String autor, String editora, boolean emprestado) {
        super(titulo, autor, editora);
        this.emprestado = false;
    }
 
public void situacaoDoLivro(){
    if(!emprestado){
        emprestado = true;
        System.out.println("Livro emprestado com sucesso!");
    } else {
        System.out.println("Livro indisponivel para emprestimo.");
    }
}

    public String toString(){
        return "===========BIBLIOTECA MUNICIPAL==============\n"+ super.toString() + " Situacao do livro: " + (emprestado ? " Emprestado " : " Disponivel");
    
    }

    
    
}
