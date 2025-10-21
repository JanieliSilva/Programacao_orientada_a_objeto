package Lista2;

public class Governador extends Politico{
    private String estado;

    public Governador(String nome, String cpf, int idade, String partido, String cargo, String estado) {
        super(nome, cpf, idade, partido, cargo);
        this.estado = estado;
    }

    public String getEstado(){
    return estado;
    }
    public String toString(){
        return "===========DADOS DO GOVERNADOR==============\n"+ super.toString() + "Estado: " + estado + "\n";
    }
}