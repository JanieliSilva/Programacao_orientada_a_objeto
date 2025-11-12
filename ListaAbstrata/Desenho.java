package ListaAbstrata;

public class Desenho {
    private FiguraGeometrica figura1;
    private int x1, y1;

    public Desenho (FiguraGeometrica figura1, int x1, int y1){
        this.figura1 = figura1;
        this.x1 = x1;
        this.y1 = y1;
    }

    public void Descrever(){
        System.out.println("Desenho da figura: " + figura1.getDescrição() + " na posição (" + x1 + ", " + y1 + ")");
    }

}
