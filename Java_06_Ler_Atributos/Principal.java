package Java_06_Ler_Atributos;

public class Principal {

    public static void main(String[] args) {

        Aluno objetoAluno = new Aluno();

        // ESCRITA: ponto "." + "=" atribui um valor ao atributo
        objetoAluno.nome = "Maria";
        objetoAluno.idade = 20;

        // LEITURA: ponto "." sozinho le o valor atual do atributo
        // Aqui usamos o valor lido diretamente dentro do println
        System.out.println(objetoAluno.nome);
        System.out.println(objetoAluno.idade);

        // O ponto "." e o mesmo operador para escrever e para ler —
        // a diferenca e se ha "=" depois (escrita) ou nao (leitura).

    }

}
