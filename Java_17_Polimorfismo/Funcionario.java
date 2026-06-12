package Java_17_Polimorfismo;

public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    @Override
    public void apresentar() {
        System.out.println("[Funcionario] " + nome + " | cargo: " + cargo);
    }

    public String getCargo() { return cargo; }

}
