package ListaAbstrata;

public class Thiangulo  extends FiguraGeometrica{
    private double base;
    private double altura;
    private double area;

    public Thiangulo (String descricao, double altura, double base){
        super(descricao);
        this.altura = altura;
        this.base = base;
        this.area = (base * altura) / 2;
    }


    public void Descrever(){
        System.out.println("Triangulo: " + getDescrição() +  " Calculando sua area base x altura / 2: \n" + area);
    }
    
    public double getArea(){
        return area;
    }
    
    public double getBase(){
        return base;
    }


}
