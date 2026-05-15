# Respostas — Java 01 (Classe) — Gabarito do Professor

---

## Atividade 1 — Executando o código

**Saída obtida no terminal:**

```text
Java 01 - Classe criada (molde).
Ainda nao existe nenhum aluno de verdade.
```

**O que é uma classe?**

Uma classe é um "molde" que define quais atributos (e depois métodos) um objeto terá. Ela descreve a estrutura, mas não é um objeto real.

**O que representa o arquivo `Aluno.java`?**

Contém a definição da classe `Aluno` — o molde — com os atributos `nome` e `idade`. O nome do arquivo sempre corresponde ao nome da classe pública dentro dele, e ambos começam com letra maiúscula.

**Por que o arquivo `Principal.java` existe?**

Porque ele contém o método `main`, que é o ponto de entrada do programa. Sem ele, o Java não sabe por onde começar a executar.

---

## Atividade 2 — Alterando a mensagem

**Nova saída obtida no terminal:**

```text
Estou aprendendo Java.
A classe Aluno ainda e apenas um molde.
```

**O que você observou?**

Apenas o texto impresso mudou. A estrutura do programa — a classe, o método `main`, a ausência de objetos — continua exatamente a mesma.

---

## Atividade 3 — Criando uma nova classe

**Código criado (`Professor.java`):**

```java
package Java_01_Classe;

public class Professor {
    public String nome;
    public String disciplina;
}
```

**O que essa nova classe representa?**

Um novo molde para criar objetos do tipo `Professor`.

**Quais são os atributos dela?**

`nome` (String) e `disciplina` (String).

---

## Atividade 4 — Adicionando um atributo

**Nova versão do `Aluno.java`:**

```java
package Java_01_Classe;

public class Aluno {
    public String nome;
    public int idade;
    public String turma;
}
```

**O que é um atributo?**

É uma característica ou dado que pertence ao objeto — uma variável declarada dentro da classe que cada instância terá com seu próprio valor.

**O que o atributo `turma` representa?**

A turma à qual o aluno pertence, por exemplo `"1A"`, `"2B"` ou `"Noite"`.

---

## Atividade 5 — Criando erro proposital

**Mensagem de erro obtida:**

```text
Java_01_Classe\Aluno.java:4: error: ';' expected
    public String nome
                      ^
1 error
```

**O que faltava no código?**

O ponto e vírgula `;` ao final da declaração do atributo.

**Por que o Java não aceitou?**

Java exige ponto e vírgula ao final de cada instrução e declaração. Sem ele, a linha fica incompleta e o compilador não consegue interpretar o código corretamente.

---

## Atividade 6 — Explicação final

**1. O que é uma classe?**

Um molde (tipo) que descreve a estrutura dos objetos: quais dados eles guardam e, mais para frente, quais ações podem realizar.

**2. O que são atributos?**

São variáveis declaradas dentro da classe que guardam as características de cada objeto — por exemplo, `nome`, `idade` e `turma` de um `Aluno`.

**3. Por que `Principal.java` possui o método `main`?**

Porque o `main` é o ponto de entrada do programa. É o primeiro método que o Java executa ao rodar a aplicação.

**4. Por que `Aluno.java` não executa sozinho?**

Porque a classe `Aluno` não tem o método `main`. Ela apenas define o molde. Para executar algo, é necessário um arquivo com `main`, como o `Principal.java`.

**5. O que você aprendeu neste exercício?**

Que uma classe é um molde, atributos são os dados que cada objeto terá, e o método `main` é obrigatório para rodar um programa Java. Também aprendemos que erros de sintaxe como a falta de `;` impedem a compilação.
