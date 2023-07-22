public class Main {
    public static void main(String[] args) {

        Professor professor = new Professor("Rafael", "Fundamentos de Java");

        professor.criarTurma("FJ2023");

        professor.matricularAluno(new Aluno("João", professor.curso));
        professor.matricularAluno(new Aluno("Maria", professor.curso));
        professor.matricularAluno(new Aluno("José", professor.curso));
        professor.matricularAluno(new Aluno("XXXX", professor.curso));
        professor.matricularAluno(new Aluno("YYYY", professor.curso));

        professor.reservarSala("Sala 1");

       for(Aluno aluno: professor.listaAlunos){
           professor.darNotas(aluno,50);
           professor.darFaltas(aluno,2);
       }

       professor.apresentarInformacoes();

        for(Aluno aluno: professor.listaAlunos){
            aluno.apresentarInformacoes();
        }


    }
}