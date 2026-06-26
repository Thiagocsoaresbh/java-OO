# Java 21 - JDBC Basico - Gabarito do Professor

---

## Atividade 1 - Preparacao e execucao

**Saida esperada:**

```text
=== Exercicio 21 - JDBC Basico ===

--- Conexao estabelecida ---
Conexao aberta: true

--- Criando a tabela com Statement ---
Tabela 'aluno' criada.

--- Inserindo objetos Aluno com PreparedStatement ---
Inserido: Ana
Inserido: Bruno
Inserido: Carla

--- Consultando com Statement + ResultSet ---
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Matricula: 2024002 | Nome: Bruno | Nota: 6.0
Matricula: 2024003 | Nome: Carla | Nota: 9.2
Observacao: o ResultSet devolve colunas soltas, NAO devolve objetos Aluno.

--- Atualizando nota do Bruno (PreparedStatement) ---
Linhas afetadas: 1

--- Removendo Carla ---
Linhas afetadas: 1

--- Consultando apos update e delete ---
Matricula: 2024001 | Nome: Ana | Nota: 8.5
Matricula: 2024002 | Nome: Bruno | Nota: 7.0

--- Por que evitar concatenar valores em SQL ---
SQL montado por concatenacao (NUNCA fazer isso): SELECT * FROM aluno WHERE matricula = 2024001 OR 1=1
Com PreparedStatement, esse mesmo valor seria tratado como dado, nunca como comando SQL.

=== Conclusao ===
Connection: abre e fecha a ligacao com o banco (use try-with-resources).
Statement: executa SQL fixo. PreparedStatement: executa SQL com parametros.
ResultSet: percorre linhas de um SELECT, mas devolve colunas, nao objetos.
PreparedStatement evita SQL Injection ao tratar valores como dados, nao codigo.
```

Obs.: a cada execucao, a tabela e recriada (`DROP TABLE IF EXISTS`), entao a saida e sempre igual.

---

## Atividade 2 - Connection

**O que e uma Connection?**

E o objeto que representa a ligacao ativa entre o programa Java e o banco de dados. Por ela passam todos os comandos SQL enviados e os resultados recebidos. Sem uma `Connection` aberta, nenhuma operacao no banco e possivel.

**O que significa a URL `jdbc:h2:./Java_21_JDBC/escola`?**

- `jdbc:` - protocolo JDBC (padrao para todas as URLs de conexao Java a bancos).
- `h2:` - identifica o driver/banco especifico (H2, nesse caso).
- `./Java_21_JDBC/escola` - caminho relativo do arquivo de banco de dados (o H2 cria `escola.mv.db` nesse local).

**Por que usar try-with-resources na conexao?**

Porque `Connection` implementa `AutoCloseable`. Usando `try (Connection conexao = ...)`, o Java garante que `conexao.close()` sera chamado automaticamente ao final do bloco, mesmo se ocorrer uma excecao — evitando conexoes "esquecidas" abertas, que consomem recursos do banco.

---

## Atividade 3 - Statement vs PreparedStatement

**Diferenca entre Statement e PreparedStatement?**

`Statement` executa SQL fixo, sem parametros — o texto inteiro do comando e definido de uma vez. `PreparedStatement` executa SQL com parametros (`?`), que sao preenchidos depois com metodos como `setInt()`, `setString()`. O `PreparedStatement` tambem e pre-compilado pelo banco, o que pode trazer ganho de performance em execucoes repetidas.

**O que os `?` representam?**

Marcadores de posicao (placeholders) para valores que serao definidos em tempo de execucao, na ordem em que aparecem (1, 2, 3...).

**Por que PreparedStatement e mais seguro?**

Porque o valor passado em `setString()`/`setInt()` e tratado sempre como **dado**, nunca interpretado como parte do comando SQL — mesmo que o valor contenha caracteres especiais como aspas ou `OR 1=1`. Isso elimina o risco de SQL Injection.

---

## Atividade 4 - ResultSet

**O que faz `rs.next()`?**

Avanca o cursor do `ResultSet` para a proxima linha do resultado e retorna `true` se havia uma linha disponivel, ou `false` se chegou ao fim. Antes da primeira chamada de `next()`, o cursor esta posicionado ANTES da primeira linha.

**O ResultSet devolve objetos Aluno?**

Nao. Ele devolve colunas individuais (acessadas por `getInt()`, `getString()`, `getDouble()`, etc., por nome ou indice da coluna). Transformar essas colunas em um objeto `Aluno` e um trabalho manual que o programador precisa fazer (e e exatamente o que o exercicio 22 automatiza com um DAO).

**O que aconteceria ao chamar `getString()` antes do primeiro `next()`?**

Lancaria uma excecao (`SQLException`), pois o cursor ainda nao esta posicionado em nenhuma linha valida.

---

## Atividade 5 - CRUD completo

- Criar a tabela: `CREATE TABLE aluno (matricula INT PRIMARY KEY, nome VARCHAR(100), nota DOUBLE)`
- Inserir um registro: `INSERT INTO aluno (matricula, nome, nota) VALUES (?, ?, ?)`
- Consultar registros: `SELECT matricula, nome, nota FROM aluno ORDER BY matricula`
- Atualizar um registro: `UPDATE aluno SET nota = ? WHERE matricula = ?`
- Remover um registro: `DELETE FROM aluno WHERE matricula = ?`

**O que significa CRUD?**

Create, Read, Update, Delete — as quatro operacoes basicas de persistencia de dados, presentes em praticamente todo sistema que usa banco de dados.

---

## Atividade 6 - SQL Injection

**O que aconteceria se o SQL fosse executado? Por que `OR 1=1` e perigoso?**

A condicao `WHERE matricula = 2024001 OR 1=1` seria sempre verdadeira (`1=1` e sempre verdade), retornando **todos** os registros da tabela, nao apenas o da matricula informada. Em um sistema real, esse tipo de manipulacao poderia expor dados de todos os usuarios, ou em comandos de UPDATE/DELETE, alterar/apagar toda a tabela.

**Como o PreparedStatement evita isso?**

Porque o valor informado pelo usuario e enviado separadamente do comando SQL, atraves do protocolo do banco — o banco sabe exatamente onde comeca e termina o dado, e nunca o interpreta como parte da logica do comando. Por isso `setInt()`/`setString()` nunca permitem que um valor "escape" para alterar a estrutura da consulta.

---

## Atividade 7 - Perguntas finais

**Qual e a ordem tipica de uso do JDBC?**

1. **Conectar**: `DriverManager.getConnection(url, usuario, senha)` — abre a `Connection`.
2. **Executar SQL**: criar um `Statement` ou `PreparedStatement` e chamar `execute()`, `executeQuery()` ou `executeUpdate()`.
3. **Ler resultado**: se for um `SELECT`, percorrer o `ResultSet` com `next()` e os metodos `getXxx()`.
4. **Fechar conexao**: liberar os recursos (`close()`), idealmente automatico via try-with-resources.

**Por que o H2 nao exige instalar um servidor separado?**

Porque o H2 pode rodar em **modo embarcado (embedded)**, isto e, dentro do mesmo processo Java do programa, lendo e escrevendo diretamente em um arquivo local (`escola.mv.db`). Nao ha processo de servidor rodando em segundo plano nem configuracao de rede — basta o `.jar` do driver no classpath.

---