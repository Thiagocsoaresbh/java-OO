package Java_18_Arrays;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 18 - Arrays de Objetos ===\n");

        // --- CRIANDO O ARRAY ---
        // Declarar um array NAO cria os objetos — cria apenas os "espacos" (slots)
        // Cada posicao inicia com null ate ser preenchida
        System.out.println("--- Criando o array ---");
        Aluno[] turma = new Aluno[4];

        System.out.println("turma[0] antes de preencher: " + turma[0]);
        System.out.println("Tamanho do array: " + turma.length);

        // --- PREENCHENDO O ARRAY ---
        System.out.println("\n--- Preenchendo o array ---");
        turma[0] = new Aluno("Ana",    2024001, 8.5);
        turma[1] = new Aluno("Bruno",  2024002, 6.0);
        turma[2] = new Aluno("Carla",  2024003, 9.2);
        turma[3] = new Aluno("Daniel", 2024004, 7.8);

        System.out.println("turma[0] depois de preencher: " + turma[0]);
        System.out.println("turma[0].getNome(): " + turma[0].getNome());

        // --- FOR TRADICIONAL ---
        System.out.println("\n--- For tradicional (com indice) ---");
        for (int i = 0; i < turma.length; i++) {
            System.out.print("turma[" + i + "] -> ");
            turma[i].apresentar();
        }

        // --- FOR-EACH ---
        System.out.println("\n--- For-each (sem indice) ---");
        for (Aluno a : turma) {
            a.apresentar();
        }

        // --- MAIOR NOTA ---
        System.out.println("\n--- Aluno com maior nota ---");
        Aluno destaque = turma[0];
        for (int i = 1; i < turma.length; i++) {
            if (turma[i].getNota() > destaque.getNota()) {
                destaque = turma[i];
            }
        }
        System.out.println("Maior nota: " + destaque.getNome() + " (" + destaque.getNota() + ")");

        // --- POSICAO VAZIA (null) ---
        System.out.println("\n--- Array com posicao vazia ---");
        Aluno[] lista = new Aluno[3];
        lista[0] = new Aluno("Eva",    2024005, 7.0);
        // lista[1] continua null
        lista[2] = new Aluno("Felipe", 2024006, 8.0);

        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                lista[i].apresentar();
            } else {
                System.out.println("lista[" + i + "] -> vazia (null)");
            }
        }

        System.out.println("\n=== Conclusao ===");
        System.out.println("Array de objetos: armazena referencias, nao os objetos diretamente.");
        System.out.println("new Aluno[4]: reserva 4 espacos, todos null inicialmente.");
        System.out.println("Sempre verifique null antes de usar posicoes que podem estar vazias.");

    }

}