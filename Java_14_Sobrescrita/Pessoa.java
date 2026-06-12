package Java_14_Sobrescrita;

public class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    // Este metodo sera SOBRESCRITO pelas subclasses
    public void apresentar() {
        System.out.println("Pessoa: " + nome + ", " + idade + " anos.");
    }

}
