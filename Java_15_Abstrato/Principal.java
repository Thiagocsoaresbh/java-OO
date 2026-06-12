package Java_15_Abstrato;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 15 - Classes Abstratas ===\n");

        // Pessoa p = new Pessoa("X", 0);  <- ERRO: nao pode instanciar classe abstrata

        // Subclasses concretas podem ser instanciadas normalmente
        System.out.println("--- Instanciando subclasses ---");
        Aluno aluno1 = new Aluno("Maria", 20, 2024001);
        Funcionario func1 = new Funcionario("Sergio", 40, "Professor", 5000.00);

        // Cada um tem sua propria versao de apresentar()
        aluno1.apresentar();
        func1.apresentar();

        // Metodo concreto herdado por ambos
        System.out.println("\n--- Metodo concreto herdado (exibirIdade) ---");
        aluno1.exibirIdade();
        func1.exibirIdade();

        // Usando referencia do tipo abstrato (Pessoa) para referenciar subclasses
        System.out.println("\n--- Referencia do tipo Pessoa (abstrato) ---");
        Pessoa p1 = new Aluno("Carlos", 22, 2024002);
        Pessoa p2 = new Funcionario("Ana", 35, "Coordenadora", 7000.00);

        p1.apresentar(); // chama o apresentar() de Aluno
        p2.apresentar(); // chama o apresentar() de Funcionario

        System.out.println("\n=== Conclusao ===");
        System.out.println("Classe abstrata: nao pode ser instanciada diretamente.");
        System.out.println("Metodo abstrato: obriga subclasses a implementar.");
        System.out.println("Referencia abstrata: pode apontar para qualquer subclasse.");

    }

}
