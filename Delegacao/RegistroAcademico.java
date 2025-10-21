package Delegacao;

public class RegistroAcademico {
    private String nome;
    private String matricula;
    private String curso;
   

    RegistroAcademico(String nome, String matricula, String curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        
    }

    

   public String toString() {
    return "RegistroAcademico [nome=" + nome + ", matricula=" + matricula + ", curso=" + curso + "]";
   }
}


    


    



