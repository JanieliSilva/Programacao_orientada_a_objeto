package Lista2;


public class Politico extends Pessoa {
    private String partido;
    private String cargo;


   public Politico(String nome, String cpf, int idade, String partido, String cargo) {
        super(nome, cpf, idade);
        this.partido = partido;
        this.cargo = cargo;
    }

    public String getPartido() {
        return partido;
    }
    public String getCargo() {
        return cargo;
    }
    public String toString(){
        return "===========DADOS DO POLITICO==============\n"+ super.toString() + "Partido: " + partido + "\nCargo: " + cargo + "\n";
    }
    
    
}
