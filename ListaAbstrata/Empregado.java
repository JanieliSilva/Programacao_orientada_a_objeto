package ListaAbstrata;

public class Empregado extends Funcionario {

    private int idEmpregado;

    public Empregado(String nome, int idEmpregado) {
        super(nome);
        this.idEmpregado = idEmpregado;
    }
    public Empregado(String nome, double horaTrabalhada, int idEmpregado) {
        super(nome, horaTrabalhada);
        this.idEmpregado = idEmpregado;
    }

    public int getIdEmpregado(){
        return idEmpregado;
    }
    @Override
    public double calculaSalario() {
        // usa getters da superclasse em vez de acessar campos diretos
        return (getTotalDeHoras() * getHoraTrabalhada()) * getDiasTrabalhado();
    }

    
}
