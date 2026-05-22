package Java_07_Construtores;

public class Aluno {

    public String nome;
    public int idade;

    // CONSTRUTOR: metodo especial executado automaticamente pelo "new".
    // Regras: mesmo nome da classe, sem tipo de retorno (nem void).

    // Construtor SEM parametros (construtor padrao).
    // Mesmo sem escrever, o Java cria este construtor implicitamente.
    // Aqui o tornamos explicito para deixar a existencia visivel.
    public Aluno() {
        // Corpo vazio: os atributos ficam com valores padrao (null e 0)
    }

    // SOBRECARGA (overloading): duas versoes do mesmo construtor com assinaturas diferentes.
    // Java escolhe qual chamar baseado nos argumentos passados no "new".
    //
    // Construtor COM parametros: inicializa os atributos ja na criacao.
    // "String nome" e "int idade" sao PARAMETROS: variaveis locais que recebem os valores do chamador.
    public Aluno(String nome, int idade) {

        // "this" referencia o OBJETO que esta sendo criado agora.
        // "this.nome" -> atributo do objeto  |  "nome" (sem this) -> parametro recebido.
        // Sem "this", o Java nao saberia distinguir os dois, pois tem o mesmo nome.
        this.nome = nome;
        this.idade = idade; // mesma logica: this.idade = atributo, idade = parametro
    }

}
