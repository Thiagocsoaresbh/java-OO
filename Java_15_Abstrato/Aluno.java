package Java_15_Abstrato;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    // Obrigatorio implementar o metodo abstrato da superclasse
    @Override
    public void apresentar() {
        System.out.println("[Aluno] " + nome + " | matricula: " + matricula);
    }

}
