package Java_13_Heranca;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 13 - Heranca ===\n");

        // Criando uma Pessoa diretamente
        System.out.println("--- Objeto Pessoa ---");
        Pessoa pessoa1 = new Pessoa("Carlos", 45);
        pessoa1.apresentar();
        System.out.println("Nome : " + pessoa1.getNome());
        System.out.println("Idade: " + pessoa1.getIdade());

        // Criando um Aluno (herda de Pessoa)
        System.out.println("\n--- Objeto Aluno (herda de Pessoa) ---");
        Aluno aluno1 = new Aluno("Maria", 20, 2024001);

        // Metodos herdados de Pessoa
        aluno1.apresentar();
        System.out.println("Nome (herdado) : " + aluno1.getNome());
        System.out.println("Idade (herdada): " + aluno1.getIdade());

        // Metodo proprio de Aluno
        aluno1.exibirMatricula();

        // Aluno E UMA Pessoa (relacao "is-a")
        System.out.println("\n--- Verificando o tipo com instanceof ---");
        System.out.println("aluno1 instanceof Aluno : " + (aluno1 instanceof Aluno));
        System.out.println("aluno1 instanceof Pessoa: " + (aluno1 instanceof Pessoa));
        System.out.println("pessoa1 instanceof Aluno: " + (pessoa1 instanceof Aluno));

        System.out.println("\n=== Conclusao ===");
        System.out.println("Aluno herda de Pessoa: tem tudo de Pessoa + o que e seu.");
        System.out.println("super() no construtor inicializa a parte herdada.");
        System.out.println("Todo Aluno E UMA Pessoa, mas nem toda Pessoa e um Aluno.");

    }

}
