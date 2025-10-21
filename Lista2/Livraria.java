package Lista2;

public class Livraria extends Livro{
    private float preco;
    private int estoque;

   public Livraria(String titulo, String autor, String editora, float preco, int estoque){
    super(titulo, autor, editora);
    this.preco = preco;
    this.estoque = estoque;
   }
    public float getPreco() {
     return preco;
    }
    
    public String toString(){
        return "===========LIVRARIA VALENTIM==============\n"+ super.toString() + " Preco: R$" + preco + " Estoque: " + estoque + " unidades.";
    
     }
    }

    

