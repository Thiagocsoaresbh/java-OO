package Java_08_Metodos;

public class Aluno {

    public String nome;
    public int idade;

    // Construtor com parametros (aprendido no Exercicio 07)
    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // ========== METODOS ==========
    // Metodo: bloco de codigo com nome que define um COMPORTAMENTO do objeto.
    // Estrutura: [modificador] [tipo de retorno] [nome] ([parametros]) { corpo }

    // "void" -> o metodo executa algo mas NAO devolve nenhum valor ao chamador.
    // Sem parametros: nao precisa receber nada de fora para funcionar.
    public void apresentar() {
        // Dentro do metodo, "nome" e "idade" sem "this" funcionam pois nao ha
        // parametros com o mesmo nome aqui — o Java resolve para os atributos do objeto.
        System.out.println("Ola, meu nome e " + nome + " e tenho " + idade + " anos.");
    }

    // "void" com PARAMETRO: o chamador passa um valor que so existe dentro deste metodo.
    // "int nota" -> parametro local, valido apenas enquanto o metodo executa.
    public void fazer(int nota) {
        System.out.println(nome + " fez um teste com nota " + nota);
    }

    // Tipo de retorno "int": o metodo calcula algo e DEVOLVE um inteiro ao chamador.
    // "return" encerra o metodo e envia o valor de volta.
    public int calcularAnoNascimento() {
        int anoAtual = 2026;          // variavel LOCAL: so existe dentro deste metodo
        int anoNascimento = anoAtual - idade;
        return anoNascimento;         // devolve o resultado para quem chamou
    }

    // Tipo de retorno "String": devolve texto.
    // "if / else" -> estrutura condicional: executa um bloco OU outro dependendo da condicao.
    public String obterCategoria() {
        if (idade < 18) {       // se a condicao for verdadeira, executa este bloco
            return "Menor de idade";
        } else {                // caso contrario, executa este
            return "Maior de idade";
        }
        // O metodo sempre retorna algo — o compilador exige que todo caminho tenha "return".
    }

    // Parametro E retorno: recebe um valor, opera sobre ele e devolve o resultado.
    public int multiplicarIdade(int multiplicador) {
        int resultado = idade * multiplicador; // "*" e o operador de multiplicacao
        return resultado;
    }

    // Metodo chamando outros metodos da mesma classe.
    // "calcularAnoNascimento()" e "obterCategoria()" sao chamados sem "this"
    // pois o Java assume que sao metodos do proprio objeto.
    public void exibirInfo() {
        System.out.println("===== Informacoes do Aluno =====");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Ano de nascimento (estimado): " + calcularAnoNascimento());
        System.out.println("Categoria: " + obterCategoria());
        System.out.println("================================");
    }

}
