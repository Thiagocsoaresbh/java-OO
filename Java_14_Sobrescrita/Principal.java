package Java_14_Sobrescrita;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 14 - Sobrescrita de Metodos (@Override) ===\n");

        // Pessoa usa o proprio apresentar()
        System.out.println("--- Pessoa (sem sobrescrita) ---");
        Pessoa pessoa1 = new Pessoa("Carlos", 45);
        pessoa1.apresentar();

        // Aluno sobrescreve apresentar()
        System.out.println("\n--- Aluno (com @Override) ---");
        Aluno aluno1 = new Aluno("Maria", 20, 2024001);
        aluno1.apresentar();

        // ProfessorJava tambem sobrescreve apresentar()
        System.out.println("\n--- Professor (com @Override) ---");
        ProfessorJava prof1 = new ProfessorJava("Sergio", 40, "Java OO");
        prof1.apresentar();

        // Usando super.apresentar() dentro de Aluno
        System.out.println("\n--- Chamando super.apresentar() de dentro de Aluno ---");
        aluno1.apresentarOriginal();

        // Cada classe tem sua propria versao do metodo
        System.out.println("\n--- Todos chamando apresentar() ---");
        pessoa1.apresentar();
        aluno1.apresentar();
        prof1.apresentar();

        System.out.println("\n=== Conclusao ===");
        System.out.println("@Override substitui o metodo da superclasse.");
        System.out.println("super.metodo() acessa a versao da superclasse.");
        System.out.println("Cada subclasse pode ter seu proprio comportamento.");

    }

}
