package Java_15_Abstrato;

// Classe ABSTRATA: nao pode ser instanciada diretamente
// Serve como molde obrigatorio para as subclasses
public abstract class Pessoa {

    protected String nome;
    protected int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() { return nome; }
    public int getIdade() { return idade; }

    // Metodo ABSTRATO: sem implementacao aqui
    // Toda subclasse OBRIGATORIAMENTE deve implementar
    public abstract void apresentar();

    // Metodo concreto: herdado por todos (nao precisa sobrescrever)
    public void exibirIdade() {
        System.out.println(nome + " tem " + idade + " anos.");
    }

}
