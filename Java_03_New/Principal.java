package Java_03_New;

public class Principal {

    public static void main(String[] args) {

        // Cada "new Aluno()" cria um objeto INDEPENDENTE na memoria.
        // "aluno1" e "aluno2" sao variaveis diferentes que apontam para espacos diferentes.
        // Mudar um nao afeta o outro.
        Aluno aluno1 = new Aluno();

        // Atividade 1: execute sem alterar nada e observe o endereco impresso.
        // Nas proximas atividades voce vai criar mais objetos e comparar os enderecos.
        System.out.println("Exercicio 03 - Criacao de multiplos objetos.");

        // Cada objeto tem um endereco unico — por isso os valores impressos diferem
        System.out.println(aluno1);

    }

}
