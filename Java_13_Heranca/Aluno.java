package Java_13_Heranca;

// Subclasse: herda tudo de Pessoa e acrescenta o que e especifico de Aluno
public class Aluno extends Pessoa {

    private int matricula;

    // super(...) chama o construtor da superclasse Pessoa
    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    public int getMatricula() { return matricula; }

    public void exibirMatricula() {
        System.out.println("Matricula: " + matricula);
    }

}
