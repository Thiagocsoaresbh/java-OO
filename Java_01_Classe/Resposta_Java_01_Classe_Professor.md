# Java 01 - Classe (o molde) - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
Java 01 - Classe criada (molde).
Ainda nao existe nenhum aluno de verdade.
```

**O que e uma classe?**

Uma classe e um molde que define quais atributos e metodos um objeto tera. Ela descreve a estrutura, mas nao e um objeto real.

**O que representa o arquivo `Aluno.java`?**

Contem a definicao da classe `Aluno` - o molde - com os atributos `nome` e `idade`. O nome do arquivo sempre corresponde ao nome da classe publica.

**Por que o arquivo `Principal.java` existe?**

Porque ele contem o metodo `main`, que e o ponto de entrada do programa. Sem ele, o Java nao sabe por onde comecar.

---

## Atividade 2 - Alterando a mensagem

**Saida esperada:**

```text
Estou aprendendo Java.
A classe Aluno ainda e apenas um molde.
```

---

## Atividade 3 - Criando uma nova classe

**Codigo esperado:**

```java
package Java_01_Classe;

public class Professor {
    public String nome;
    public String disciplina;
}
```

**O que essa nova classe representa?**

Um novo molde para criar objetos do tipo `Professor`.

**Quais sao os atributos dela?**

`nome` (String) e `disciplina` (String).

---

## Atividade 4 - Adicionando um atributo

**Codigo esperado:**

```java
package Java_01_Classe;

public class Aluno {
    public String nome;
    public int idade;
    public String turma;
}
```

**O que e um atributo?**

E uma caracteristica ou dado que pertence ao objeto - uma variavel declarada dentro da classe.

**O que o atributo `turma` representa?**

A turma a qual o aluno pertence, por exemplo '1A', '2B' ou 'Noite'.

---

## Atividade 5 - Criando erro proposital

**Saida esperada:**

```text
Java_01_Classe\Aluno.java:4: error: ';' expected
    public String nome
                      ^
1 error
```

**O que faltava no codigo?**

Faltava o ponto e virgula `;` ao final da declaracao do atributo.

**Por que o Java nao aceitou?**

Java exige ponto e virgula ao final de cada instrucao. Sem ele, a linha fica incompleta e o compilador nao consegue interpretar o codigo.

---

## Atividade 6 - Explicacao final

**O que e uma classe?**

Um molde que descreve a estrutura dos objetos.

**O que sao atributos?**

Variaveis declaradas dentro da classe que guardam as caracteristicas de cada objeto.

**Por que `Principal.java` possui o metodo `main`?**

Porque o `main` e o ponto de entrada - e o primeiro metodo que o Java executa.

**Por que `Aluno.java` nao executa sozinho?**

Porque a classe `Aluno` nao tem o metodo `main`. Ela apenas define o molde.

**O que voce aprendeu neste exercicio?**

Que classe define estrutura, atributos sao os dados dos objetos, e o `main` e obrigatorio para rodar um programa Java.

---
