package Delegacao;


public class RegistroAcademicoPosGraduacao {
    private RegistroAcademico registroAcademico;
    private String tituloTese;
    private String orientador;



    public RegistroAcademicoPosGraduacao(RegistroAcademico registroAcademico, String tituloTese, String orientador) {
        this.registroAcademico = registroAcademico;
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }



    public RegistroAcademicoPosGraduacao(String nome, String matricula, String curso, String tituloTese, String orientador) {
        this.registroAcademico = new RegistroAcademico(nome, matricula, curso);
        this.tituloTese = tituloTese;
        this.orientador = orientador;
    }



    @Override
    public String toString() {
        return "RegistroAcademicoPosGraduacao [registroAcademico=" + registroAcademico + ", tituloTese=" + tituloTese
                + ", orientador=" + orientador + "]";
    }

    
    
}
