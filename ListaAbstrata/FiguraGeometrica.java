package ListaAbstrata;

public abstract class FiguraGeometrica {

    private String descricao;

    public FiguraGeometrica (String descricao){
        this.descricao = descricao;
    }

    public String getDescrição(){
        return descricao;
    }
    public abstract void Descrever();
}
