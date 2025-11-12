package ListaAbstrata;

public class Quadrado  extends FiguraGeometrica {
    private double lado;
    private double area;

    public Quadrado(String descricao, double lado) {
        super(descricao);
        this.lado = lado;
        this.area = lado * lado;
    }

    public void Descrever(){
        System.out.println("Quadrado: " + getDescrição() +  " Calculando sua area lado x lado: \n" + area);
    }

}
