package Java_05_Preencher;

public class Principal {

    public static void main(String[] args) {

        Aluno aluno = new Aluno(); // objeto nasce com nome=null e idade=0

        // Preenchendo atributos apos a criacao:
        // "aluno.nome" -> usando o ponto "." para acessar o atributo do objeto
        // "="          -> operador de ATRIBUICAO: coloca o valor da direita dentro da variavel da esquerda
        // "Joao Silva" -> literal String: texto entre aspas duplas
        aluno.nome = "Joao Silva";

        // "18" e um literal int: numero inteiro sem aspas
        aluno.idade = 18;

        // Lendo os valores que acabamos de escrever:
        // "+" dentro de println concatena (junta) textos e valores em uma so String
        System.out.println(aluno.nome);
        System.out.println(aluno.idade);

    }

}
