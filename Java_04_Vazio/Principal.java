package Java_04_Vazio;

public class Principal {

    public static void main(String[] args) {

        // Criamos o objeto sem preencher nenhum dado.
        // O Java ja aloca espaco na memoria e define os valores padrao automaticamente.
        Aluno aluno = new Aluno();

        System.out.println("Exercicio 04 - Objeto nasce com valores padrao.");

        // "aluno.nome"  -> acessa o atributo "nome" do objeto "aluno"
        // O ponto "."   -> operador de acesso: "do objeto aluno, pegue nome"
        System.out.println("nome (String) = " + aluno.nome);  // imprime: null
        System.out.println("idade (int)   = " + aluno.idade); // imprime: 0

        // "null" nao e o texto "null" — significa que a variavel nao aponta para nenhum objeto.
        // Tentar chamar metodos em null causaria um erro (NullPointerException).

    }

}
