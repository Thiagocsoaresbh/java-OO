# Java 21 - JDBC Basico

## Objetivo

Entender os recursos do Java para acessar um banco de dados relacional: `Connection`, `Statement`,
`PreparedStatement` e `ResultSet`. Usamos o **H2**, um banco de dados que roda embutido dentro do
proprio programa Java — sem precisar instalar nenhum servidor.

## Arquivos

- `Aluno.java` - classe com nome, matricula e nota (mesma estrutura dos exercicios anteriores).
- `Principal.java` - conecta no banco, cria a tabela, insere, consulta, atualiza e remove registros.
- `Questoes_Java_21_JDBC.md` - enunciado e espaco para suas respostas.

## Preparacao (uma vez so) - baixando o driver JDBC do H2

O Java sabe falar com bancos de dados, mas precisa de um **driver** especifico para cada banco.
Para o H2, baixe o `.jar` do driver:

1. Acesse: https://repo1.maven.org/maven2/com/h2database/h2/
2. Entre na pasta da versao mais recente (ex: `2.2.224`) e baixe o arquivo `h2-2.2.224.jar`.
3. Crie uma pasta `lib` na **raiz do repositorio** (mesmo nivel deste README) e coloque o `.jar` dentro:

```text
Java-OO/
├── lib/
│   └── h2-2.2.224.jar
├── Java_21_JDBC/
└── ...
```

A pasta `lib/` esta no `.gitignore` — o `.jar` fica so na sua maquina, nao e enviado ao repositorio.

## Como executar (Windows)

A partir da **raiz do repositorio**:

```bat
javac -cp "lib/*" Java_21_JDBC\Aluno.java Java_21_JDBC\Principal.java
java -cp ".;lib/*" Java_21_JDBC.Principal
```

Ao executar, o H2 cria automaticamente os arquivos `Java_21_JDBC\escola.mv.db` (o banco de dados em si).
Esses arquivos tambem sao ignorados pelo Git — pode rodar o programa varias vezes sem se preocupar.

## Observacao sobre o `-cp "lib/*"`

O `*` faz o Java carregar **todos** os `.jar` da pasta `lib/` automaticamente, sem precisar saber
o nome exato do arquivo do driver.