package Java_15_Abstrato;

public class Funcionario extends Pessoa {

    private String cargo;
    private double salario;

    public Funcionario(String nome, int idade, String cargo, double salario) {
        super(nome, idade);
        this.cargo = cargo;
        this.salario = salario;
    }

    // Obrigatorio implementar o metodo abstrato da superclasse
    @Override
    public void apresentar() {
        System.out.println("[Funcionario] " + nome + " | cargo: " + cargo + " | salario: R$ " + salario);
    }

}
