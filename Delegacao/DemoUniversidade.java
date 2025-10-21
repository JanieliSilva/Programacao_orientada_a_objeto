package Delegacao;

public class DemoUniversidade {
    public static void main(String[] args) {
        RegistroAcademicoPosGraduacao registro1 = new RegistroAcademicoPosGraduacao("Janieli", "2022001", "Engenharia de Software", "Sistema de Recomendação para Livros", "Dr. Silva");
        RegistroAcademicoPosGraduacao registro2 = new RegistroAcademicoPosGraduacao(new RegistroAcademico("Carlos", "2022002", "Ciência da Computação"), "Análise de Algoritmos em Grafos", "Dra. Souza");

        System.out.println(registro1);
        System.out.println(registro2);
    }
}
