package Lista2;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;

    public Livro(String titulo, String autor, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.editora = editora;
    }

    public String getTitulo() { 
        return titulo;
     }
    public String getAutor() {
         return autor; 
     }
    public String getEditora() {
         return editora;
     }

     public String toString(){
        return "O livro: " + titulo + " é do autor(a): " + autor + " e da editora " + editora;
    
     }
}
