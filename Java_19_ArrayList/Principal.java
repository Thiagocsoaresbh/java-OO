package Java_19_ArrayList;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        System.out.println("=== Exercicio 19 - ArrayList ===\n");

        // --- CRIANDO O ARRAYLIST ---
        // ArrayList nao precisa de tamanho fixo — cresce conforme elementos sao adicionados
        System.out.println("--- Criando o ArrayList ---");
        ArrayList<Aluno> turma = new ArrayList<>();
        System.out.println("Tamanho inicial: " + turma.size());

        // --- ADICIONANDO ELEMENTOS ---
        System.out.println("\n--- Adicionando elementos com add() ---");
        turma.add(new Aluno("Ana",   2024001, 8.5));
        turma.add(new Aluno("Bruno", 2024002, 6.0));
        turma.add(new Aluno("Carla", 2024003, 9.2));
        System.out.println("Tamanho apos 3 adds: " + turma.size());

        // --- ACESSANDO ELEMENTOS ---
        System.out.println("\n--- Acessando com get() ---");
        System.out.println("turma.get(0).getNome(): " + turma.get(0).getNome());
        System.out.println("turma.get(2).getNome(): " + turma.get(2).getNome());

        // --- FOR-EACH ---
        System.out.println("\n--- For-each ---");
        for (Aluno a : turma) {
            a.apresentar();
        }

        // --- REMOVENDO POR INDICE ---
        System.out.println("\n--- Removendo por indice ---");
        System.out.println("Removendo turma.remove(1) (Bruno)...");
        turma.remove(1);
        System.out.println("Tamanho apos remove: " + turma.size());
        for (Aluno a : turma) {
            a.apresentar();
        }

        // --- ADICIONANDO APOS REMOVER ---
        System.out.println("\n--- Adicionando apos remover ---");
        turma.add(new Aluno("Daniel", 2024004, 7.8));
        System.out.println("Tamanho: " + turma.size());
        for (Aluno a : turma) {
            a.apresentar();
        }

        // --- COMPARACAO ARRAY vs ARRAYLIST ---
        System.out.println("\n--- Comparacao: Array vs ArrayList ---");
        System.out.println("Array:     tamanho fixo, definido na criacao");
        System.out.println("ArrayList: tamanho dinamico, cresce e encolhe automaticamente");
        System.out.println("Array:     acesso com turma[i]");
        System.out.println("ArrayList: acesso com turma.get(i)");
        System.out.println("Array:     tamanho com turma.length");
        System.out.println("ArrayList: tamanho com turma.size()");
        System.out.println("Array:     permite tipos primitivos (int[], double[])");
        System.out.println("ArrayList: requer tipos objeto (Integer, Double)");

        System.out.println("\n=== Conclusao ===");
        System.out.println("ArrayList e uma lista dinamica: add() adiciona, remove() remove, get() acessa.");
        System.out.println("Use ArrayList quando nao souber quantos objetos vao existir.");
        System.out.println("Use Array quando o tamanho for fixo e conhecido desde o inicio.");

    }

}
