package Exercicio06_Ler_Atributos;

public class Principal {

    public static void main(String[] args) {

        Aluno objetoAluno = new Aluno();

        objetoAluno.nome = "Maria";
        objetoAluno.idade = 20;

        System.out.println(objetoAluno.nome);
        System.out.println(objetoAluno.idade);

    }
}