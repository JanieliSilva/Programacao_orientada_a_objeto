package Lista2;

public class Prefeiro extends Politico {
    private String cidade;

    public Prefeiro(String nome, String cpf, int idade, String partido, String cargo, String cidade) {
        super(nome, cpf, idade, partido, cargo);
        this.cidade = cidade;
    }

public String getCidade(){
    return cidade;
}

public String toString(){
    return "===========DADOS DO PREFEITO==============\n"+ super.toString() + "Cidade: " + cidade + "\n";
}
}
