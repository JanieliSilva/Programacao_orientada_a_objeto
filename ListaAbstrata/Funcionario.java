package ListaAbstrata;

public abstract class Funcionario {
    private String nome;
    private int totalDeHoras;
    private double horaTrabalhada;
    private int diasTrabalhado;
    private double valortotal;

    public Funcionario(String nome) {
        this.nome = nome;
        this.horaTrabalhada = 2.0;
        this.totalDeHoras = 8;
        this.diasTrabalhado = 27;

    }
    

    public Funcionario(String nome, double horaTrabalhada) {
        this.nome = nome;
        this.horaTrabalhada = horaTrabalhada;
        this.totalDeHoras = 8;
        this.diasTrabalhado = 27;
    }


    public double calculaSalario(){
        return ((this.totalDeHoras * this.horaTrabalhada) * this.diasTrabalhado);
    }

    public String getNome() {
        return nome;
    }

    public int getTotalDeHoras() {
        return totalDeHoras;
    }

    public double getHoraTrabalhada() {
        return horaTrabalhada;
    }

    public int getDiasTrabalhado() {
        return diasTrabalhado;
    }

    public double getValortotal() {
        return valortotal;
    }
    
}
