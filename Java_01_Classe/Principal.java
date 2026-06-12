package Java_01_Classe;

// "Principal" e o nome desta classe — poderia ser qualquer nome,
// mas por convencao chamamos de Principal a classe que contem o main.
public class Principal {

    // Todo programa Java precisa de um ponto de entrada: o metodo main.
    // A JVM (maquina virtual Java) procura exatamente essa assinatura para iniciar.
    //
    // "public"      -> a JVM precisa enxergar este metodo de fora
    // "static"      -> existe sem precisar criar um objeto de Principal primeiro
    // "void"        -> nao retorna nenhum valor ao terminar
    // "main"        -> nome obrigatorio reconhecido pela JVM como inicio do programa
    // "String[] args" -> array de textos que pode receber argumentos da linha de comando
    public static void main(String[] args) {

        // System        -> classe utilitaria do Java que da acesso ao ambiente
        // System.out    -> canal de saida padrao (o terminal)
        // println(...)  -> imprime o texto e pula uma linha ("print line")
        System.out.println("Java 01 - Classe criada (molde).");
        System.out.println("Ainda nao existe nenhum aluno de verdade.");

    }

}
