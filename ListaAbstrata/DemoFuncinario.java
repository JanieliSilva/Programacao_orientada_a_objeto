package ListaAbstrata;

public class DemoFuncinario {
 public static void main(String[] args){
    Empregado emp = new Empregado("Danielle", 18);
    double funcionarioDeTi = 8.5;
    Empregado emp2 = new Empregado("João", 25,funcionarioDeTi);

    System.out.println("\n======INFORMAÇÕES SOBRE O SALARIO DO FUNCIONARIO========");
    System.out.println("Nome do funcionario: " + emp.getNome()+ "\n");
    System.out.println("Seu numero de ID é: "+ emp.getIdEmpregado() + "\n");
    System.out.println("O valor da hora trabalhada é: R$ " + emp.getHoraTrabalhada()+ "\n");
    System.out.println("Total de horas trabalhadas por dia: " + emp.getTotalDeHoras()+ "h por dia!\n");
    System.out.println("Salário calculado: " + emp.calculaSalario());
    System.out.println("========================================================");
    System.out.println("Consulta realizada com sucesso!");
 }
}
