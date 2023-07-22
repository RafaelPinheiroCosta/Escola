import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario{
    List<Aluno> listaAlunos = new ArrayList<>();

    Professor(String nome, String curso) {
        super(nome, curso, "Professor");
    }
    public void criarTurma(String turma){
        super.turma = turma;

        System.out.println("Turma criada com sucesso!!");
    }
    public void matricularAluno(Aluno aluno){
        aluno.turma = super.turma;
        listaAlunos.add(aluno);

        System.out.println("Aluno matriculado com sucesso!!");
    }
    public void darNotas(Aluno aluno, int nota){
        aluno.receberNota(nota);

        System.out.println("Nota Atribuida com sucesso!!");
    }
    public void darFaltas(Aluno aluno, int faltas){
        aluno.receberFaltas(faltas);

        System.out.println("Faltas Atribuidas com sucesso!!");
    }
    public void reservarSala(String sala){
        super.sala = sala;
        for(Aluno aluno: listaAlunos){
            aluno.sala = sala;
        }
        System.out.println("Sala Reservada com sucesso!!");
    }
}
