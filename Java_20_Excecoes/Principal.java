package Java_20_Excecoes;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 20 - Excecoes ===\n");

        // --- TRY-CATCH BASICO ---
        // Sem try-catch, a excecao encerra o programa imediatamente
        // Com try-catch, o erro e capturado e o programa continua
        System.out.println("--- Try-catch basico ---");
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Excecao capturada: " + e.getMessage());
        }
        System.out.println("Programa continua apos o catch.");

        // --- NULLPOINTEREXCEPTION ---
        // Mesma excecao que ocorreria no ex 18 sem o if (lista[i] != null)
        System.out.println("\n--- NullPointerException ---");
        Aluno aluno = null;
        try {
            aluno.apresentar();
        } catch (NullPointerException e) {
            System.out.println("Excecao capturada: tentativa de usar objeto nulo.");
        }

        // --- ARRAYINDEXOUTOFBOUNDSEXCEPTION ---
        System.out.println("\n--- ArrayIndexOutOfBoundsException ---");
        int[] numeros = {10, 20, 30};
        try {
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excecao capturada: " + e.getMessage());
        }

        // --- MULTIPLOS CATCH ---
        // Um bloco try pode ter varios catch — cada um trata um tipo diferente
        System.out.println("\n--- Multiplos catch ---");
        Object[] itens = {"texto", null, 42};
        for (int i = 0; i <= itens.length; i++) {
            try {
                System.out.println(((String) itens[i]).toUpperCase());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Indice fora do limite: " + i);
            } catch (NullPointerException e) {
                System.out.println("Item null no indice: " + i);
            } catch (ClassCastException e) {
                System.out.println("Tipo incorreto no indice: " + i);
            }
        }

        // --- THROW: LANCANDO EXCECAO ---
        // throw permite que uma classe valide seus proprios dados e rejeite entradas invalidas
        System.out.println("\n--- Throw: lancando excecao com regra de negocio ---");
        try {
            Aluno valido = new Aluno("Ana", 2024001, 8.5);
            valido.apresentar();
            new Aluno("Bruno", 2024002, 15.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Excecao capturada: " + e.getMessage());
        }

        // --- FINALLY ---
        // O bloco finally executa SEMPRE: com excecao ou sem excecao
        System.out.println("\n--- Finally ---");
        try {
            System.out.println("Dentro do try");
            System.out.println(5 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Dentro do catch: " + e.getMessage());
        } finally {
            System.out.println("Dentro do finally — executa SEMPRE");
        }

        System.out.println("\n=== Conclusao ===");
        System.out.println("Excecoes sinalizam erros em tempo de execucao.");
        System.out.println("try-catch impede que o programa quebre.");
        System.out.println("throw permite criar regras de negocio com validacao.");
        System.out.println("finally executa sempre, seja com excecao ou sem.");

    }

}
