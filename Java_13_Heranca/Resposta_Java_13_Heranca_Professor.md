# Java 13 - Heranca - Gabarito do Professor

---

## Atividade 1 - Executando o codigo

**Saida esperada:**

```text
=== Exercicio 13 - Heranca ===

--- Objeto Pessoa ---
Pessoa: Carlos, 45 anos.
Nome : Carlos
Idade: 45

--- Objeto Aluno (herda de Pessoa) ---
Pessoa: Maria, 20 anos.
Nome (herdado) : Maria
Idade (herdada): 20
Matricula: 2024001

--- Verificando o tipo com instanceof ---
aluno1 instanceof Aluno : true
aluno1 instanceof Pessoa: true
pessoa1 instanceof Aluno: false

=== Conclusao ===
Aluno herda de Pessoa: tem tudo de Pessoa + o que e seu.
super() no construtor inicializa a parte herdada.
Todo Aluno E UMA Pessoa, mas nem toda Pessoa e um Aluno.
```

---

## Atividade 2 - Lendo o codigo

**O que significa `extends Pessoa`?**

Que `Aluno` e uma subclasse de `Pessoa`. Ela herda todos os atributos e metodos nao-privados de `Pessoa`.

**O que faz `super(nome, idade)`?**

Chama o construtor da superclasse `Pessoa`, inicializando os atributos `nome` e `idade` que foram herdados.

**Por que `protected` e nao `private`?**

`private` bloquearia o acesso mesmo nas subclasses. `protected` permite que `Aluno` (e outras subclasses) acessem diretamente `nome` e `idade` sem precisar de getters.

---

## Atividade 3 - Atributos e metodos herdados

**Atributos herdados de `Pessoa`:** `nome` (String), `idade` (int).

**Atributos proprios de `Aluno`:** `matricula` (int).

**Metodos herdados de `Pessoa`:** `getNome()`, `getIdade()`, `apresentar()`.

**Metodos proprios de `Aluno`:** `getMatricula()`, `exibirMatricula()`.

---

## Atividade 4 - instanceof

**Por que `aluno1 instanceof Pessoa` e `true`?**

Porque `Aluno extends Pessoa`: todo Aluno e tambem uma Pessoa. A heranca cria uma relacao "is-a".

**Por que `pessoa1 instanceof Aluno` e `false`?**

Porque `pessoa1` foi criada como `Pessoa` pura. Nem toda Pessoa e um Aluno — a relacao e unidirecional.

**O que a relacao "is-a" significa?**

Que a subclasse e um tipo especializado da superclasse. Um `Aluno` e uma `Pessoa`, assim como um `Cachorro` e um `Animal`.

---

## Atividade 5 - Experimentando

**Exemplo de `Professor.java`:**

```java
package Java_13_Heranca;

public class Professor extends Pessoa {
    private String disciplina;

    public Professor(String nome, int idade, String disciplina) {
        super(nome, idade);
        this.disciplina = disciplina;
    }

    public String getDisciplina() { return disciplina; }
}
```

**Saida adicional esperada:**
```text
Pessoa: Sergio, 40 anos.
```

---

## Atividade 6 - Perguntas finais

**O que e heranca?** Mecanismo que permite uma classe reutilizar atributos e metodos de outra, formando uma hierarquia.

**Palavra-chave:** `extends`.

**O que faz `super()`?** Chama o construtor da superclasse, permitindo inicializar a parte herdada do objeto.

**`private` vs `protected` na heranca:** `private` = acessivel somente na propria classe. `protected` = acessivel na propria classe e em todas as subclasses.

**Java permite heranca multipla?** Nao. Uma classe so pode ter uma unica superclasse (`extends` de uma so). Para multipla "heranca de contrato", Java usa interfaces.

---
