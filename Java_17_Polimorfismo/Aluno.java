package Java_17_Polimorfismo;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    @Override
    public void apresentar() {
        System.out.println("[Aluno]      " + nome + " | matricula: " + matricula);
    }

    public int getMatricula() { return matricula; }

}
