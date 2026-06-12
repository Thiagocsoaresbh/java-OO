package Java_17_Polimorfismo;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 17 - Polimorfismo ===\n");

        // --- UPCASTING ---
        // Referencia do tipo superclasse aponta para objeto de subclasse
        // Isso e automatico (implicito) em Java
        System.out.println("--- Upcasting (implicito) ---");
        Pessoa p1 = new Aluno("Maria", 20, 2024001);      // Aluno -> Pessoa
        Pessoa p2 = new Funcionario("Sergio", 40, "Professor"); // Funcionario -> Pessoa

        p1.apresentar(); // chama Aluno.apresentar()
        p2.apresentar(); // chama Funcionario.apresentar()

        // --- VINCULACAO DINAMICA (Dynamic Binding) ---
        // O metodo chamado e determinado em TEMPO DE EXECUCAO pelo tipo real do objeto
        System.out.println("\n--- Vinculacao dinamica (array de Pessoa) ---");
        Pessoa[] pessoas = {
            new Aluno("Ana", 19, 2024002),
            new Funcionario("Carlos", 35, "Coordenador"),
            new Aluno("Joao", 21, 2024003),
            new Funcionario("Lucia", 50, "Diretora")
        };

        // Cada chamada executa o apresentar() correto para o tipo real
        for (Pessoa p : pessoas) {
            p.apresentar();
        }

        // --- DOWNCASTING ---
        // Referencia superclasse -> subclasse (explicito, requer cuidado)
        System.out.println("\n--- Downcasting (explicito) ---");
        Pessoa ref = new Aluno("Bruno", 22, 2024004);

        // Precisamos verificar o tipo real antes de fazer o cast
        if (ref instanceof Aluno) {
            Aluno a = (Aluno) ref; // cast explicito
            System.out.println("Downcast OK. Matricula: " + a.getMatricula());
        }

        // Tentativa de downcast incorreto
        System.out.println("\n--- Downcast incorreto (ClassCastException) ---");
        Pessoa ref2 = new Funcionario("Paula", 30, "Analista");
        System.out.println("ref2 instanceof Aluno: " + (ref2 instanceof Aluno));
        if (ref2 instanceof Aluno) {
            Aluno a2 = (Aluno) ref2; // nunca entra aqui
            System.out.println("Matricula: " + a2.getMatricula());
        } else {
            System.out.println("Cast nao realizado: ref2 nao e um Aluno.");
        }

        System.out.println("\n=== Conclusao ===");
        System.out.println("Upcasting   : automatico, subclasse -> superclasse.");
        System.out.println("Polimorfismo: mesmo metodo, comportamentos diferentes.");
        System.out.println("Downcasting : manual, use instanceof antes de converter.");

    }

}
