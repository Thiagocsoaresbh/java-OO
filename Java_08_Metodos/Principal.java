package Java_08_Metodos;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 08 - Metodos ===\n");

        Aluno aluno1 = new Aluno("Joao Silva", 18);
        Aluno aluno2 = new Aluno("Maria Santos", 16);

        // --- Metodo VOID: apenas executa, nao ha valor de retorno para guardar ---
        System.out.println("--- Metodo VOID: apresentar() ---");
        aluno1.apresentar(); // "objeto.metodo()" -> chama o metodo no objeto especifico
        aluno2.apresentar();

        // --- Metodo VOID com PARAMETRO: passa um valor entre parenteses ---
        System.out.println("\n--- Metodo VOID com parametro: fazer(nota) ---");
        aluno1.fazer(85); // 85 e o argumento passado, recebido como "nota" dentro do metodo
        aluno2.fazer(92);

        // --- Metodo com RETORNO int: o resultado pode ser guardado em uma variavel ---
        System.out.println("\n--- Metodo com RETORNO (int): calcularAnoNascimento() ---");
        int anoJoao = aluno1.calcularAnoNascimento(); // o "return" do metodo vai para "anoJoao"
        int anoMaria = aluno2.calcularAnoNascimento();
        System.out.println("Joao nasceu em: " + anoJoao);
        System.out.println("Maria nasceu em: " + anoMaria);

        // --- Metodo com RETORNO String ---
        System.out.println("\n--- Metodo com RETORNO (String): obterCategoria() ---");
        String categJoao = aluno1.obterCategoria();
        String categMaria = aluno2.obterCategoria();
        System.out.println(aluno1.nome + " e: " + categJoao);
        System.out.println(aluno2.nome + " e: " + categMaria);

        // --- Metodo com PARAMETRO e RETORNO ---
        System.out.println("\n--- Metodo com parametro E retorno: multiplicarIdade(int) ---");
        int idadeX2_Joao = aluno1.multiplicarIdade(2);
        int idadeX3_Maria = aluno2.multiplicarIdade(3);
        System.out.println("Idade de Joao vezes 2: " + idadeX2_Joao);
        System.out.println("Idade de Maria vezes 3: " + idadeX3_Maria);

        // --- Metodo que chama outros metodos internamente ---
        // exibirInfo() nao precisa de nada: ele mesmo chama calcularAnoNascimento() e obterCategoria()
        System.out.println("\n--- Metodo que agrega outros: exibirInfo() ---");
        aluno1.exibirInfo();
        aluno2.exibirInfo();

        // --- Usando retorno diretamente no println (sem variavel intermediaria) ---
        System.out.println("\n--- Usando tudo junto ---");
        Aluno aluno3 = new Aluno("Carlos", 20);
        aluno3.apresentar();
        System.out.println("Nascimento estimado: " + aluno3.calcularAnoNascimento()); // retorno usado inline
        System.out.println("Categoria: " + aluno3.obterCategoria());
        aluno3.fazer(75);

        System.out.println("\n=== Conclusao ===");
        System.out.println("Metodos adicionam COMPORTAMENTO aos objetos.");
        System.out.println("Metodos VOID: fazem algo mas nao retornam nada.");
        System.out.println("Metodos com RETORNO: fazem algo e devolvem um resultado.");

    }

}
