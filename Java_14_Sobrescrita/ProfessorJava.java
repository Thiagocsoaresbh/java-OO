package Java_14_Sobrescrita;

public class ProfessorJava extends Pessoa {

    private String disciplina;

    public ProfessorJava(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    @Override
    public void apresentar() {
        System.out.println("Professor: " + nome + " | disciplina: " + disciplina);
    }

}
