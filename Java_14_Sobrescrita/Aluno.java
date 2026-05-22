package Java_14_Sobrescrita;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }

    // @Override indica que este metodo substitui o da superclasse
    // O compilador verifica se o metodo realmente existe em Pessoa
    @Override
    public void apresentar() {
        System.out.println("Aluno: " + nome + " | idade: " + idade + " | matricula: " + matricula);
    }

    // super.apresentar() chama a versao original da superclasse
    public void apresentarOriginal() {
        System.out.print("(versao Pessoa) -> ");
        super.apresentar();
    }

}
