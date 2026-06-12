package Java_02_Objeto;

public class Principal {

    public static void main(String[] args) {

        // Esta linha faz tres coisas ao mesmo tempo:
        //
        // 1) "Aluno"       -> tipo da variavel (so aceita objetos do molde Aluno)
        // 2) "objetoAluno" -> nome da variavel; guarda o ENDERECO do objeto na memoria
        // 3) "new Aluno()" -> "new" aloca espaco na memoria e cria o objeto;
        //                     "Aluno()" chama o construtor (metodo especial de inicializacao)
        //
        // Resultado: objetoAluno aponta para um Aluno real que existe na memoria.
        Aluno objetoAluno = new Aluno();

        // Imprime o endereco de memoria do objeto (algo como Java_02_Objeto.Aluno@1b6d3586).
        // Prova que o objeto existe, mesmo sem dados preenchidos ainda.
        System.out.println(objetoAluno);
        System.out.println("Exercicio 02 - Objeto criado com sucesso.");
        System.out.println("Esse objetoAluno e um Aluno real (instancia) criado a partir da classe Aluno.");

    }

}
