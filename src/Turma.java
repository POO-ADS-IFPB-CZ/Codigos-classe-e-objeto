public class Turma {

    private Professor professor;
    private Aluno[] alunos;
    private String disciplina;
    private String horario;
    private String curso;
    private int sala;

    public Turma(Professor professor, Aluno[] alunos, String disciplina,
                 String horario, String curso, int sala) {
        this.professor = professor;
        this.alunos = alunos;
        this.disciplina = disciplina;
        this.horario = horario;
        this.curso = curso;
        this.sala = sala;
    }

}
