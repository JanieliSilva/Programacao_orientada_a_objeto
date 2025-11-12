package ListaAbstrata;

public class Circulo  extends FiguraGeometrica{
    private double raio;
    private double area;
    private double Mathi = 3.14;

    public Circulo (String descricao, double raio){
        super(descricao);
        this.raio = raio;
        this.area = Mathi * (raio * raio);
    }


    public void Descrever(){
        System.out.println("Círculo: " + getDescrição() + " - Raio: " + raio + " - Área: " + area);
    }
    
    public double getArea(){
        return area;
    }
    
    public double getRaio(){
        return raio;
    }


}
