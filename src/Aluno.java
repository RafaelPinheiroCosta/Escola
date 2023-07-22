public class Aluno extends Usuario{

    int nota;
    int faltas;

    public Aluno(String nome, String curso) {
        super(nome,curso,"Aluno");
    }

    public void receberNota(int nota){
        if(nota<=100) {
            this.nota = nota;
        }else{
            System.out.println("nota inválida, somente são permitidas notas <=100");
        }
    }
    public void receberFaltas(int faltas){
        if(faltas<=120){
            this.faltas +=faltas;
        }else{
            System.out.println("O aluno já ultrapassou o limite de faltas");
        }
    }
    @Override
    public void apresentarInformacoes() {
        super.apresentarInformacoes();
        System.out.println("Suas informações academicas são:");
        System.out.println("Nota: " + this.nota);
        System.out.println("Faltas: " + this.faltas);
    }
}
