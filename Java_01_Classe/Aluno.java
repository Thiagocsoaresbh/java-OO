package Java_01_Classe; // "package" organiza arquivos em grupos (pacotes), evita conflito de nomes

// "public"  -> visivel para qualquer outra classe do projeto
// "class"   -> palavra-chave que declara um molde (nao cria nada ainda)
// "Aluno"   -> nome do molde; por convencao classes comecam com maiuscula
public class Aluno {

    // Atributos: sao as caracteristicas que todo objeto deste molde vai ter
    // "public" -> pode ser lido e alterado de fora da classe
    // "String" -> tipo de dado: texto (cadeia de caracteres)
    // "nome"   -> nome do atributo; por convencao comeca com minuscula
    public String nome;

    // "int" -> tipo de dado: numero inteiro (sem casas decimais)
    public int idade;

    // Por enquanto a classe so define o molde.
    // Nenhum aluno de verdade existe ainda — isso vem no proximo exercicio.

}
