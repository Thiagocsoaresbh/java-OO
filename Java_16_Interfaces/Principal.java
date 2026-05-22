package Java_16_Interfaces;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 16 - Interfaces ===\n");

        Aluno aluno1 = new Aluno("Maria", 8.5, 7.0);
        Aluno aluno2 = new Aluno("Carlos", 4.0, 5.5);
        Aluno aluno3 = new Aluno("Ana", 6.0, 5.0);

        // Usando os contratos de Descricao e Calculavel
        System.out.println("--- Descricao e calculo de media ---");
        for (Aluno a : new Aluno[]{aluno1, aluno2, aluno3}) {
            double media = a.calcularMedia();
            System.out.println(a.getDescricao());
            System.out.println("  Media: " + media + " | " + a.classificar(media));
        }

        // Referencia pelo tipo da interface
        System.out.println("\n--- Referencia pelo tipo da interface ---");
        Descricao d1 = new Aluno("Joao", 9.0, 8.0);
        Descricao d2 = new Turma("TI-2024-A", 30);

        // Tanto Aluno quanto Turma implementam Descricao
        System.out.println(d1.getDescricao());
        System.out.println(d2.getDescricao());

        // Turma nao implementa Calculavel, so Aluno
        System.out.println("\n--- Usando interface Calculavel diretamente ---");
        Calculavel c1 = new Aluno("Lucia", 7.5, 8.0);
        System.out.printf("Media: %.1f | %s%n", c1.calcularMedia(), c1.classificar(c1.calcularMedia()));

        System.out.println("\n=== Conclusao ===");
        System.out.println("Interface = contrato: define o QUE, nao o COMO.");
        System.out.println("Uma classe pode implementar multiplas interfaces.");
        System.out.println("Classes nao relacionadas podem assinar o mesmo contrato.");

    }

}
