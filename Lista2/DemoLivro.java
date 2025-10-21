package Lista2;

public class DemoLivro {
    public static void main(String[] args){
        Livro l1 = new Livro("O senhor dos aneis", "J.R.R. Tolkien", "HarperCollins");
        System.out.println(l1);
        Livraria li1 = new Livraria("O senhor dos aneis", "J.R.R. Tolkien", "HarperCollins", 59.99f, 100);
        System.out.println(li1);
        Biblioteca b1 = new Biblioteca("O senhor dos aneis", "J.R.R. Tolkien", "HarperCollins", true);
        System.out.println(b1);
    }
}
