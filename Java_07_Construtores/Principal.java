package Java_07_Construtores;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 07 - Construtores ===\n");

        // --- Jeito 1: construtor vazio + atribuicao manual depois ---
        // "new Aluno()" chama o construtor sem parametros -> nasce com null e 0
        System.out.println("--- Jeito 1: Construtor vazio (como nos exercicios anteriores) ---");
        Aluno aluno1 = new Aluno();
        System.out.println("Criado: aluno1 = new Aluno();");
        System.out.println("Nome: " + aluno1.nome);   // null (ainda nao preenchido)
        System.out.println("Idade: " + aluno1.idade); // 0

        aluno1.nome = "Joao Silva";
        aluno1.idade = 18;
        System.out.println("\nDepois de preencher:");
        System.out.println("Nome: " + aluno1.nome);
        System.out.println("Idade: " + aluno1.idade);

        // --- Jeito 2: construtor com parametros ---
        // "new Aluno("Maria Santos", 20)" chama o segundo construtor
        // Os valores sao passados diretamente e atribuidos via this dentro do construtor
        System.out.println("\n--- Jeito 2: Construtor com parametros (novo jeito) ---");
        Aluno aluno2 = new Aluno("Maria Santos", 20);
        System.out.println("Criado: aluno2 = new Aluno(\"Maria Santos\", 20);");
        System.out.println("Nome: " + aluno2.nome);
        System.out.println("Idade: " + aluno2.idade);

        // --- Jeito 3: vazio + preenche depois (mesmo que jeito 1) ---
        System.out.println("\n--- Jeito 3: Construtor vazio, depois preenche ---");
        Aluno aluno3 = new Aluno();
        aluno3.nome = "Carlos";
        aluno3.idade = 19;
        System.out.println("Nome: " + aluno3.nome);
        System.out.println("Idade: " + aluno3.idade);

        // --- Jeito 4: varios objetos com construtor parametrizado ---
        // Uma linha por aluno em vez de tres — mais pratico para grandes quantidades
        System.out.println("\n--- Jeito 4: Multiplos objetos (construtor parametrizado) ---");
        Aluno aluno4 = new Aluno("Ana", 21);
        Aluno aluno5 = new Aluno("Bruno", 17);
        Aluno aluno6 = new Aluno("Carla", 19);

        // "+" concatena String com int automaticamente (Java converte int para String)
        System.out.println("Aluno 4: " + aluno4.nome + " (" + aluno4.idade + " anos)");
        System.out.println("Aluno 5: " + aluno5.nome + " (" + aluno5.idade + " anos)");
        System.out.println("Aluno 6: " + aluno6.nome + " (" + aluno6.idade + " anos)");

        System.out.println("\n=== Conclusao ===");
        System.out.println("Construtores permitem inicializar o objeto com dados");
        System.out.println("desde o momento da criacao, evitando esquecer de preencher.");

    }

}
