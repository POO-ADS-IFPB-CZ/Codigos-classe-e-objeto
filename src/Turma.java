public class Turma {

    private Professor professor;
    private Aluno[] alunos;
    private String disciplina;
    private String horario;
    private String curso;
    private int sala;
    private int contAlunos;

    public Turma(Professor professor, String disciplina,
                 String horario, String curso, int sala) {
        this.professor = professor;
        alunos = new Aluno[40];
        contAlunos = 0;
        this.disciplina = disciplina;
        this.horario = horario;
        this.curso = curso;
        this.sala = sala;
    }

    public boolean adicionarAluno(Aluno aluno) {
        if(contAlunos >= alunos.length) return false;
        alunos[contAlunos++] = aluno;
        return true;
    }

}
