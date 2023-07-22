public class Usuario {

    String nome;
    String turma;
    String sala;
    String curso;
    String tipoUsuario;

    public Usuario(String nome,  String curso,  String tipoUsuario) {
        this.nome = nome;
        this.curso = curso;
        this.tipoUsuario = tipoUsuario;
    }

    public void apresentarInformacoes(){
        System.out.println("-----------"+tipoUsuario+"-----------");
        System.out.println("Nome: "+nome);
        System.out.println(("Curso: "+curso));
        System.out.println(("Turma: "+turma));
        System.out.println(("sala: "+sala));
    }
}
