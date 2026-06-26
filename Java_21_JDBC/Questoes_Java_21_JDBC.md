# Java 21 - JDBC Basico - Questoes

---

## Atividade 1 - Preparacao e execucao

**O que fazer:**

- Baixe o driver do H2 e coloque em `lib/` conforme o `README.md`.
- Compile e execute o `Principal.java`.

**Cole a saida completa do terminal abaixo.**

```text

```

---

## Atividade 2 - Connection

**Analise o trecho:**

```java
try (Connection conexao = DriverManager.getConnection(URL, "sa", "")) {
    ...
}
```

**O que e uma `Connection` em JDBC?**

R.

**O que significa a URL `jdbc:h2:./Java_21_JDBC/escola`? Identifique as partes (protocolo, banco, caminho).**

R.

**Por que usamos `try (...)` (try-with-resources) para abrir a conexao?**

R.

---

## Atividade 3 - Statement vs PreparedStatement

**Analise os dois trechos:**

```java
// Statement
Statement stmt = conexao.createStatement();
stmt.execute("CREATE TABLE aluno (...)");

// PreparedStatement
PreparedStatement ps = conexao.prepareStatement("INSERT INTO aluno (matricula, nome, nota) VALUES (?, ?, ?)");
ps.setInt(1, a.getMatricula());
ps.setString(2, a.getNome());
ps.setDouble(3, a.getNota());
ps.executeUpdate();
```

**Qual e a diferenca entre `Statement` e `PreparedStatement`?**

R.

**O que os `?` representam no SQL do `PreparedStatement`?**

R.

**Por que `PreparedStatement` e mais seguro que concatenar valores diretamente no SQL?**

R.

---

## Atividade 4 - ResultSet

**Analise o trecho:**

```java
ResultSet rs = stmt.executeQuery("SELECT matricula, nome, nota FROM aluno ORDER BY matricula");
while (rs.next()) {
    System.out.println(rs.getInt("matricula") + " " + rs.getString("nome"));
}
```

**O que faz o metodo `rs.next()`? O que ele retorna?**

R.

**O ResultSet devolve objetos `Aluno` prontos? O que ele devolve de fato?**

R.

**O que aconteceria se chamassemos `rs.getString("nome")` ANTES de chamar `rs.next()` pela primeira vez?**

R.

---

## Atividade 5 - CRUD completo

**Liste, na ordem em que aparecem no `Principal.java`, os comandos SQL usados para:**

- Criar a tabela: 
- Inserir um registro: 
- Consultar registros: 
- Atualizar um registro: 
- Remover um registro: 

**O que significa CRUD?**

R.

---

## Atividade 6 - SQL Injection

**Analise o trecho final do `Principal.java`:**

```java
String entradaMaliciosa = "2024001 OR 1=1";
String sqlVulneravel = "SELECT * FROM aluno WHERE matricula = " + entradaMaliciosa;
```

**O que aconteceria se esse SQL fosse de fato executado? Por que o `OR 1=1` e perigoso?**

R.

**Como o `PreparedStatement` evita esse problema?**

R.

---

## Atividade 7 - Perguntas finais

**Qual e a ordem tipica de uso do JDBC: conectar, executar SQL, ler resultado, fechar conexao? Explique cada etapa.**

R.

**Por que o H2 usado aqui nao exige instalar um servidor de banco de dados separado?**

R.

---